/**
 * Created by ldong on 10/13/16.
 */
public class Mommyfier {
    public Mommyfier() {
    }

    public String mommyfy(String input) {

        if(!checkIfNeedToMommyfy(input)){
            return input;
        }
        // more than 30%
        String result = "";
        boolean mommyFlag=false;
        for(int i=0;i<input.length();i++){
            if(checkForVovel(String.valueOf(input.charAt(i)))){
                result=result+"mommy";
                continue;
            }
            result=result+input.charAt(i);
        }

        return result;
    }

    private boolean checkForVovel(String letter) {
        return letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u");
    }

    private boolean checkIfNeedToMommyfy(String input) {
        int vovelCount=0;
        if(input.length()==0)return false;
        for(int i=0;i<input.length();i++){

            if(checkForVovel(String.valueOf(input.charAt(i)))){
               vovelCount+=1;
            }
        }
        float vovelDensity = (float)vovelCount / input.length();
        return vovelDensity > 0.3;
    }
}
