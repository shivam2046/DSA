
public class sneakprint {
    
    static void sneak(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;

        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
    void print(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int rowmaxsum(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        int maxsum=Integer.MIN_VALUE;
        int row=0;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum=sum + arr[i][j];
            }
            if(maxsum<sum){
                maxsum=sum;
                row=i;
            }
            
        }
        return maxsum;
    }

    public static int rowmin(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<m;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
            if(max<min){
                min=max;
            }
        }
        return min;

    }
    public static void printcolumnwise(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            System.out.print(arr[j][i]+"  ");
            }
        }
    }

    void sneakcolumn1(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        for(int i=n-1;i>=0;i--){
            if(i%2==0){
                for(int j=m-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for(int j=0;j<m;j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
    }
    void sneakcolumn2(int arr[][]){
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=m-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for(int j=0;j<m;j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
    }
    public static int[][] transposeextraspace(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;

        int [][]arr1=new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[j][i]=arr[i][j];
            }
        }

        return arr1;
    }
    public static int [][] rotateanticlock(int arr[][]){

        int row=arr.length;
        int col=arr[0].length;
        int arr1[][]=new int[col][row];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr1[j][i]=arr[i][j];
            }
        }
        for(int co=0;co<arr1[0].length;co++){
            int i=0;
            int j=arr1.length-1;
            while(i<j){
                int temp=arr1[i][co];
                arr1[i][co]=arr1[j][co];
                arr1[j][co]=temp;
                i++;
                j--;
            }
        }
        return arr1;


    }
    public static int[][] rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int ro=0;ro<matrix.length;ro++){
            int i=0,j=matrix[0].length-1;
            while(i<j){
               int temp= matrix[ro][i];
               matrix[ro][i]=matrix[ro][j];
               matrix[ro][j]=temp;
               i++;
               j--;
            }
        }
        return matrix;
    }
    public static void multiply(int arr1[][],int arr2[][]){
        
    }


    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},{5,3,6,7,4},{8,3,2,5,9},{3,2,7,4,1}};

        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{1,2},{3,4},{5,6}};
        sneakprint ss=new sneakprint();

        ss.print(arr);

        System.out.println();

        sneak(arr);
        System.out.println();
        ss.print(arr);
        System.out.println();
        System.out.println(rowmaxsum(arr));
        System.out.println();
        System.out.println(rowmin(arr));
        System.out.println();
        printcolumnwise(arr);
        System.out.println();
        ss.sneakcolumn1(arr);
        System.out.println();
        ss.sneakcolumn2(arr);

        System.out.println();
        System.out.println("transpose is");
        ss.print(transposeextraspace(arr));
        System.out.println("this ia an rotated array");
        ss.print(rotateanticlock(arr));

        System.out.println("clockwise");
        ss.rotate(arr);
        

    }
}
