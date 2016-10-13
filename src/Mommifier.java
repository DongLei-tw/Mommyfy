import java.util.Arrays;
import java.util.List;

/**
 * Created by ldong on 10/13/16.
 */
public class Mommifier {

    private static final float Threshold = 0.3f;
    
    private static final String VovelString = "aeiou";

    public Mommifier() {

    }

    public String mommify(String input) {

        if (isNeedMommify(input)) {

            return replace(input);
        }

        return input;
    }

    private String replace(String input) {
        String str = "";
        for (int i = 0; i < input.length(); i++) {

            if (isVowel(input.charAt(i))) {
                str += "mommy";
            } else {
                str += input.charAt(i);
            }
        }
        return str;
    }


    private boolean isNeedMommify(String input) {

        if (input.length() == 0){
            return false;
        }

        int vowelCount = getVowelCount(input);

        float vowelDensity = (float) vowelCount / input.length();

        return vowelDensity > Threshold;
    }

    private boolean isVowel(char letter){
        return VovelString.indexOf(letter) >= 0;
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
