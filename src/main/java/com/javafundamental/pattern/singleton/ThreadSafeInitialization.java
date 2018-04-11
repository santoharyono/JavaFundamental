package com.javafundamental.pattern.singleton;

// Thread-safe but maybe reduce performance
public class ThreadSafeInitialization {
    private static ThreadSafeInitialization instance;

    private  ThreadSafeInitialization() {}

    public static ThreadSafeInitialization getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeInitialization.class) {
                if (instance == null) {
                    instance = new ThreadSafeInitialization();
                }
            }
        }

        return instance;
    }
}
