public class arraymedium {
    static boolean elemexist(int arr[],int idx, int target){
        if(idx>=arr.length) return false;
        if(arr[idx]==target) return true;
        return elemexist(arr, idx+1, target);
    }
    public static int elemfound(int arr[], int idx, int target){
        if(idx>=arr.length) return -1;
        if(arr[idx]==target) return idx;
        return elemfound(arr, idx+1, target);
    }
    static int allelemindex(int arr[], int idx, int target){
        
    }

    public static void main(String[] args) {
        int arr[]={1,3,2,4,6,6};
        System.out.println(arr.length);
        System.out.println(elemexist(arr, 0, 5));
        System.out.println(elemfound(arr, 0, 5));
    }
}
