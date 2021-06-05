package oop.exercise;
import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise09
{
    static Scanner input = new Scanner(System.in);

    static final float SQRFT_PER_GALLON = 350;
    public static int getLength() {
        System.out.print("What is the length of the room in feet? ");
        return input.nextInt();
    }
    public static int getWidth() {
        System.out.print("What is the width of the room in feet? ");
        return input.nextInt();
    }
    public static void getAreaGallon(int length, int width) {
        int area = length * width;
        float gallon = area / SQRFT_PER_GALLON;
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %d square feet.",
                                Math.ceil(gallon), area);

    }
    public static void main( String[] args ) {
        int length = getLength();
        int width = getWidth();
        getAreaGallon(length, width);
    }
}