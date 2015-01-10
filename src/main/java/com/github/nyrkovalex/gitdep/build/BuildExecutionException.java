package com.github.nyrkovalex.gitdep.build;

public class BuildExecutionException extends Exception {
    public BuildExecutionException(String message, Throwable cause) {
        super(message, cause);
    }

    public BuildExecutionException(String message) {
        super(message);
    }
}