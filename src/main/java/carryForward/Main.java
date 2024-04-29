package carryForward;

public class Main {
    public static void main (String[] args){
        char [] arr = { 'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g' };
        int result = carryForward.countPairs.pairCount(arr);//if you use static method, do not instantiate method directly.
        System.out.println("Number of agPairs: "+ result);
    }
}
