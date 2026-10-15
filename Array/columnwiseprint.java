import java.util.*;

public class columnwiseprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        

        int mat[][]={{2,3,4,5,2},{7,4,5,4,6},{4,5,6,4,6,}};
        int m=mat.length,n=mat[0].length;
       
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
            
        }
    }
    
}
