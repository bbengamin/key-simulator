package com.home.core.command;

import java.awt.*;
import java.net.URI;

/**
 * Created by igor.bogdanov on 17.08.2016.
 */
public class OpenWebCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length > 1){
            try {
                Desktop.getDesktop().browse(URI.create(args[1]));
            } catch (java.io.IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
