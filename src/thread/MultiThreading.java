package thread;

import java.util.HashSet;

public class MultiThreading {
    public static void main(String[] args) {
HashSet hs = new HashSet();
        boolean b1 = hs.add("Geeks");
        boolean b2 = hs.add("GeeksforGeeks");
        boolean b3 = hs.add("Geeks");
        System.out.println("b1 = "+b1);
        System.out.println("b2 = "+b2);
        System.out.println("b3 = "+b3);
        System.out.println(hs);
    }
}
class  Number{
    int count = 0;
    Number(int n){
         count = n;
    }

    public void getCount() {
        System.out.println(count);
    }
}
