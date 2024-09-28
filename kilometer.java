import java.util.Scanner;
public class kilometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit =sc.nextInt();
        int day=sc.nextInt(); int n,total=0;
        for(int i=1;i<limit;i++) {
            n = sc.nextInt();
            n = n + i;
            total = n * day;
        }
        System.out.println(total);
    }
}
