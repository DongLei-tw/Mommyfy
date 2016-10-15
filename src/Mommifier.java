/**
 * Created by ldong on 10/13/16.
 */
public class Mommifier {

    private static final float Threshold = 0.3f;

    private static final String VowelString = "aeiou";

    private static final String ReplaceString = "mommy";

    public Mommifier() {

    }

    public String mommify(String input) {

        if (isNeedMommify(input)) {
            return replace(input);
        }

        return input;
    }

    private String replace(String input) {

        String result = "";

        if (input.length() == 1 && isVowel(input.charAt(0))) {
            return ReplaceString;
        }

        for (int i = 0; i < input.length(); i++) {
            result += getNextChar(input, i, i - 1);
        }

        return result;
    }

    private String getNextChar(String input, int currentIndex, int previousIndex) {

        String next = "";

        if (isVowel(input.charAt(currentIndex))) {

            if (previousIndex >= 0 && !isVowel(input.charAt(previousIndex))) {
                next = ReplaceString;
            }

        } else {
            next = input.charAt(currentIndex) + "";
        }
        return next;
    }


    private boolean isNeedMommify(String input) {

        if (input.length() == 0) {
            return false;
        }

        int vowelCount = getVowelCount(input);

        float vowelDensity = (float) vowelCount / input.length();

        return vowelDensity > Threshold;
    }

    private boolean isVowel(char letter) {

        return VowelString.indexOf(letter) >= 0;
    }

    private int getVowelCount(String input) {

        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (isVowel(input.charAt(i))) {
                vowelCount += 1;
            }
        }

        return vowelCount;
    }
}
