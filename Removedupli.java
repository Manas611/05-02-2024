public class Removedupli {
    public static void main(String[] args) {
        String s = "aazbbby";
        int n = s.length();
        String ans = "";

        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i) != s.charAt(i+1))
            {
                ans = ans + s.charAt(i);
            }
        }
        char ch = ans.charAt(ans.length()-1);

        if(ch != s.charAt(n-1))
        {
            ans = ans + s.charAt(n-1);
        }

        System.out.println(ans);
    }
}
