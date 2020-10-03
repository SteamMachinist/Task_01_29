package ru.vsu.cs.roschupkin_ya_a;

public class MediumCircle
{
    double radius;

    public MediumCircle(double radius)
    {
        this.radius = radius;
    }

    double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}

