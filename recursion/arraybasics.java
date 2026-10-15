public class arraybasics {
    static void printarr(int arr[],int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]+" ");
        printarr(arr,idx+1);
    }

    static int maxarr(int arr[],int x){
        if(x==arr.length-1) return arr[x];
        int smallans=maxarr(arr,x+1);
        return Math.max(smallans, arr[x]);
    }

    static int countelem(int arr[],int idx,int count){
        if(idx==arr.length-1) return count+1;
        int ans=countelem(arr,idx+1,count+1);
        return ans;
    }
    static int sumofelem(int arr[],int x,int sum){
        if(x==arr.length-1) return sum+arr[x];
        int ans=sumofelem(arr, x+1, sum+arr[x]);
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={10,2,33,5,8};
        printarr(arr, 0);
        System.out.println();
        System.out.println(maxarr(arr, 0));
        System.out.println();
        System.out.println(countelem(arr, 0, 0));
        System.out.println();
        System.out.println(sumofelem(arr, 0, 0));
    }
}
