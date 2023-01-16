package org.example.handler;

import org.example.command.Command;
import org.example.command.impl.*;
import org.example.result.CommandResult;

import java.util.HashMap;
import java.util.Map;

public class CommandHandler {
    private final Map<Integer, Command<? extends CommandResult>> map;

    public CommandHandler() {
        this.map = new HashMap<>();
    }

    private Map<Integer, Command<? extends CommandResult>> getMap() {
        map.put(1, new FirstCommand());
        map.put(2, new SecondCommand());
        map.put(3, new ThirdCommand());
        map.put(4, new FourthCommand());
        map.put(5, new FifthCommand());
        map.put(6, new SixthCommand());
        map.put(7, new SeventhCommand());
        map.put(8, new EighthCommand());
        map.put(9, new NinthCommand());
        map.put(10, new TenthCommand());
        map.put(11, new EleventhCommand());
        map.put(12, new TwelfthCommand());
        map.put(13, new ThirteenthCommand());
        map.put(14, new FourteenthCommand());
        map.put(15, new FifteenthCommand());
        map.put(16, new SixteenthCommand());
        map.put(17, new SeventeenthCommand());
        map.put(18, new EighteenthCommand());
        map.put(19, new NineteenthCommand());
        map.put(20, new TwentiethCommand());
        map.put(21, new TwentyFirstCommand());
        map.put(22, new TwentySecondCommand());
        map.put(23, new TwentyThirdCommand());
        map.put(24, new TwentyFourthCommand());
        return map;
    }

    public void addToMap(int mapKey, Command<?> service) {
        map.put(mapKey, service);
    }

    public Command<?> getService(int number) {
        return getMap().get(number);
    }
}

