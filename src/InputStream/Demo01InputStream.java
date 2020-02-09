package InputStream;

/**
 * Author: wangJianBo
 * Date: 2020/2/9 9:37
 * Content:
 */

import java.io.FileInputStream;
import java.io.IOException;

/**
 * InputStream : 次抽象类是表示字节输入流的所有类的超类
 *
 * 定义了所有子类共有的方法：
 *      int read（） 从输入流读取数据的下一个字节
 *      int read（byte[] b）从输入流中读取一定数量的字节，并将其存储在缓冲区数组中
 *      void close（） 关闭输入流并释放与关闭流所有的资源
 *
 * FileInputStream：文件字节输入流
 * 作用：把硬盘文件中的数据，读取到内存中
 *
 * 构造方法：
 *      FileInputStream（String name）
 *      FileInputStream(String file)
 *      参数：读取文件的数据源
 *          String name： 文件的路径
 *          File file：文件
 *      构造方法的作用：
 *          1.会创建一个FileInputStream对象
 *          2.会把FIleOutputStream对象指定构造方法中要读取的文件
 *
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("a.txt");

        int len = 0;
        while ((len = fileInputStream.read()) != -1){
            System.out.println((char)len);
        }
        fileInputStream.close();
    }
}
