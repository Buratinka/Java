package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server
{
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException {
        ConsoleHelper consoleHelper = new ConsoleHelper();
        ServerSocket serverSocket = new ServerSocket(consoleHelper.readInt());
        System.out.println("Server is running");

            try
            {
                while(true)
                {
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);

                handler.start();
                }
                
            }
            catch(Exception ex)
            {
                System.out.println("Catch exception");
                serverSocket.close();
            }

    }


    public static void sendBroadcastMessage(Message message)
    {
        for(Connection con : connectionMap.values())
        {
            try
            {
                con.send(message);
            }catch(IOException ex)
            {
                System.out.println("Error to send message");
            }
        }
    }

    private static class Handler extends Thread
    {
        private Socket socket;

        public Handler(Socket socket)
        {
            this.socket = socket;
        }


        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {

            while (true)
            {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message answer = connection.receive();

                if (answer.getType() == MessageType.USER_NAME)
                {
                    if (!answer.getData().isEmpty())
                    {
                        if (!connectionMap.containsKey(answer.getData()))
                        {
                            connectionMap.put(answer.getData(), connection);
                            connection.send(new Message(MessageType.NAME_ACCEPTED));
                            return answer.getData();
                        }
                    }
                }
            }
        }


        private void sendListOfUsers(Connection connection, String userName) throws IOException {

            for(Map.Entry<String, Connection> map : connectionMap.entrySet())
            {
                String name;

                if(userName != (name = map.getKey()))
                {
                connection.send(new Message(MessageType.USER_ADDED,name));
                }
            }

        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {

            while(true)
            {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT)
                {
                    StringBuilder sb = new StringBuilder();

                    sb.append(userName+": "+message.getData());

                    sendBroadcastMessage(new Message(MessageType.TEXT,sb.toString()));

                } else if(message.getType() != MessageType.TEXT)
                {
                    ConsoleHelper.writeMessage("It is not a message");
                }
            }

        }


        public void run() {


            if(socket != null && socket.getRemoteSocketAddress() != null)
            {
                ConsoleHelper.writeMessage("Connection with remote address is established. " + socket.getRemoteSocketAddress() );
            }

            String userName = null;

            try (Connection connection = new Connection(socket))
            {
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED,userName));
                sendListOfUsers(connection,userName);
                serverMainLoop(connection,userName);

            }catch (IOException | ClassNotFoundException ex)
            {
                ConsoleHelper.writeMessage("Error to communicate data to remote address.");
            }finally
            {
                if(userName != null)
                {
                    connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED,userName));
                }
                ConsoleHelper.writeMessage("Connection of remote address is closed.");

            }



        }

    }




}
