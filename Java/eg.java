public class eg {
    void fun(int x){
        if(x==2)
            System.out.print(x);
          //  return x;

        int y = 0;
        while(y >= 0){
            y *= 2;
            y++;
        }
          System.out.print(y);
       // return y;

    }
    public static void main(String[] args) {
        eg ob = new eg();
        ob.fun(2);
      
    }
}
