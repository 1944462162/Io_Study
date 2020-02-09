package OutputStream; /**
 * Author: wangJianBo
 * Date: 2020/2/7 20:46
 * Content:
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 一次写多个字节的方法：
 *  如果第一个字节是正数（0-127），那么现实的时候会查询ASCII表
 *  如果第一个字节是负数，那第一个字节会和第二个字节，两个字节组成一个中文现实，系统会查询默认的码表（GBK）
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        //创建一个对象
        FileOutputStream fileOutputStream = new FileOutputStream("b.txt");
        byte[] bytes = {65,66,67,68};
        fileOutputStream.write(bytes);

        /**
         * 通过写字符的方法；可以使用String的方法把字符串，转换为字节数组
         *      byte[] getByte() 把字符串转化为字节数组
         */

        byte[] bytes1 = "你好".getBytes();
        fileOutputStream.write(bytes1);//UTF-8 中三个字节是一个中文
        fileOutputStream.close();
    }
}
