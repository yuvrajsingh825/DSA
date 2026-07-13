import java.util.Scanner;
public class problem {
    
    void print(int i , int n ){
        if(i>n){
            return;
        }
        System.out.print("Yuvraj");
        print(i+1,n);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        problem p = new problem();
        p.print(1,n);
    }
}
