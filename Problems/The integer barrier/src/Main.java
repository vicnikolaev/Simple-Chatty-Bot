import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int res = 0;

        while (number != 0) {
            res += number;

            if (res >= 1000) {
                res -= 1000;
                break;
            }

            number = scanner.nextInt();
        }

        System.out.println(res);
    }
}