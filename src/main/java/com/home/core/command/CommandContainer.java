package com.home.core.command;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by igor.bogdanov on 17.08.2016.
 */
public class CommandContainer {
    private Map<String, Command> commandMap;

    public CommandContainer() {
        commandMap = new HashMap<>();
        commandMap.put("open", new OpenWebCommand());
        commandMap.put("key", new KeyPressCommand());
    }

    public Command getCommand(String command) {
        return commandMap.get(command);
    }
}
