

class Single extends Thread{
    public void run(){
        issueTicket();
        verifyTicket();
        allocateSeat();
    }
    public void issueTicket(){
        System.out.println("issue ticket");
    }
    public void verifyTicket(){
        System.out.println("verify ticket");
    }
    public void allocateSeat(){
        System.out.println("allocate seat");
    }
}


public class TheardSingleTask {
    public static void main(String[] args) {
        Single obj=new Single();
        Thread t1=new Thread(obj);
        t1.start();
        
    }
    
}
