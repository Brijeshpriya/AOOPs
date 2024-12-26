 interface Shape {
    public void draw();

    
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
class RoundedSquare implements Shape{
    public void draw(){
        System.out.println("inside RoundedSquare class draw method");
    }
}
class RoundedRectangle implements Shape{
    public void draw(){
        System.out.println("inside RoundedRectangle class draw method");
    }
}

abstract class AbstractFactory{
    public abstract Shape getShape(String shapeType);
}

class ShapeFactory extends AbstractFactory{
    public Shape getShape (String shapeType){
        if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        else{
            return new Rectangle();
        }
        
    }
}
class RoundedShapeFactory extends AbstractFactory{
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Square")){
            return new RoundedSquare();
        }else{
            return new RoundedRectangle();
        }
        
    }
}

class FactoryProducer{
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new ShapeFactory();
        }else{
            return new RoundedShapeFactory();
        }
    }
}

 public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory fp= FactoryProducer.getFactory(false);
        Shape obj =fp.getShape("square");
        obj.draw();

        obj =fp.getShape("rectangle");
        obj.draw();

        AbstractFactory fp1= FactoryProducer.getFactory(true);
        Shape obj1 =fp1.getShape("square");
        obj1.draw();

        obj1 =fp.getShape("rectangle");
        obj1.draw();



        
    }
}
