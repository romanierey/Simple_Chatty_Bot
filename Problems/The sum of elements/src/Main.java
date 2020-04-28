import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        int sum = 0;
        do {
            value = sc.nextInt();
            sum += value;
        } while (value != 0);
        System.out.println(sum);
    }
}
