/*
 Lucy goes to Lucarnos Film Festival.
 i/p: 1) n = movie length
      2) arr[] = movie seq(len)
      3) m = length of Lucy's fav sequence
      4) fav[] = Lucy's fav sequence
 o/p: 1) If Lucy can watch her fav sequence in the movie seq
    i.e, fav seq should be a subsequence of movie seq
 */
import java.util.*;
class Film{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mov[] = new int[n];
        for(int i=0; i<n; i++){
            mov[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int fav[] = new int[m];
        for(int i=0; i<m; i++)
            fav[i] = sc.nextInt();
        int ind = 0;
        boolean bool = false;
        for(int j=0; j<n; j++){
            if(fav[0] == mov[j]){
                ind = j;
                bool = true;
                break;
            }
            else{
                bool = false;
                break;
            }
        }
        int x = ind;
        for(int k=0; k<m; k++){
            if(mov[k] == fav[x]){
                x++;
                bool = true;
            }
            else{
                bool = false;
                break;
            }
        }
        System.out.println(bool ? "Can watch." : "Don't watch!");
        sc.close();
    }  
}