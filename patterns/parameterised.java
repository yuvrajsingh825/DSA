import java.util.Scanner;

class parameterised {
    void sum(int i , int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        parameterised p = new parameterised();
        p.sum(n,0);
    }
}
