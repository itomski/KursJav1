package de.lubowiecki.jav1.patterns.singleton;

import java.time.LocalDateTime;

import de.lubowiecki.jav1.patterns.singleton.CustomLog.LogType;

// LazySingleton
public class LazyCustomLog {
	
	private final StringBuilder log = new StringBuilder();
	
	private static LazyCustomLog instance;
	
	private LazyCustomLog() {
	}
	
	public static LazyCustomLog get() {
		if(instance == null) {
			instance = new LazyCustomLog();
		}
		return instance;
	}
	
	public void log(LazyLogType type, String message) {
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
	
	public enum LazyLogType {
		ERROR, INFO, DANGER;
	}
}
