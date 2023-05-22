public class _2_1DupWordString {
    public static void main(String[] args) {
        String text = "Java is a programming language. Java is widely used in CPP the software industry. Java is an object-oriented language. CPP";

        int count = countDuplicateWords(text);
        System.out.println("Number of duplicate words: " + count);
    }

    public static int countDuplicateWords(String text) {
        int count = 0;

        String[] words = text.split("\\s+");

        boolean[] visited = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {
            if (!visited[i]) {
                int frequency = 1;

                // Compare the current word with the remaining words
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        frequency++;
                        visited[j] = true;
                    }
                }

                // If frequency is greater than 1, it means a duplicate word is found
                if (frequency > 1) {
                    count++;
                }
            }
        }

        return count;
    }
}
