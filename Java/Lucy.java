/* Lucy wishes to watch a movie in fest.
I/P:
1st line is no. of movies.
2nd line is arr that represent length of movie [L1, L2,....]
3rd line is arr showing rating of movie [R1, R2,....]
O/P:
Lucy should watch movie X, where X is the index (maximal) of the movie with the highest product of length and rating.
If there are multiple movies with the same product, print the index of the first one(minimal).
*/

import java.util.*;
import java.io.*;

class Lucy{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr_l[] = new int[n];
        int arr_r[] = new int[n];
        for(int i=0; i<n; i++){
            arr_l[i] = sc.nextInt();
        }
        for(int j=0; j<n; j++)
            arr_r[j] = sc.nextInt();
        
        // new arr to store product
        int prod[] = new int[n];
        for(int i=0; i<n; i++){
            prod[i] = arr_l[i] * arr_r[i];
        }
        int max = 0;
        int ind = 0;
        for(int j=0; j<n; j++){
            if(prod[j] > max){  
                max = prod[j];
                ind = j;
            }
           // else if(prod[j] == prod[j+1])
              //  System.out.println(j);
        }
        System.out.println("Lucy should watch movie " + (ind+1));
        
        sc.close();
    }
}
        
