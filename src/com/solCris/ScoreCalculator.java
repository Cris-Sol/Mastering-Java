package com.solCris;

public class ScoreCalculator {
    int levelCompleted;
    int bonus;





    public ScoreCalculator(int levelCompleted, int bonus){
        this.levelCompleted=levelCompleted;
        this.bonus=bonus;
    }

    public  int finalScoreCalculator(){
        int finalScore;
        finalScore= levelCompleted*bonus;

        return finalScore;
    }



    public int calculateHighScorePosition(int score){
        if(score >= 100 && score<500)
            return 3;
        if(score>=500 && score <1000)
            return 2;
        if(score>=1000 )
            return 1;
        else return 99;
    }


}
