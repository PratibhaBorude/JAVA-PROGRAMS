public class Strings {

    public static char firstNonRepeatingCharacter(String s) {
        if (s == null ) {
            return '\0';
        }

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            boolean isRepeating = false;

            for (int j = 0; j < chars.length; j++) {
                if (i != j && chars[j] == currentChar) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return currentChar;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("swiss"));
        System.out.println(firstNonRepeatingCharacter("programming"));
        System.out.println(firstNonRepeatingCharacter("aabbcc"));
    }
}