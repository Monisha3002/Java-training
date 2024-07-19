import java.util.Scanner;
public class task_max {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int q=0,p=0;
        int[] arr=new int[n];
        int[] result=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int largest = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > largest) {
                    largest = arr[j];
                }
            }
            result[i] = largest;
        }
         

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}