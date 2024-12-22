class singleObject{
    private static singleObject instance =new singleObject();
    private singleObject(){

    }
    public static singleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("hello priyanka");
    }
}


public class singlepatternDemo {
    public static void main(String[] args) {
        singleObject obj =singleObject.getInstance();
        obj.showMessage();
    }
}
