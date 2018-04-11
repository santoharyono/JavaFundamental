package com.javafundamental.pattern.singleton;

// NOT THREAD-SAFE
public class StaticBlockInitialization {
    private static  StaticBlockInitialization instance;

    private StaticBlockInitialization() {}

//    static block for handle exception
    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public  static StaticBlockInitialization getInstance() {
        return instance;
    }
}
