public class _2_2CheckEInUmbrella{
    
    public static boolean checkLetter(String word, char letter){
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                return true;
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        String word = "Umbrella";
        char letter = 'e';

        if(checkLetter(word,letter)){
            System.out.println("Yes the word "+word+" has letter "+letter+" in it!");
        }else{
            System.out.println("No the word "+word+" do not have letter "+letter+" in it!");
        }

    }
}