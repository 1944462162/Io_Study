package BufferedStream;

import java.io.*;
import java.util.HashMap;

/**
 * Author: wangJianBo
 * Date: 2020/2/9 17:39
 * Content:
 */
public class Demo05Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("b.txt"));

        HashMap<String, String> map = new HashMap<>();
        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);
        }
        for (String s : map.keySet()) {
//            System.out.println(s + "." + map.get(s));
            bufferedWriter.write(s + "." + map.get(s));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();


    }
}
