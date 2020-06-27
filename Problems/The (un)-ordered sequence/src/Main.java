import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prev = scanner.nextInt();
        int next;

        boolean asc = true;
        boolean desc = true;

        while (true) {
            next = prev;
            prev = scanner.nextInt();

            if (prev == 0) {
                break;
            }

            if (prev > next) {
                asc = false;
                continue;
            }

            if (prev < next) {
                desc = false;
                continue;
            }

            if (!asc && !desc) {
                break;
            }
        }

        System.out.println(asc || desc);
    }
}