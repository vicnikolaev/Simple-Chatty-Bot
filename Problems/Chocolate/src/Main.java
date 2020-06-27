import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int k = scanner.nextInt();

        if (k > length * width) {
            System.out.println("NO");
        } else if (k == length * width) {
            System.out.println("YES");
        } else if ((k % length == 0) || (k % width == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}