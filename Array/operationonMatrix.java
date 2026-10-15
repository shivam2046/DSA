public class operationonMatrix {
    // public static int [][]transpose(int arr[][]){

    // }
    public static void print(int arr[][]){
        int row=arr.length;
        int col=arr[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int [][] arr={{1,2,3,4,5},{3,4,5,6,7},{4,5,6,7,8},{6,7,8,9,0}};
        print(arr);
    }
}
