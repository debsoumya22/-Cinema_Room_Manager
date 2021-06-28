import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int currentMax = 0;
        while (scan.hasNext()) {
            int b = scan.nextInt();
            if (b % 4 == 0 && b > currentMax) {
                currentMax = b;
            }
        }
        System.out.println(currentMax);
    }
}
