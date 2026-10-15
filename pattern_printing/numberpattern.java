 package pattern_printing;
import java.util.*;


class numberpattern {

    public static void square(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void rectangle(int n,int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
   
    
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    int m=sc.nextInt();

    // square(n);
    // rectangle(m,n);
 }
    
}