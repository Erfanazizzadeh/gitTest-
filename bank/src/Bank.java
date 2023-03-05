import java.util.Scanner;

public class Bank {
    private String name;
    private int numofbank;
    
    public void setname(String a){//شی
        name = a;
    }
    public void setbranch( int s){ //ویژگی
        numofbank = s;
    }
    public void account(){//متد
        System.out.println(" پاسارگاد");
    }
    public void idcard(){// متد
        System.out.println("5022 2910 9134 5148");
    }
    
    
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank n1 = new Bank();
        System.out.println(" Enter your name : ");
        n1.name = scan.next();
        System.out.println(" Enter your number of bank : ");
        try{
        n1.numofbank = scan.nextInt();
        }
        catch(Exception ex){
            System.out.print(" Error , Please Enter a number ");
            System.exit(0);
        }
        System.out.println("  your name  is : " + n1.name);
        System.out.println(" your number of bank is : "+ n1.numofbank);
//        System.out.println(n1.name);
//        System.out.println(n1.numofbank);
        n1.account();
        n1.idcard();
        
        
        
        
    }
    
}
