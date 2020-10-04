package ru.vsu.cs.roschupkin_ya_a;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.ROOT);

        int pictureNumber = readPictureNumber();

        double radius1 = 0;
        if (pictureNumber >= 6)
        {
            radius1 = readRadius("smallest");
        }
        double radius2 = readRadius("medium");
        double radius3 = readRadius("biggest");

        handleOut(pictureNumber, radius1, radius2, radius3);
    }

    static int readPictureNumber()
    {
        System.out.print("enter picture number: 2.");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static double readRadius(String radiusName)
    {
        System.out.printf("enter the radius of the %s circle R = ", radiusName);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static void handleOut(int pictureNumber, double radius1, double radius2, double radius3)
    {
        System.out.printf("filled area is %.3f", getAreaOfPicture(pictureNumber, radius1, radius2, radius3));
    }

    static double getAreaOfPicture(int pictureNumber, double radius1, double radius2, double radius3)
    {
        Picture picture = switch (pictureNumber)
        {
            case 1  -> new Picture(radius1, radius2, radius3, 0, 2, 6, 2);
            case 2  -> new Picture(radius1, radius2, radius3, 0, 3, 2, 1);
            case 3  -> new Picture(radius1, radius2, radius3, 0, 6, 1, 1);
            case 4  -> new Picture(radius1, radius2, radius3, 0, 3, 0, 4);
            case 5  -> new Picture(radius1, radius2, radius3, 0, 4, 3, 2);
            case 6  -> new Picture(radius1, radius2, radius3, 0, 5, 0, 6);
            case 7  -> new Picture(radius1, radius2, radius3, 0, 8, 0, 8);
            case 8  -> new Picture(radius1, radius2, radius3, 0, 3, 0, 2);
            case 9  -> new Picture(radius1, radius2, radius3, 2, 3, 4, 5);
            case 10 -> new Picture(radius1, radius2, radius3, 2, 5, 2, 4);
            default -> new Picture(0, 0, 0, 0, 0, 0, 0);
        };

        return picture.calculateArea();
    }

}
