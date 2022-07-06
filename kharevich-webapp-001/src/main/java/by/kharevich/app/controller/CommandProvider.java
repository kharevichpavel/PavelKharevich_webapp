package by.kharevich.app.controller;

import java.util.HashMap;
import java.util.Map;

import by.kharevich.app.controller.impl.DoLogination;
import by.kharevich.app.controller.impl.GoToLoginationPageCommand;
import by.kharevich.app.controller.impl.GoToMainAfterRegistrationCommand;
import by.kharevich.app.controller.impl.GoToMainPageCommand;
import by.kharevich.app.controller.impl.GoToRegistrationPageCommand;

public class CommandProvider {
	private Map<CommandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put(CommandName.GO_TO_LOGINATION_PAGE, new GoToLoginationPageCommand());
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPageCommand());
		commands.put(CommandName.DO_LOGINATION, new DoLogination());
		commands.put(CommandName.GO_TO_MAIN_PAGE, new GoToMainPageCommand());
		commands.put(CommandName.GO_TO_MAIN_AFTER_REGISTRATION, new GoToMainAfterRegistrationCommand());
		
		
	}
	
	
	public Command getCommand(String name) {
		CommandName  commandName = CommandName.valueOf(name.toUpperCase());
		Command command = commands.get(commandName);
		return command;
	}

}
