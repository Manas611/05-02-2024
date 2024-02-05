import java.util.ArrayList;
import java.util.Scanner;

public class Newspapaer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();

        System.out.println("Enter array elements ");
        for(int i=0;i<n+1;i++)
        {
            arr.add(sc.nextLine());
        }

        arr.remove(0);
        n = arr.size();

        String ans = "";
        for(int i=0;i<n;i++)
        {
            String temp = arr.get(i);
            int len = arr.get(i).length();
            // System.out.println(temp + " " + len);
            

            for(int j=0;j<len;j++)
            {
                if(temp.charAt(j) >= '0' && temp.charAt(j) <= '9')
                {
                    continue;
                }
                else
                {
                    ans = ans + temp.charAt(j);
                }
            }
            ans += " ";
        }

        String out = "";
        if(ans.charAt(0)>='a' && ans.charAt(0)<='z')
        {
            int val = (ans.charAt(0) - 32);
            char ch = (char)(val);
            out += ch;
        }
        else
        {
            out += ans.charAt(0);
        }

        for(int i=1;i<ans.length();i++)
        {
            if(ans.charAt(i-1) == ' ' && ans.charAt(i)>='a' && ans.charAt(i)<='z')
            {
                int val = (ans.charAt(i) - 32);
                char ch = (char)(val);
                out += ch;
            }
            else
            {
                out = out + ans.charAt(i);
            }
        }

        System.out.println(out);


    }
}
