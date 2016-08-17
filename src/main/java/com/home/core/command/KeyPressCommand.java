package com.home.core.command;

import com.home.core.Keys;

import java.awt.*;

/**
 * Created by igor.bogdanov on 17.08.2016.
 */
public class KeyPressCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length > 1) {
            try {
                Robot robot = new Robot();
                robot.keyPress(Keys.valueOf(args[1]).getCode());
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }
}
