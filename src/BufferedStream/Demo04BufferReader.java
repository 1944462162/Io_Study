package BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * Author: wangJianBo
 * Date: 2020/2/9 17:27
 * Content:
 */
public class Demo04BufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("a.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
