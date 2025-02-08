/*

1, open, 123 -> oppeeen
2, oppeeen, 123 -> open
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    // Complete the secureChannel function below.
    static String secureChannel(int operation, String message, String key) {
        if(message.length()==0) return "-1";
        
        if(operation==1) return encode(message,key);
        else if(operation ==2) return decode(message, key);
        else return "-1";

    }
    static String encode(String message, String key){
        StringBuilder result = new StringBuilder();
        int i =0;
 
        while (i<message.length() && i<key.length()){
            int repeatCount = Integer.valueOf(String.valueOf(key.charAt(i)));
            for(int j=0;j<repeatCount;j++){
                result.append(message.charAt(i));
            }
            i++;
        }
        if(i<message.length()) result.append(message.substring(i));
        return result.toString();
        
    }
    static String decode(String message, String key){
        StringBuilder result = new StringBuilder();
        int i =0;
        int keyIndex=0;
        while (i<message.length()&& keyIndex<key.length()) {
            int repeatedCount =Integer.valueOf(String.valueOf(key.charAt(keyIndex)));
            result.append(message.charAt(i));
            i+=repeatedCount;
            keyIndex++;
        }
        if(i<message.length()) result.append(message.substring(i));
        return result.toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int operation = Integer.parseInt(bufferedReader.readLine().trim());

        String message = bufferedReader.readLine();

        String key = bufferedReader.readLine();

        String res = secureChannel(operation, message, key);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
