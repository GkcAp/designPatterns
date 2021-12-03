package com.techprimers.credentionaldesignpatterns.factormetod;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ElfWeapon implements Weapon {

    private final WeaponType weaponType;

    @Override
    public String toString() {
        return "an elven " + weaponType;
    }
}
