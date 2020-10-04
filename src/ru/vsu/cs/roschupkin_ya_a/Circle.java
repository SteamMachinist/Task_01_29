package ru.vsu.cs.roschupkin_ya_a;

class Circle extends Figure
{
    double radius = dimension;

    Circle(double dimension)
    {
        super(dimension);
    }

    double area()
    {
        return Math.PI * radius * radius;
    }
}
