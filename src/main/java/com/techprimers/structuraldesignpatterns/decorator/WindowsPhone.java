package com.techprimers.structuraldesignpatterns.decorator;

public class WindowsPhone extends SmartPhone {
    public WindowsPhone(Phone phone) {
        super(phone);
    }

    @Override
    public String build() {
        return super.build() + WindowsPhone();

    }

    private String WindowsPhone() {
        return  " Windows Phone v1.0";
    }
}
