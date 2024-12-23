 interface Shape {
    public void draw();

    
}
class Circle implements Shape{
    public void draw(){
        System.out.println("inside circle class draw method");
    }
}
class Square implements Shape{
    public void draw(){
        System.out.println("inside Square class draw method");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("inside Rectangle class draw method");
    }
}

class ShapeFactory{
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        else if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        
    
    ShapeFactory sf=new ShapeFactory();
    Shape obj=sf.getShape("Circle");
    obj.draw();
    obj=sf.getShape("Square");
    obj.draw();
    obj =sf.getShape("rectangle");
    obj.draw();

}
}
