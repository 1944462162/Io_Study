package Reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Author: wangJianBo
 * Date: 2020/2/9 10:47
 * Content:
 */

/**
 * java.io.Reader:字符输入流，是字符输入流最顶层的父类，定义了共性的成员方法，是一个抽象类
 *
 * 共性的成员方法：
 *      int read（）读取单个字符并返回
 *      int read（char[] buf）一次读取多个字符，将字符读入数组
 *      void close（） 关闭该流并释放预支关联的所有资源
 *
 *  FileReader extends InputStreamReader extends Reader
 *
 *  FileReader 作用：将文件数据以字符的方式读取到内存中
 *
 *  构造方法：
 *      FileReader(String name)
 *      FileReader(File file)
 *      参数读取文件的数据源：
 *          String filename：文件的路径
 *          File file: 一个文件
 *     FileReader构造方法的作用：
 *          1.创建一个FileReader对象
 *          2.会把FileReader对象指向要读取的文件
 */
public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("c.txt");

//        int len = 0;
//        //单个字符的方式进行读取
//        while((len = fileReader.read()) != -1){
//            System.out.println((char) len);
//        }

        //多个字符的方式进行读取

        char[] chars = new char[1024];
        int len1 = 0;
        while ((len1 = fileReader.read(chars)) != -1){
            //通过String的构造方法将字符数组转化为字符串进行输出
            System.out.println(new String(chars,0,len1));
        }
        fileReader.close();
    }
}
