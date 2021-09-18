package sample;

public class Rough {
    public static void main(String[] args){
        /*System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("ac"));*/
       System.out.println(longestPalindrome("cbbd"));

    }

    public static String longestPalindrome(String s) {
        String S1= new StringBuffer(s).reverse().toString();
        int loc=0;
        StringBuilder dupli= new StringBuilder();
        if (s.length()==1){
            return s;
        }
        if (s.equals(S1)){
            return s;
        }
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<S1.length();j++)
            {
                if(s.charAt(i)==S1.charAt(j) )
                {

                        loc = j;
                        dupli.append(S1.charAt(j));
                        break;

                }
                /*else if (s.charAt(i)==S1.charAt(j) j<){
                    loc=j;
                    dupli.append(S1.charAt(j));
                }*/

            }

        }
            return dupli.toString();

    }
}
