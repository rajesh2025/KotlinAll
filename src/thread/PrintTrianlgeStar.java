package thread;

public class PrintTrianlgeStar {
    @Override
    public int hashCode() {
        return 321;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    public static void main(String... args) {
        PrintTrianlgeStar p1 = new PrintTrianlgeStar();
        PrintTrianlgeStar p2 = new PrintTrianlgeStar();
//        PrintTrianlgeStar p2 = p1;
        if (p1.equals(p2)) {
            System.out.println("true equal");
        } else {
            System.out.println("false equal");

        }
        triangleBorder();
    }

    private static void triangleBorder() {
        int i, j, rows = 5;

        for (i = 1; i <= rows; i++) {
            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= (2 * i - 1); j++) {
                if (i == rows|| j == 1 || j == (2 * i - 1) ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    private static void triangleBorder1() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (i == j ) {
                    System.out.print("*\n");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int l = 4; l >= i; l--) {
                if (i == l) {
                    System.out.print("*\n");
                } else {
                    System.out.print(" ");
                }

            }

        }

//        for (int k = 0; k < 5; k++) {
//            for (int l = 0; l <= k; l++) {
//                if (k == l & k < 4) {
//                    System.out.print("*\n");
//                } else if (k == 4) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//        }

    }
}