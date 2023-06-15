package project;

public class Cipher {

    private final int key = 3;
    char alphabet;

    public String encode(String plaintext) {
        String ciphertext = "";
        for (int i = 0; i < plaintext.length(); i++) {
            alphabet = plaintext.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + key);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + key);
                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else {
                ciphertext = ciphertext + alphabet;
            }
        }
        return ciphertext;
    }

    public String decode(String ciphertext) {
        String plaintext = "";
        for (int i = 0; i < ciphertext.length(); i++) {
            alphabet = ciphertext.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet - key);
                if (alphabet < 'a') {
                    alphabet = (char) (alphabet - 'a' + 'z' + 1);
                }
                plaintext = plaintext + alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet - key);
                if (alphabet < 'A') {
                    alphabet = (char) (alphabet - 'A' + 'Z' + 1);
                }
                plaintext = plaintext + alphabet;
            } else {
                plaintext = plaintext + alphabet;
            }
        }
        return plaintext;
    }
}
