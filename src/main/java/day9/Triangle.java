package day9;

public class Triangle extends Figure {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c, String color){
        super(color);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double area(){
        double p=perimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double perimeter(){
        return a+b+c;
    }
}
