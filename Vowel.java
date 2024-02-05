public class Vowel {
    public static void main(String[] args) {
        String s = "helloworld";
        int i = 0;
        int n = s.length();
        int j = n/2;

        int cnt1 = 0,cnt2 = 0;

        for(;i<n/2;i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                cnt1++;
            }

            if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u') {
                cnt2++;
            }

            j++;
        }
        if(cnt1 == cnt2)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
