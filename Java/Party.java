/* 
  Michael has a party and wants to know how many friendships he can save.
  n = max frnds he has
  On one day he can treat only one frnd, so if another guy asks treat then their frndship will be broken
  */
import java.util.*;
import java.io.*;

class Party{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of friends Michael has = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        for(int i = 0; i < n; i++) {
            for(int j=i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    c++;
                   // break; // Count each repeated element only once
                }
            }
        }
        int res = n - c;
        System.out.println("Michael can save " + res + " friendship(s).");
        sc.close();
    }
}