package com.javarush.task.task31.task3110.command;

import com.javarush.task.task30.task3008.ConsoleHelper;

public class ZipCreateCommand extends ZipCommand{
    @Override
    public void execute() throws Exception
    {
        ConsoleHelper.writeMessage("Создание архива.");

    }
}
