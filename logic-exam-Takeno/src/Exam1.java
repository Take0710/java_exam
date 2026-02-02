public class Exam1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int y = 1; y <= 9; y++) {
                int num = i * y;
                if (num < 10) {
                    System.out.print(" " + ("0") + (num) + " ");
                } else {
                    System.out.print(" " + num + " ");
                }
            }
            System.out.println();
        }
    }
}
