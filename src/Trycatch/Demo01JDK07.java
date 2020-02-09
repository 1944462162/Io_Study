package Trycatch;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author: wangJianBo
 * Date: 2020/2/9 11:54
 * Content:
 */
public class Demo01JDK07 {

    public static void main(String[] args) {

        /**
         * jdk7特性：
         *      将创建文件的代码写到try后面的括号中
         *      将其余代码写到后面的大括号中，不用释放资源
         *      在catch中写异常的代码
         *
         */
        try(FileOutputStream fileOutputStream = new FileOutputStream("a.txt")){
            fileOutputStream.write(97);
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
