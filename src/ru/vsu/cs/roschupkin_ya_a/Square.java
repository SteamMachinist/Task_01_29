package ru.vsu.cs.roschupkin_ya_a;

public class Square
{
    double side;

    public Square(double side)
    {
        this.side = side;
    }

    double calculateArea()
    {
        return side * side;
    }
}
