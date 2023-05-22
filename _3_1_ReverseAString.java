public class _3_1_ReverseAString {
    public static void main(String[] args) {
        String word = "KnightArmour";
        String revword = "";
        char ch;

        System.out.println("Original String: "+ word);

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            revword = ch+revword;
        }

        System.out.println("Reversed String: "+revword);
    }
}
