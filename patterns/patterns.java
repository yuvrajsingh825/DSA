import java.util.Scanner;

class patterns {

    void pattern1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern2(int n){

        for(int i =0 ; i<n;i++){
            for(int j =0 ; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern3(int n){
        for(int i = 1 ; i<=n ;i++){
            for(int j=1 ; j<=i;j++){
                System.out.print( j);
            }
            System.out.println();
        }
    }
    void pattern4(int n){
        for(int i = 1 ; i<n;i++){
            for(int j =1 ;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    void pattern5(int n ){

        for(int i = 1;i<=n;i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern6(int n){
        
        for(int i = 1 ; i<=n;i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

    patterns p = new patterns();
       System.out.println("pattern1:");
        p.pattern1(n);
       System.out.println("pattern2:");
        p.pattern2(n);
        System.out.println("pattern3:");
        p.pattern3(n);
        System.out.println("pattern4:");
        p.pattern4(n);
        System.out.println("pattern5:");
        p.pattern5(n);
        System.out.println("pattern6:");
        p.pattern6(n);

        sc.close();
    }
}