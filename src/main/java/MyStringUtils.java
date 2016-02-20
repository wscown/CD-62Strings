import java.util.*;

/**
 * Created by wscown on 2/19/16.
 */
public class MyStringUtils {

    public static String combine(char[] input){
        if(input.length > 1){
            return input[0] + "," + combine(Arrays.copyOfRange(input, 1, input.length));
        }else {
            return Character.toString(input[0]);
        }
    }

    public static String combine(String[] input){
        if(input.length > 1){
            return input[0] + "," + combine(Arrays.copyOfRange(input, 1, input.length));
        }else {
            return input[0];
        }
    }

    public static String[] separate(String input){
        return input.split("\\n");
    }

    public static String reverseCaptial(String input){

        String output ="";
        char c;

        for(int i = 0; i < input.length(); i++){
            c = input.charAt(i);

            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    output += Character.toLowerCase(c);
                }else{
                    output += Character.toUpperCase(c);
                }
            }else{
                output += c;
            }
        }
        return output;
    }

    public static String reverseWords(String input){

        String [] words = input.split(" ");

        String output = "";

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                output += words[i].charAt(words[i].length() - (1 + j));
            }
            output += " ";
        }

        return output.substring(0, output.length() - 1);
    }

    public static String[] noWhiteSpaceLineSeperated(String input){

        return input.trim().split(" +");
    }

    public static String[] everySubstring(String input){

        int arraylength = sumSeries(input.length());

        String[] answer = new String[arraylength];

        int reset;
        int counter = 0;

        for(int i = 1; i <= input.length(); i++){
            reset = 0;
            while((reset + i) <= input.length()){
                answer[counter] = input.substring(reset, reset + i);
                counter++;
                reset++;
            }
        }

        return answer;
    }

    private static int sumSeries(int i){
        if(i == 1){
            return 1;
        }else{
            return i + sumSeries(i - 1);
        }
    }

    public static String stringManipulation(String[] input){

        String output = "";
        String wordholder;

        for(int i = 0; i < input.length; i++){
            if(input[i].length() > 80){
                wordholder = input[i].substring(0, 80);
            }else{
                wordholder = input[i];
            }
            output += String.format("%80s%5s", wordholder, Integer.toHexString(input[i].length())) +'\n';
        }

        return output.substring(0, output.length() - 1);
    }
}
