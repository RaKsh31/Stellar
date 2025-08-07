import java.util.*;

class cell{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }
        int arr[] = new int[n];
        if(ar[0] == 1)
            arr[1] = 1;
        if(ar[n-1] == 1)
            arr[n-2] = 1;
        for(int j=1; j<n-2; j++){
            if(ar[j] == 1){
                arr[j+1] = arr[j-1] = 1;
            }
        }
        System.out.println("New cells are : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}