package com.techprimers.credentionaldesignpatterns.factormetod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactorMetodExample {

    private static final String MANUFACTURED = "{} manufactured {}";

    /**
     * Program entry point.
     * @param args command line args
     */
    public static void main(String[] args) {

        Blacksmith blacksmith = new OrcBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        log.info(MANUFACTURED, blacksmith, weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        log.info(MANUFACTURED, blacksmith, weapon);

        blacksmith = new ElfBlacksmith();
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        log.info(MANUFACTURED, blacksmith, weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        log.info(MANUFACTURED, blacksmith, weapon);
    }
}
