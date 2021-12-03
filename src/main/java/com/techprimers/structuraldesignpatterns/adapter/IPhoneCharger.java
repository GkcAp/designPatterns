package com.techprimers.structuraldesignpatterns.adapter;

public class IPhoneCharger {
    public void charge(IPhone iPhone) {
        iPhone.charge();
    }
}
