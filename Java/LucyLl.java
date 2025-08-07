// Lucy problem with LinkedList

import java.util.*;
class LucyLl{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        for(int i=1; i<=n; i++){
            l1.add(sc.nextInt());
        }
        for(int i=1; i<=n; i++){
            l2.add(sc.nextInt());
        }

    // product of 2 LinkedList's elements

        LinkedList<Integer> product = new LinkedList<>();
        for(int i=0; i<l1.size(); i++){
            product.add(l1.get(i) * l2.get(i));
        }
        System.out.println(product);

    // get index of max ele in product

    int maxIndex = 0;
    for(int i=1; i<product.size(); i++){
        if(product.get(i) > product.get(maxIndex)){
            maxIndex = i;
        }
    }
    System.out.println("Max element index: " + maxIndex);

    }
}