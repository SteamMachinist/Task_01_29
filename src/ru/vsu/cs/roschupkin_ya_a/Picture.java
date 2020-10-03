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

    SmallCircle  SC1;
    MediumCircle MC1;
    BigCircle    BC1;
    Square        S1;

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

        this.SC1 = new SmallCircle(radius1);
        this.MC1 = new MediumCircle(radius2);
        this.BC1 = new BigCircle(radius3);
        this.S1  = new Square(2 * radius3);
    }

    double calculateArea()
    {
        return calculateArea1() + calculateArea2() + calculateArea3() + calculateArea4();
    }

    double calculateArea1()
    {
        return partOfArea1 / 8 * SC1.calculateArea();
    }

    double calculateArea2()
    {
        return partOfArea2 / 8 * (MC1.calculateArea() - SC1.calculateArea());
    }

    double calculateArea3()
    {
        return partOfArea3 / 8 * (BC1.calculateArea() - MC1.calculateArea());
    }

    double calculateArea4()
    {
        return partOfArea4 / 8 * (S1.calculateArea() - BC1.calculateArea());
    }
}
