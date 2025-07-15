class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
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
}
