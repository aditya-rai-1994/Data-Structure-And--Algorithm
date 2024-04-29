package carryForward;
/*
Given an Array of size n , you have to find the leader in an array.
Note1: arr[i] is a said leader, if it is greater than max of all elements from left side[0, i-1]
Note 2: arr[0] is considered as leader
 example : arr- [3,2,4,5,2,7,1,15]
 count number of leader
 output- 5[3, 4, 5, 7, 15]
 */
public class LeaderInAnArray {

    public static int countLeaders(int[] arr){
        int n = arr.length;
        int count = 1;
        int max = arr[0];
        for(int i = 1; i< n; i++){
            if(arr[i]>max){
                max = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int [] arr = {3, 4, 5, 7, 15,36,7};
        int results = countLeaders(arr);
        System.out.println("Number of LeaderPairs: "+ results);
    }
}
