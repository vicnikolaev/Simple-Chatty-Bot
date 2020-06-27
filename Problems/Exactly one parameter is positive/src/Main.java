import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int check = 0;

        if (one > 0) {
            check += 1;
        }
        if (two > 0) {
            check += 1;
        }
        if (three > 0) {
            check += 1;
        }

        if (check == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}