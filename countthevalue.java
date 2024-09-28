import java.util.Scanner;
public class countthevalue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num,count=0,box=0;
        num=in.nextInt();
        while(num!=0){
            box=num%10;
            count++;
            num=num/10;
        }
        System.out.println(count);
    }
}