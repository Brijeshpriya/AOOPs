class MyClass<T>{
    T obj;
    public MyClass(T obj){
        this.obj=obj;
    }
    T getObj(){
        return obj;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Integer i=12;
        MyClass<Integer> obj1=new MyClass<Integer>(i);
        System.out.println("my integers are:" +" "+ obj1.getObj());

        Float f=12.123f;
        MyClass<Float> obj2=new MyClass<Float>(f);
        System.out.println("my floats are:" +" "+ obj2.getObj());


        Double d=1.2123456789;
        MyClass<Double> obj3=new MyClass<Double>(d);
        System.out.println("my doubles are:" +" "+ obj3.getObj());
        
    }
    
}
