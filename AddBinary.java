public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";

        int i = 0;
        int n = a.length();
        int m = b.length();
        int carry = 0;
        StringBuilder ans = new StringBuilder();

        while(i<n || i<m)
        {
            int x = 0;
            if(i<n && a.charAt(n-i-1) == '1')
            {
                x = 1;
            }


            int y = 0;
            if(i<m && b.charAt(m-i-1) == '1')
            {
                y = 1;
            }

            int sum = x+y+carry;

            ans.append(sum%2);
            carry = sum/2;
            i++;
        }
        if(carry == 1)
        {
            ans.append(1);
        }
        ans.reverse();


        System.out.println(ans);
    }
}
