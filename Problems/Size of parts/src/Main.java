import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int i;
        int a = sc.nextInt();
        for (i = 0; i < a; i++) {
            int b = sc.nextInt();
            if (b == 0) {
                sum += 1;
            } else if (b == 1) {
                sum1 += 1;
            } else if (b == -1) {
                sum2 += 1;
            }
        }
        System.out.printf("%d %d %d", sum, sum1, sum2);
    }
}