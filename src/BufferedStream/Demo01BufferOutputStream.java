package BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author: wangJianBo
 * Date: 2020/2/9 17:04
 * Content:
 */
public class Demo01BufferOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write("我把数据写入到内存缓冲区中".getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
