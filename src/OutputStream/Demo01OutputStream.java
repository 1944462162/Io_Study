package OutputStream; /**
 * Author: wangJianBo
 * Date: 2020/2/7 20:22
 * Content:
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.OutputStream: 字节输出流
 *      此抽象类是表示输出字节的所有类的超类
 *
 * java.io.FileOutputStream extend OutputStream
 * FileOutputStream: 文件字节输出流
 * 作用：把内存中的数据写到硬盘的文件中
 *
 * 构造方法：
 *      FileOutputStream(String name) 创建一个具有指定名称的文件中写入数据的输出文件流
 *      FileOutputStream(File file) 创建一个指定 File 对象表示的文件中写入的数据的文件输出流
 *      参数：写入文件的目的地：
 *          String name:目的地是一个文件的路径
 *          File file：目的地是一个文件
 *      构造方法的作用：
 *          1.创建一个FileOutputStream对象
 *          2.会根据方法中创建的文件/文件路径，创建一个空的文件
 *          3.会把FileOutputStream对象指向创建好的文件
 *
 *      写入数据的原理
 *          java程序——》JVM（java虚拟机）——》os（操作系统）——》os调用写数据的方法——》把数据写到文件中
 *
 *      字节输出流的使用步骤（重点）：
 *          1.创建一个FileOutputStream对象，构造方法传递写入到目的地
 *          2.调用FileOutputStream对象中的方法write，把数据写入到文件中
 *          3.释放资源（流会占用一定的资源，使用完毕要把内存轻控股，提高的程序的效率）
 *
 *      存储数据的原理：
 *          写入数据的时候会把10进制的整数转换为二进制的整数
 *          将使用文本编辑器打开的时候，都会查询编码表
 *              0-127：查询ASCII码表
 *              其他的值查询系统的默认值
 */
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
        fileOutputStream.write(128);
        fileOutputStream.close();
    }
}
