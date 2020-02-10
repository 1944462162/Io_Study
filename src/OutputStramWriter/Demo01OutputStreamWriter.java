package OutputStramWriter;

import java.io.*;

/**
 * Author: wangJianBo
 * Date: 2020/2/10 9:43
 * Content:
 */
public class Demo01OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        //1.创建OutputStreamWriter对象，构造方法中传递字节输出流和制定的编码表名称
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("h.txt"),"UTF-8");
        //2.调用outputStreamWriter中的write方法把字符转换为字节存储在缓冲区中
        outputStreamWriter.write("你好");
        //3.释放资源，并且调用Flush方法，把内存缓冲区中的字节刷新到文件中（使用字节流写入文件）
        outputStreamWriter.close();
    }
}
