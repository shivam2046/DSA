import java.util.Scanner;
public class divisible {

    // static void classcheck(int n){
    //     if(n%3==0 && n%5==0)System.out.println("divisible by 5 and 3");
    //     else if(n%3==0){
    //         System.out.println("divisible by 3");
    //     }else if(n%5==0){
    //         System.out.println("divisible by 5");
    //     }else{
    //         System.out.println("not divisible by 3 &5");
    //     }
    // }
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);

        // System.out.println("Entyer a number");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // classcheck(n);

        // if(a>b){
        //     if(a>c) System.out.println("largest is a"+a);
        //     else System.out.println(c);
        // }
        // else{
        //     if(b>=c) System.out.println(b);
        //     else System.out.println(c);
        // }

        //ternary
        // System.out.println((a>b)?((a>c)?a:c):((b>c)?b:c));

        //ap
       

        // int c=99;
        // int d=3;
        // for(int i=99;i>=0;i=i-3){
        //     System.out.print(i+" ");
        
        // }

        // int n=10;
        
        // for(int i=1;i<=n;i++){
        //     System.out.println(i);
        //     System.out.println(n);
        //     n--;
        // }
       
        for(char ch='a';ch<='z';ch++){
            System.out.print(ch+" "+(int)ch+" ");
        }

        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch+" "+(int)ch+" ");
        }
        
    }
}

