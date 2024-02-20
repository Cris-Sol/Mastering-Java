package com.solCris;


import java.util.*;
import java.lang.*;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
//        Player player1= new Player("Samosa", 90 );
//        Player player2=new Player("Tequila", 80);
//        Player player4= new Player("Tractor", 2);
//
//
//        ScoreCalculator player1Score= new ScoreCalculator(player1.levelCompleted,player1.levelCompleted*10);
//        int scorePlayer1= player1Score.finalScoreCalculator();
//        System.out.println(player1.playerName + " has "+ scorePlayer1);
//
//        ScoreCalculator player2Score = new ScoreCalculator(player2.levelCompleted, player2.levelCompleted*10);
//        int scorePlayer2=player2Score.finalScoreCalculator();
//        System.out.println(player2.playerName+ " has "+ scorePlayer2);
//
//
//
//       System.out.println(player1.playerName + " ranked " + player1Score.calculateHighScorePosition(scorePlayer1) );
//
//        System.out.println(player2.playerName+ " ranked " + player2Score.calculateHighScorePosition(scorePlayer2));

        double userInput = toMilesPerHour(-1);
        System.out.println("toMilesPerHour "+ userInput);

        printConversion(0);
        System.out.println("printConversion  ");

    }

    public static long toMilesPerHour(double kilometersPerHour){
        long milesPerHour = 0;
        if (kilometersPerHour < 1) {
            System.out.println("Invalid input");
            return milesPerHour;
        } else if (kilometersPerHour >= 1) {
            milesPerHour = Math.round(kilometersPerHour * 1.609);
            return milesPerHour;
        }

        return milesPerHour;

    }


    public static void printConversion(double kilometersPerHour){
        double milesPerHour=0;

        if(kilometersPerHour<1){
            System.out.println("Invalid Value");
        }
        if(kilometersPerHour>=1){
            System.out.print(kilometersPerHour+" km/h = ");
            milesPerHour=Math.round(kilometersPerHour / 1.609);
            System.out.print(milesPerHour + " mi/h = ");
        }
    }




}
