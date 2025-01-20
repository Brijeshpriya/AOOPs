class MyClass1<T>{
    static <T> void display(T[] arr){
        for(T i:arr){
            System.out.println(i);
        }
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        Integer arr1[]={1,2,3,4,5};
        System.out.println("reading integer objects");
        MyClass1.display(arr1);

        Float arr2[]={1.1f,2.2f,3.3f,4.4f,5.5f};
        System.out.println("reading float objects");
        MyClass1.display(arr2);

        
    }
    
}
