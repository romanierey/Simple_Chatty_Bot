import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r = (int) Math.ceil(h-a)%(a-b) ;
        int z = (int) Math.ceil (1 + (h-a)/(a-b) + 2 - ( r + 2 )/(r+1));
            System.out.println(z);
    }
}