package ru.vsu.cs.roschupkin_ya_a;

public class SmallCircle
{
    double radius;

    public SmallCircle(double radius)
    {
        this.radius = radius;
    }

    double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}
