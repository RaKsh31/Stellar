import java.util.*;

class firstrep{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String ar[] = str.split("\\s+");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(ar[i]);
        }
       int x = n; //first rep index
       int y = -1; //first rep ele
       for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    if(x > j){
                        x = j;
                        y = arr[i];
                    }
                }
            }
        }
        if(y != -1){
            System.out.println(y + " is the first repeated element.");
        } /* else {
            System.out.println("No repetition found");
        } */
        sc.close();
    }
}   