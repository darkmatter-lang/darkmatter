package me.anthonyw.darkmatter.jul;

import java.text.MessageFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class ConsoleFormatter extends Formatter {

	private static final MessageFormat messageFormat = new MessageFormat("{3,date,HH:mm:ss.SSS} [{2}/{1}] {4}");

	public ConsoleFormatter() {
		super();
	}

	@Override
	public String format(LogRecord record) {
		String level = record.getLevel().getName();
		
		if (record.getLevel() == Level.SEVERE) {
			level = "ERROR";
		} else if (record.getLevel() == Level.WARNING) {
			level = "WARN";
		} else if (record.getLevel() == Level.ALL) {
			level = "ERROR";
		} else if (record.getLevel() == Level.CONFIG) {
			level = "DEBUG";
		} else if (record.getLevel() == Level.FINE) {
			level = "DEBUG";
		} else if (record.getLevel() == Level.FINER) {
			level = "TRACE";
		} else if (record.getLevel() == Level.FINEST) {
			level = "TRACE";
		}
		
		Object[] arguments = new Object[6];
		arguments[0] = record.getLoggerName();
		arguments[1] = level;
		arguments[2] = Thread.currentThread().getName();
		arguments[3] = new Date(record.getMillis());
		arguments[4] = record.getMessage();
		arguments[5] = record.getSourceMethodName();
		return messageFormat.format(arguments);
	}
}
