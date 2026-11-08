public class pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // outer loop: rows
            for (int j = 1; j <= i; j++) { // inner loop: numbers in a row
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
