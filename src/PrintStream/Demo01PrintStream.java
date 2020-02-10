package PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Author: wangJianBo
 * Date: 2020/2/10 11:25
 * Content:
 */

/**
 * PrintStream 打印流：
 *      PrintStream为其他输出流添加了功能，使他们能够方便地打印各种数据值表示形式。
 * PrintStream的特点：
 *      1.只负责数据的输出，不负责数据的读取
 *      2.与其他输出流不同，PrintStream永远不会抛出IOException
 *      3.特有的方法，print，println
 * 构造方法：
 *      PrintStream(File file):输出的目的地是一个文件
 *      PrintStream（OutputStream out）：输出的目的文件是一个字节输出流
 *      PrintStream（String filename）: 输出的目的地是一个文件路径
 *  PrintStream extends OutputStream
 *
 *  注意：
 *      使用write方法写数据的话，会查看编码表
 *      使用自己特有的方法写的话print、println写的数据会原样输出
 */
public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream("print.txt");
        printStream.write(97);
        printStream.println(97);

        /**
         * 设置输出语句的目的地
         */
        System.setOut(printStream);
        System.out.println("打印在文件中");
        printStream.close();
    }
}
