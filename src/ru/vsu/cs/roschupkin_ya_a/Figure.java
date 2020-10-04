package ru.vsu.cs.roschupkin_ya_a;

public abstract class Figure
{
    double dimension;

    public Figure(double dimension)
    {
        this.dimension = dimension;
    }

    abstract double area();
}
