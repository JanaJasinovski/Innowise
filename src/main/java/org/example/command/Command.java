package org.example.command;

import org.example.params.CommandParams;
import org.example.result.CommandResult;

public interface Command<T extends CommandResult> {
    T execute(CommandParams commandParams) throws Exception;
    Class<T> getType();
}

