import java.util.Scanner;
class arraylargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); 
        int flag=0;
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max = 0;
        for(int i=0;i<arr.length;i++) {

            if (arr[i] > max) {
                max = arr[i];
                flag = 1;
            }

        }
        System.out.println(max);
    }
}