package com.javafundamental.pattern.abstractFactory;

public class ComputerFactory {
    public static Computer getComputer(IComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
