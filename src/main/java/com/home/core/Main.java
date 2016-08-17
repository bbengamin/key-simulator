package com.home.core;

import com.home.core.command.Command;
import com.home.core.command.CommandContainer;

/**
 * Created by igor.bogdanov on 17.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            CommandContainer commandContainer = new CommandContainer();
            Command command = commandContainer.getCommand(args[0]);
            command.execute(args);
        }
    }
}
