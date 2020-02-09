package InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Author: wangJianBo
 * Date: 2020/2/9 10:10
 * Content:
 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("b.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fileInputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        fileInputStream.close();
    }
}
