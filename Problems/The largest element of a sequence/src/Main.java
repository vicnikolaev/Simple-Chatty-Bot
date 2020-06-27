import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int res = size;

        while (size != 0) {
            if (res < size) {
                res = size;
            }
            size = scanner.nextInt();
        }

        System.out.println(res);
    }
}