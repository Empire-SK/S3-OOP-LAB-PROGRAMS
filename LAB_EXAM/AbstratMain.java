abstract class Shape {
    public abstract void NumberOfSides();
}

class Rectangle extends Shape{
    public void NumberOfSides(){
        System.out.print("Rectangle have 4 sides");
    }    
}
class Triangle extends Shape{
    public void NumberOfSides(){
        System.out.print("Triangle have 3 Sides");
    }
}

class Hexagon extends Shape{
    public void NumberOfSides(){
        System.out.print("Hexagon Have 6 Sides");
    }
}

public class AbstratMain{
    public static void main(String [] args){
        Rectangle r=new Rectangle();
        r.NumberOfSides();
        Triangle t=new Triangle();
        t.NumberOfSides();
        Hexagon h=new Hexagon();
        h.NumberOfSides();
    }
}