package com.techprimers.credentionaldesignpatterns.singleton;

public enum EnumIvoryTower {

    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
