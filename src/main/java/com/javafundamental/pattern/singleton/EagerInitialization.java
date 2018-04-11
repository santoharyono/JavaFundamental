package com.javafundamental.pattern.singleton;

// This instance of this class created at the time of class loading
// Not provide for any exception
// NOT THREAD SAFE

public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();

    // private constructor to avoid client application to use constructor
    private  EagerInitialization() {}

    public static EagerInitialization getInstance() {
        return instance;
    }
}
