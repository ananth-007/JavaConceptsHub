abstract class Shape
{
    abstract void draw();
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing a circle");
    }
}

public class Abstraction {
    public static void main(String[] args)
    {
        Circle obj = new Circle();
        obj.draw();
    }
}
