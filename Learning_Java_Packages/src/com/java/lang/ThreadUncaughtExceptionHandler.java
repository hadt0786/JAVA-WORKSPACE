package com.java.lang;

public interface ThreadUncaughtExceptionHandler {
	public void uncaughtException(Thread t, Throwable e);
}
