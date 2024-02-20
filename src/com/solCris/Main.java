package com.solCris;

import java.util.*;
import java.lang.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        SpeedConvertor sp = new SpeedConvertor();

        double userInput = sp.toMilesPerHour(-1);
        System.out.println("toMilesPerHour " + userInput);

        sp.printConversion(4);

    }

}
