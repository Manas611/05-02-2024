
import java.util.*;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int ans = 0;
        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2 == 0)
            {
                ans += 1;
            }
            else
            {
                if(arr[i] == 5)
                {
                    ans += 5;
                }
                else
                    ans += 3;
            }
        }

        System.out.println(ans);

    }
}
