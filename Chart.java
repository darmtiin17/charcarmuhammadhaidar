public class Chart {
    public static void main(String[] args) {
        System.out.println("H*A*I*D*A*R");
        System.out.println("*");
        for (int i = 0; i < 6; i++) {
            System.out.print("*");
            for (int j = 0; j < 12; j++) {
                if (i == 0 && j < 5) {
                    System.out.print("*");
                } else if (i == 5 && j < 12) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
        System.out.println("*");
    }
}
