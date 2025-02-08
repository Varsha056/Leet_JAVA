/*
{123,2345,4532, 564321, 267} -> 123,564321
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the function below.
     */
    static String findQualifiedNumbers(int[] numberArray) {
        if(numberArray.length==0) return "-1";
        List<Integer> validNum = new ArrayList<>();
        for(int num : numberArray){
            String value = String.valueOf(num);
            if(value.contains("1")&&value.contains("2")&& value.contains("3")) validNum.add(num);
        }   
        if(validNum.isEmpty()) return "-1";
        Collections.sort(validNum);
        StringBuilder result = new StringBuilder();
        for(int i =0;i<validNum.size();i++){
            result.append(validNum.get(i));
            if(i<validNum.size()-1) result.append(",");
        }
        return result.toString();
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String res;
        int numberArray_size = 0;
        numberArray_size = Integer.parseInt(in.nextLine().trim());

        int[] numberArray = new int[numberArray_size];
        for(int i = 0; i < numberArray_size; i++) {
            int numberArray_item;
            numberArray_item = Integer.parseInt(in.nextLine().trim());
            numberArray[i] = numberArray_item;
        }

        res = findQualifiedNumbers(numberArray);
        bw.write(res);
        bw.newLine();

        bw.close();
    }
}
