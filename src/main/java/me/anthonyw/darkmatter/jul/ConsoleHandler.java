package me.anthonyw.darkmatter.jul;

import java.util.logging.ErrorManager;
import java.util.logging.Handler;
import java.util.logging.Level;

import me.anthonyw.darkmatter.cli.ConsoleColors;

public class ConsoleHandler extends Handler {
	
	public ConsoleHandler() {
		super();
		this.setFormatter(new ConsoleFormatter());
	}
	
	@Override
	public void publish(java.util.logging.LogRecord record) {
		
		if (getFormatter() == null) {
			setFormatter(new java.util.logging.SimpleFormatter());
		}

		try {
			final String message = getFormatter().format(record);
			if (record.getLevel().intValue() == Level.WARNING.intValue()) {
				System.err.printf("%s%s%s%n", ConsoleColors.YELLOW_BRIGHT, message.toString(), ConsoleColors.RESET);
			} else if (record.getLevel().intValue() > Level.WARNING.intValue()) {
				System.err.printf("%s%s%s%n", ConsoleColors.RED_BRIGHT, message.toString(), ConsoleColors.RESET);
			} else {
				System.out.printf("%s%s%n", message.toString(), ConsoleColors.RESET);
			}
		} catch (Exception exception) {
			reportError(null, exception, ErrorManager.FORMAT_FAILURE);
		}
	}

	@Override
	public void close() {
		flush();
	}

	@Override
	public void flush() {
		
	}

}
