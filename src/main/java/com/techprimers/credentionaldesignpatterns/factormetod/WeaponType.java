package com.techprimers.credentionaldesignpatterns.factormetod;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum WeaponType {
    SHORT_SWORD("short sword"),
    SPEAR("spear"),
    AXE("axe"),
    UNDEFINED("");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
