package daytwo.timeconversion;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String arr[]=s.split(":");
        String time=arr[2].substring(2);
        arr[2]=arr[2].substring(0,2);
        int hour=Integer.parseInt(arr[0]);
        if(time.equals("AM")){
            if(hour==12)
                arr[0]="00"; 
        }
        else{
            if(hour!=12)
                hour+=12;
            arr[0]=String.valueOf(hour%24);
        }
        return arr[0]+":"+arr[1]+":"+arr[2];
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
