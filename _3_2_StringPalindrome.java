public class _3_2_StringPalindrome {
    public static void main(String[] args) {
        String word = "DAD";
        String revword = "";
        char ch;

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            revword = ch+revword;
        }

        if (word.equals(revword)) {
            System.out.println("Yes the word "+word+" is a palindrome");
        }else{
            System.out.println("No the word "+word+" is not a palindrome");
        }

    }
}
