package ru.vsu.cs.roschupkin_ya_a;

class Square extends Figure
{
    double side = dimension;

    Square(double dimension)
    {
        super(dimension);
    }

    double area()
    {
        return side * side;
    }
}
