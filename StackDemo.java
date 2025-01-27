import java.util.Stack;
import java.util.Scanner;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<Integer>();
        int choice=0;
        int pos,ele;
        Scanner sc=new Scanner(System.in);
        while(choice<4){
            System.out.println("Stack opertation");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.search");
            choice=sc.nextInt();
            switch (choice) {
                case 1:System.out.println("enter element");
                       ele=sc.nextInt();
                       st.push(ele);
                    
                    break;
            
                case 2:Integer obj=st.pop();
                       System.out.println("deleted element is"+obj);
                    break;
                case 3:System.out.println("enter the object to be the search");
                       ele=sc.nextInt();
                       pos=st.search(ele);
                    if(pos==1){
                        System.out.println("element not found");
                    } else{
                        System.out.println("found at"+pos);
                    }  
                    break; 
                case 4:return;       
            }
            System.out.println("Stsck object are"+st);
        }
    }
    
}
