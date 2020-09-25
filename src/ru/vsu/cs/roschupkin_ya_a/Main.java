package ru.vsu.cs.roschupkin_ya_a;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.ROOT);

        double radius1 = handleIn("smallest");
        double radius2 = handleIn("medium");
        double radius3 = handleIn("biggest");

        handleOut(radius1, radius2, radius3);
    }

    static double handleIn (String radiusName)
    {
        System.out.printf("enter the radius of the %s circle R = ", radiusName);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    static void handleOut (double radius1,double radius2, double radius3)
    {
        if (!hasError(radius1, radius2, radius3))
        {
            System.out.printf("filled area is %.3f", calcArea(radius1, radius2, radius3));
        }
    }


    static boolean hasError (double radius1, double radius2, double radius3) //checking 0 < r1 < r2 < r3
    {
        if ((radius1 >= radius2) || (radius2 >= radius3) || (radius1 >= radius3) || (radius1 < 0))
        {
            System.out.println("something is wrong");
            return true;
        }
        return false;
    }

    static double calcArea(double radius1, double radius2, double radius3)
    {
        /*
           area = (1/4 of square area) + (1/4 of (square area - big circle area)) +
                + (3/8 of (medium circle area - small circle area)) =

                = A1 + A2 + A3
         */

        return calcA1(2 * radius3) + calcA2(radius3) + calcA3(radius1, radius2);
    }

    static double calcA1 (double squareSide) // 1/4 of square area
    {
        return 0.25 * calcSquareArea(squareSide);
    }

    static double calcSquareArea (double side)
    {
        return side * side;
    }

    static double calcA2 (double radius3) // 1/4 of (square - big circle) area
    {
        return 0.25 * (calcSquareArea(2 * radius3) - calcBigCircleArea(radius3));
    }

    static double calcBigCircleArea (double radius3)
    {
        return Math.PI * radius3 * radius3;
    }

    static double calcA3 (double radius1, double radius2) // 3/8 of (medium circle - small circle) area
    {
        return 0.375 * (calcMediumCircleArea(radius2) - calcSmallCircleArea(radius1));
    }

    static double calcMediumCircleArea(double radius2)
    {
        return Math.PI * radius2 * radius2;
    }

    static double calcSmallCircleArea (double radius1)
    {
        return Math.PI * radius1 * radius1;
    }
}
