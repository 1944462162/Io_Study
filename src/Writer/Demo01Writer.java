package Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Author: wangJianBo
 * Date: 2020/2/9 11:12
 * Content:
 */
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        //创建一个FileWriter对象，构造方法中绑定的要写入数据的目的地
        FileWriter fileWriter = new FileWriter("d.txt");

        //使用FileWriter中的方法Writer，把数据写到内存缓冲区中（字符装换成字节的过程）
        fileWriter.write(97);

        /**
         * flush():刷新缓冲区，流对象可以继续使用
         * close();先刷新缓冲区，然后通知系统释放资源。流对象不可以在被使用了
         */
        fileWriter.flush();
        //释放资源同时会先把内存中的数据缓冲区中的数据刷新到文件中
        fileWriter.close();
    }
}
