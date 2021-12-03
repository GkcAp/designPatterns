package com.techprimers.structuraldesignpatterns.decorator;

public class BasicPhone implements Phone {
    @Override
    public String build() {
        return "Basic Phone : Screen, Battery, Processor";
    }
}
