package com.company.model.machines;

import com.company.model.abstracts.Machine;
import com.company.model.abstracts.Nuts;

public class smallMachine extends Machine {

    @Override
    public Nuts checkNut(Nuts nuts) {
        if (nuts.weight <= 1) {
            return nuts;
        } else {
            this.crackNut(nuts);
            return null;
        }
    }

    @Override
    public void crackNut(Nuts nuts) {
        nuts.crackNut();
    }
}

