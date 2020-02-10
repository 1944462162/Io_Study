package ObjectStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Author: wangJianBo
 * Date: 2020/2/10 10:29
 * Content:
 */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建ObjectOutputStream对象，构造方法中传递字节输入流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("preson.txt"));
        //2.使用ObjectOutputStream对象中的writeObject方法将对象写入文件中
        objectOutputStream.writeObject(new Person("美美",18));
        //释放资源
        objectOutputStream.close();
    }
}
