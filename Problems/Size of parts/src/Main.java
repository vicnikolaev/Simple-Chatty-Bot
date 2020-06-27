import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int num;

        int countLarger = 0;
        int countSmaller = 0;
        int countPerfect = 0;

        for (int i = 0; i < size; i++) {
            num = scanner.nextInt();

            if (num == 1) {
                countLarger += 1;
            } else  if (num == -1) {
                countSmaller += 1;
            } else {
                countPerfect += 1;
            }
        }

        System.out.print(countPerfect + " " + countLarger + " " + countSmaller);
    }
}