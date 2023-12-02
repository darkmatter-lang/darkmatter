package me.anthonyw.darkmatter;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

import org.fusesource.jansi.AnsiConsole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = Darkmatter.NAME, mixinStandardHelpOptions = true, version = Darkmatter.VERSION, description = "Darkmatter compiler.")
public class Main implements Callable<Integer> {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	private int threads = Runtime.getRuntime().availableProcessors();

	@Parameters(index = "0", description = "Darkmatter source file.")
	private File[] inputFile;

	@Option(names = { "-o", "--output-file" }, description = "Output binary.")
	private String outputFile;

	@Option(names = { "-t", "--threads" }, defaultValue = "-1", description = "Number of threads to use when processing. (default # of cores)")
	private void setThreads(int threads) {
		if (threads > 0) {
			this.threads = threads;
		}
	}

	@Option(names = { "-l", "--log-level" }, defaultValue = "INFO", description = "Set the default logger level. (default INFO)")
	private void setLogLevel(String level) {

		java.util.logging.Level julLevel = java.util.logging.Level.INFO;

		switch (level.toUpperCase()) {
		case "TRACE":
			julLevel = java.util.logging.Level.FINEST;
			break;
		case "DEBUG":
			julLevel = java.util.logging.Level.CONFIG;
			break;
		case "INFO":
			julLevel = java.util.logging.Level.INFO;
			break;
		case "WARN":
			julLevel = java.util.logging.Level.WARNING;
			break;
		case "ERROR":
			julLevel = java.util.logging.Level.SEVERE;
			break;
		default:
			System.err.println("Log level must be either: TRACE, DEBUG, INFO, WARN, ERROR");
			System.exit(1);
		}

		java.util.logging.Logger.getLogger("").setLevel(julLevel);
		java.util.logging.Logger.getLogger("io.netty").setLevel(java.util.logging.Level.OFF);
		java.util.logging.Logger.getLogger("javax.net").setLevel(java.util.logging.Level.OFF);
		java.util.logging.Logger.getLogger("io.perfmark.impl").setLevel(java.util.logging.Level.OFF);
	}

	@Override
	public Integer call() throws Exception {

		logger.info("{} v{}", Darkmatter.NAME, Darkmatter.VERSION);
		
		
		// TODO: check compiler flags
		
		// TODO: initialize darkmatter
		
		// TODO: scan input files
		
		// TODO: parse input into AST
		
		// TODO: compile to LLVM-IR
		

		return 0;
	}

	public static void main(String[] args) {

		// Install ANSI Console
		AnsiConsole.systemInstall();

		int exitCode = new CommandLine(new Main()).execute(args);
		System.exit(exitCode);
	}

	static {
		// Custom JUL properties
		try {
			java.util.logging.LogManager.getLogManager().readConfiguration(Main.class.getClassLoader().getResourceAsStream("logging.properties"));
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
