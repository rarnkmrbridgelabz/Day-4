package com.bridgelabz;

public class SnakeAndLadder {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args){
        int position1 = 0;
        int position2 = 0;
        int turn = 1;
        while (position1 < 100 && position2<100) {
            if (turn == 1) {
                position1 = DiceRoll(position1);
                turn = 2;
            }
            else {
                position2 = DiceRoll(position2);
                turn = 1;
            }
        }
        System.out.println("Position1 :"+position1+" Position2 :"+position2);
        if (position1 == 100) {
            System.out.println("Player1 is the winner");
        }
        else {
            System.out.println("Player2 is the winner");
        }
    }

    public static int DiceRoll(int position) {
        int dice = (int) (Math.random()*6)+1;
        int option = (int) (Math.random()*3);

        switch (option) {
            case LADDER :
                position = position + dice;
                break;
            case SNAKE :
                position = position - dice;
                break;
            case NO_PLAY :
                break;
        }
        if (position<0) {
            position = 0;
        }
        if (position > 100) {
            position = position - dice;
        }
        return position;
    }
}



