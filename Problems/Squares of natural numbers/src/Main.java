import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int res = 1;
        int tmp = 1;

        do {
            System.out.println(res);
            tmp += 1;
            res = tmp * tmp;
        } while (res <= size);
    }
}
