import java.util.Scanner;
class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number is: " + n);

        int reverse =0;
        while(n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        System.out.println("The reversed number is: " + reverse);
    }
}

