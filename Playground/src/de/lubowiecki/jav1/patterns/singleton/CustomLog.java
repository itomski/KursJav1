package de.lubowiecki.jav1.patterns.singleton;

import java.time.LocalDateTime;

// EagerSingleton
public class CustomLog {
	
	private final StringBuilder log = new StringBuilder();
	
	private static final CustomLog instance = new CustomLog();
	
	private CustomLog() {
	}
	
	public static CustomLog get() {
		return instance;
	}
	
	public void log(LogType type, String message) {
		log.append(LocalDateTime.now());
		log.append(" - ");
		log.append(type);
		log.append(" : ");
		log.append(message);
		log.append("\n");
	}
	
	public void show() {
		System.out.println(log);
	}
	
	public enum LogType {
		ERROR, INFO, DANGER;
	}
}
