package com.solCris;

import java.util.*;
import java.lang.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        /*
        //Uncomment this bit to test Speedconverter
        SpeedConvertor sp = new SpeedConvertor();
        double userInput = sp.toMilesPerHour(-1);
        System.out.println("toMilesPerHour " + userInput);
        sp.printConversion(4); */

        /*
        //Uncomment this bit to test MegaBytesConverter
        MegaBytesConverter mob= new MegaBytesConverter();
        mob.printMegaBytesAndKiloBytes(-1);
        mob.printMegaBytesAndKiloBytes(0);
        mob.printMegaBytesAndKiloBytes(1024);//should print 1
        mob.printMegaBytesAndKiloBytes(2048);//should print 2
        mob.printMegaBytesAndKiloBytes(23552);//should print 23
        mob.printMegaBytesAndKiloBytes(77777);//should print 75 and 954101562

         */

        /*

         */
        BarkingDog wakeUp = new BarkingDog();
        //OOB values
        wakeUp.shouldWakeUp(true, -8); //false
        wakeUp.shouldWakeUp(true, 65); //false

        //day after waking up hours
        wakeUp.shouldWakeUp(true, 10); //false
        wakeUp.shouldWakeUp(true, 9); //false
        wakeUp.shouldWakeUp(true, 21); //false

        //night after bed
        out.println("Should all return true");
        out.println(wakeUp.shouldWakeUp(true, 0)); //true
        out.println(wakeUp.shouldWakeUp(true, 1)); //true
        out.println(wakeUp.shouldWakeUp(true, 5)); //true
        out.println(wakeUp.shouldWakeUp(true, 7)); //true




    }

}
