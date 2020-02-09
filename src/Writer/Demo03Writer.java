package Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Author: wangJianBo
 * Date: 2020/2/9 11:30
 * Content:
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {

        /**
         * 两个参数的改造函数：
         *      true：可以续写
         *      false：不可以续写
         */
        FileWriter fileWriter = new FileWriter("g.txt",true);

        for (int i = 0; i < 10; i++) {
            fileWriter.write("HelloWorld" + "\r\n");
        }

        fileWriter.close();
    }
}
