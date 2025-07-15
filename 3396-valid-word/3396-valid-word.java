class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                // If character is not a letter or digit → invalid
                return false;
            }

            if (Character.isLetter(ch)) {
                if (vowel(ch)) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        return hasVowel && hasConsonant;
    }

    public boolean vowel(char a) {
        a = Character.toLowerCase(a);
        return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u');
    }

    public boolean num(char a) {
        return (a >= '0' && a <= '9');
    }
}
