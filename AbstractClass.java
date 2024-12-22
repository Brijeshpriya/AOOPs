import java.util.*;

 abstract class sample{
   public abstract void calculate(int a);
}
class square extends sample{
   public void calculate(int a){
        System.out.println(a*a);
    }
}
class cube extends sample{
  public  void calculate(int a){
        System.out.println(a*a*a);
    }
}
class squareroot extends sample{
   public void calculate(int a){
        System.out.println(Math.sqrt(a));
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        square s=new square();
        cube c=new cube();
        squareroot sq=new squareroot();

        s.calculate(2);
        c.calculate(2);
        sq.calculate(3);
    }
}
