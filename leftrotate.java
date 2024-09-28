import java.util.Scanner;
public class leftrotate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[]arr=new int[n];
        int temp=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println(arr);
    }
}
