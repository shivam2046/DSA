import java.util.*;
public class maximumsubarray {
    
    public void maxSubArrayPrint(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Max Sum: " + maxSum);
        System.out.print("Subarray: ");

        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();

        System.out.println("Enter the elements of array");

        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        maxSubArrayPrint(nums);

    }
}


