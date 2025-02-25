class Theater extends Thread{
    String str;
    public Theater(String str){
        this.str=str;
    }

    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(str+" "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}


public class TheardMultiTasking {
    public static void main(String[] args) {

        Theater obj1=new Theater("issue ticket");
        Theater obj2=new Theater("verifys ticket");
        Theater obj3=new Theater("allocate seat");

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        Thread t3=new Thread(obj3);
        t1.start();
        t2.start();
        t3.start();

        
    }
}
