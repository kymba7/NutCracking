package com.company;

import com.company.model.machines.largeMachine;
import com.company.model.machines.smallMachine;
import com.company.model.nuts.*;


public class Main {

    public static void main(String[] args) {
        largeMachine large = new largeMachine();
        smallMachine small = new smallMachine();


        Macadamia macadamia=new Macadamia();
        Peanut peanut = new Peanut();
        Almond almond = new Almond();
        Walnut walnut = new Walnut();
        Cashew cashew = new Cashew();

        large.checkNut(peanut);
        large.checkNut(almond);
        large.checkNut(walnut);
        large.checkNut(macadamia);
        large.checkNut(cashew);

        small.checkNut(peanut);
        small.checkNut(almond);
        small.checkNut(macadamia);
        small.checkNut(walnut);
        small.checkNut(cashew);


    }


}
