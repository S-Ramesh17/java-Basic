import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*  Decrypt rule (inferred from your code)
        1. Split encryptedMessage by spaces.
        2. Process words right‑to‑left.
        3. Inside each word, drop subsequent occurrences of the same character.
    */
    public static String decryptMessage(String encryptedMessage) {
        String[] words = encryptedMessage.split(" ");
        StringBuilder out = new StringBuilder();

        // iterate from last word to first
        for (int w = words.length - 1; w >= 0; w--) {
            boolean[] seen = new boolean[256];          // ASCII lookup
            for (char c : words[w].toCharArray()) {
                if (!seen[c]) {                         // first time
                    out.append(c);
                    seen[c] = true;
                }
            }
            if (w > 0) out.append(' ');                 // add space between words
        }
        return out.toString();
    }
}

public class Decryption {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String encryptedMessage = br.readLine();

        System.out.println(Result.decryptMessage(encryptedMessage));
    }
}
