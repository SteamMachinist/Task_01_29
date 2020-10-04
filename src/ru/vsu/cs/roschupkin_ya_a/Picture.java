package ru.vsu.cs.roschupkin_ya_a;

public class Picture
{
    double radius1;
    double radius2;
    double radius3;

    double partOfArea1;
    double partOfArea2;
    double partOfArea3;
    double partOfArea4;

    Circle smallCircle;
    Circle mediumCircle;
    Circle bigCircle;
    Square square;

    public Picture(double radius1, double radius2, double radius3, double partOfArea1,
                   double partOfArea2, double partOfArea3, double partOfArea4)
    {
        this.radius1 = radius1;
        this.radius2 = radius2;
        this.radius3 = radius3;

        this.partOfArea1 = partOfArea1;
        this.partOfArea2 = partOfArea2;
        this.partOfArea3 = partOfArea3;
        this.partOfArea4 = partOfArea4;

        this.smallCircle  = new Circle(radius1);
        this.mediumCircle = new Circle(radius2);
        this.bigCircle    = new Circle(radius3);
        this.square       = new Square(2 * radius3);
    }

    double calculateArea()
    {
        return calculatePartArea(partOfArea1, smallCircle.area(), 0)
                + calculatePartArea(partOfArea2, mediumCircle.area(), smallCircle.area())
                + calculatePartArea(partOfArea3, bigCircle.area(), mediumCircle.area())
                + calculatePartArea(partOfArea4, square.area(), bigCircle.area());
    }

    double calculatePartArea(double partOfArea, double biggerFigureArea, double smallerFigureArea)
    {
        return partOfArea / 8 * (biggerFigureArea - smallerFigureArea);
    }
}
