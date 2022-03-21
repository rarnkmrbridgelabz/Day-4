package com.bridgelabz;

public class SnakeAndLadder {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake & Ladder Game");
        String player1;
        int startposition = 0;
        int rolls = 0;
        while(startposition<100) {
            int dicenumber = (int) (Math.random() * 6) + 1;
            rolls++;
            System.out.println("Your Random Dice Number(1to6) is:" + dicenumber);
            int option = (int) (Math.random() * 3);
            System.out.println("Your Random options(0,1,2) is: " + option);
            switch (option) {
                case LADDER:
                    startposition = startposition + dicenumber;
                    break;
                case SNAKE:
                    startposition = startposition - dicenumber;
                    break;
            }
            System.out.println("startposition : " + startposition);
            if(startposition<0){
                startposition=0;
            }
            if(startposition>100){
                startposition=startposition-dicenumber;
            }
            System.out.println("Position after every dice roll: "+startposition);
        }
        System.out.println("Total number of times the dice played to win the Game: "+rolls);
    }
}
