package carryForward;
/*
N Bulbs:
Given n bulbs and their initial states, each bulb has switch associated to it.
ON= arr[i]=1;
OFF= arr[i]=0;
if we click on switch:
Every bulb on Right including current bulb is flipped.
Problem: Minimum number of time we have to click on bulb so, that every bulb will "ON"
Example: arr [0,0,1,0,0,1]----1st flipped when arr[2] flipped to 0-- [0,0,0,1,1,0]
 */
public class ProblemOnBulbs {
    public static int minClicks(int [] arr){
        int count = 0;
        for (int j : arr) {
            if (j == 1 && count % 2 == 1) {
                count = count + 1;
            } else if (j == 0 && count % 2 == 0) {
                count = count + 1;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int [] arr = {1,0,0,1,0,1,0};
        int results = minClicks(arr);
        System.out.println("Minimum number of clicks to switch on bulbs : "+ results);
    }
}
