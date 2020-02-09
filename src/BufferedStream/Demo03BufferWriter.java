package BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Author: wangJianBo
 * Date: 2020/2/9 17:20
 * Content:
 */
public class Demo03BufferWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("创智播客");
//            bufferedWriter.write("\r\n");
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
