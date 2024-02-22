package com.solCris;

import java.util.*;
import java.lang.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        /*
        SpeedConvertor sp = new SpeedConvertor();
        double userInput = sp.toMilesPerHour(-1);
        System.out.println("toMilesPerHour " + userInput);
        sp.printConversion(4); */


        MegaBytesConverter mob= new MegaBytesConverter();
        mob.printMegaBytesAndKiloBytes(-1);
        mob.printMegaBytesAndKiloBytes(0);
        mob.printMegaBytesAndKiloBytes(1024);//should print 1
        mob.printMegaBytesAndKiloBytes(2048);//should print 2
        mob.printMegaBytesAndKiloBytes(23552);//should print 23
        mob.printMegaBytesAndKiloBytes(77777);//should print 75 and 954101562







    }

}
