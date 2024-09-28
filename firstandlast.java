import java.util.Scanner;
public class firstandlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(first(n)+" "+last(n));
    }
    static int first(int n){
        while(n>=10){
            n=n/10;
        }
        return n;
    }
    static int last(int n){
            n=n%10;
            return n;
        }
    }
