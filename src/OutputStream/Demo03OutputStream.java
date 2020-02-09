package OutputStream; /**
 * Author: wangJianBo
 * Date: 2020/2/7 20:46
 * Content:
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {

        /**
         * FileOutputStream(String name,boolean append)
         *  参数：
         *      String name, File name: 写入数据的目的地
         *      Boolean append：追加写开关
         *          true：创建对象不会覆盖源文件，继续在源文件末尾追加数据
         *          false：创建一个文件，覆盖源文件
         *
         * 换行符：写换行符
         *      windows：\r\n
         *      linux： \n
         *      mac: \r
         */
        FileOutputStream fileOutputStream = new FileOutputStream("c.txt",false);

        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("你好".getBytes());
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();
    }
}
