import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr2 = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            int num = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (num == arr[j]) {
                    count++;
                    arr2[j] = -1;
                }
            }
            if (arr2[i] != -1)
                arr2[i] = count;
            System.out.println(count);

        }

    }

}
