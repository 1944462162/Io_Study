package Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Author: wangJianBo
 * Date: 2020/2/9 11:23
 * Content:
 */
public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("f.txt");
        char[] chars = {'a','b','c','d'};

        //void write(char[] cbuf)写入字符数组的方法
        fileWriter.write(chars);

        //void write(char[] cbuf, int off, int len) 写入字符的一部分
        fileWriter.write(chars,1,3);

        //写入字符串的方法
        fileWriter.write("内蒙古科技大学");

        //写字符串中的一部分字符
        fileWriter.write("ACMer",0,3);
        fileWriter.flush();
        fileWriter.close();
    }
}
