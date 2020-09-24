package pattern_programs;

public class Triangle {

    public static void main(String[] args) {
        int row = 5;
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*(row-i)+1; j++) {
                if(j==1 || i==1||j==2*(row-i)+1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}