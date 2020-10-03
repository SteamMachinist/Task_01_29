package ru.vsu.cs.roschupkin_ya_a;

public class BigCircle
{
    double radius;

    public BigCircle(double radius)
    {
        this.radius = radius;
    }

    double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}
