package ru.vsu.cs.roschupkin_ya_a;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.ROOT);

        Scanner sc = new Scanner(System.in);
        //entering radii of circles where r1 is the smallest

        System.out.print("enter the radius of the smallest circle R = ");
        double r1 = sc.nextDouble();

        System.out.print("enter the radius of the medium circle   R = ");
        double r2 = sc.nextDouble();

        System.out.print("enter the radius of the biggest circle  R = ");
        double r3 = sc.nextDouble();

        System.out.println();

        if (!(checkMistakes(r1, r2, r3)))
        {
            System.out.printf("filled area is %.3f", calcArea(r1, r2, r3));
        }
    }

    public static boolean checkMistakes (double r1, double r2, double r3) //checking r3 > r2 > r1 > 0
    {
        if (((r1 >= r2) || (r1 >= r3) || (r2 >= r3)) || (r1 < 0))
        {
            System.out.println("something is wrong");
            return true;
        }
        else return false;
    }

    public static double calcArea(double r1, double r2, double r3)
    {
        double area; // of a filled area
        area = r3 * r3 * (2 - Math.PI / 4) + Math.PI * 3 / 8 * (r2 * r2 - r1 * r1);

        /*
           area = (1/4 of square area) + (1/4 of (square area - big circle area)) +
                + (3/8 of (medium circle area - small circle area)) =

                = 1/4 * (2*r3 * 2*r3) + 1/4 * (2*r3 * 2r3 - PI * r3 *r3) +
                + 3/8 * (PI * r2 * r2 - PI * r1 * r1) =

                = r3 * r3 * (2 - PI / 4) + PI * 3/8 * (r2 * r2 - r1 * r1)
         */

        return area;
    }
}
