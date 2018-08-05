package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BotClient extends Client {

    public class BotSocketThread extends SocketThread
    {

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException
        {
            BotClient.this.sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }


        @Override

        protected void processIncomingMessage(String message)
        {
            ConsoleHelper.writeMessage(message);

            SimpleDateFormat format = null;

            if(message.contains(": "))
            {
                String[] args = message.split(": ");
                if(args.length == 2 & args[1] != null)
                {
                switch (args[1])
                {
                    case "дата":
                        format = new SimpleDateFormat("d.MM.YYYY");
                        break;
                    case "день":
                        format = new SimpleDateFormat("d");
                        break;
                    case "месяц":
                        format = new SimpleDateFormat("MMMM");
                        break;
                    case "год":
                        format = new SimpleDateFormat("YYYY");
                        break;
                    case "время":
                        format = new SimpleDateFormat("H:mm:ss");
                        break;
                    case "час":
                        format = new SimpleDateFormat("H");
                        break;
                    case "минуты":
                        format = new SimpleDateFormat("m");
                        break;
                    case "секунды":
                        format = new SimpleDateFormat("s");
                        break;
                }
                if(format != null)
                {
                    sendTextMessage(String.format("Информация для %s: %s",args[0],format.format(Calendar.getInstance().getTime())));
                }
                }
            }

        }


    }


    @Override
    protected SocketThread getSocketThread()
    {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole()
    {
        return false;
    }

    @Override
    protected String getUserName()
    {
        String botName = "date_bot_" + ((int) (Math.random() * 100));
        return botName;

    }

    public static void main(String[] args) {
        BotClient bot = new BotClient();
        bot.run();
    }

}
