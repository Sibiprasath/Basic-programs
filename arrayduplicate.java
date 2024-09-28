import java.util.Scanner;
class arrayduplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int[]freq=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = -1;
                }
            }
            if (freq[i]!= -1) {
                freq[i] = count;
            }
        }
            for(int i=0;i<arr.length;i++){
                if(freq[i]==1){
                    System.out.println(arr[i]+"terms"+freq[i]);
                }
            }

    }
}