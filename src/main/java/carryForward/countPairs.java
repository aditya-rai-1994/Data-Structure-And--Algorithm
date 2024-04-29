package carryForward;
/*
Problem 1: Count pairs 'a-g'
Given a char array ch[] of Size N, calculate the number of pairs indices = i, j
such that i<j && ch[i]=="a" && ch[j]== "g". All characters in array ar in lowercase.

constraints:
1<=N<=10^5
"a" <= ch[i]<="j"

Example: [b,a,g,a,g,g]
count pairs = 5
 */
public class countPairs {
    public static int pairCount(char[] ch){
        int n = ch.length;
        int countg = 0; // count for g character;
        int countp = 0; // count for ag pair;
         for(int i = n-1;i>=0;i--){
             if(ch[i]=='g'){
                 countg++;
             } else if (ch[i]=='a') {
                 countp = countg+countp;
             }
         }
         return countp;
    }
}
