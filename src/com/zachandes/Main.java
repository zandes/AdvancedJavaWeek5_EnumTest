package com.zachandes;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        System.out.println("Please enter your favorite team: ");

        String theTeam = keyboard.nextLine().toLowerCase();

        Team t;
        switch (theTeam.substring(0,3)){
            case "chi":
                t=Team.CHICAGO;
                break;
            case "gre":
                t=Team.GREEN_BAY;
                break;
            case "det":
                t=Team.DETROIT;
                break;
            case "min":
                t=Team.MINNESOTA;
                break;
            default:
                t=Team.OTHER;
                break;
        }

        printOff(t);
    }



    private static void printOff(Team team){
        switch (team){
            case CHICAGO:
                System.out.println("Da Bears");
                break;
            case DETROIT:
                System.out.println("Music City Lions");
                break;
            case GREEN_BAY:
                System.out.println("Title Town Packers");
                break;
            case MINNESOTA:
                System.out.println("The other team indoors");
                break;
            default:
                System.out.println("Dallas? New England? Eagles? Whatever.");
        }

    }
}