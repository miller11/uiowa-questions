import org.hsqldb.lib.HashMappedList;

import java.io.*;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaSolution {
    public static void main(String[] args){
        String pattern = ".@\\d{1,3}(?:\\.\\d{1,3}){3}(?::\\d{1,5})?";
        Pattern compiledPattern = Pattern.compile(pattern);
        HashMap<String, String> map = new HashMap<String, String>();


        try {
            DataInputStream dataInputStream = new DataInputStream( new FileInputStream("uiowa.example.log.2011-11-14"));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
            String inputLine = bufferedReader.readLine();


            while (inputLine != null){
                Matcher matcher = compiledPattern.matcher(inputLine);
                if(matcher.find()){
                  map.put(inputLine.substring(inputLine.indexOf("[") + 1, inputLine.indexOf("@")), null);
                }
                inputLine = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            //Some better logging
            e.printStackTrace();
        } catch (IOException e) {
            //Some better logging
            e.printStackTrace();
        }

        System.out.println(map.size());
    }
}
