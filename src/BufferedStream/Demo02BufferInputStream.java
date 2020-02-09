package BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Author: wangJianBo
 * Date: 2020/2/9 17:10
 * Content:
 */
public class Demo02BufferInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("b.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int len = 0;
        while ((len = bufferedInputStream.read()) != -1){
            System.out.println(len);
        }

        bufferedInputStream.close();
    }
}
