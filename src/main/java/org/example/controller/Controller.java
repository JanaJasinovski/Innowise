package org.example.controller;

import org.example.command.Command;
import org.example.handler.CommandHandler;
import org.example.handler.ParamsHandler;
import org.example.handler.TypeHandler;
import org.example.params.CommandParams;
import org.example.view.View;

public class Controller {
    View view = new View();
    CommandHandler commandHandler = new CommandHandler();
    ParamsHandler paramsHandler = new ParamsHandler();
    TypeHandler typeHandler = new TypeHandler();

    public void execute() throws Exception {
        int number;
        do {
            view.menu();
            number = view.getNumberOfTask();
            CommandParams commandParams = paramsHandler.getParam(number).generateParam();
            Command<?> service = commandHandler.getService(number);
            String convert = typeHandler.getHandler(service.getType()).convert(service.execute(commandParams));
            view.print(convert);
        } while (number != 26);
    }
}


