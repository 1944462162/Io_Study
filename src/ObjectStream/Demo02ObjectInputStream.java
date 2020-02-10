package ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Author: wangJianBo
 * Date: 2020/2/10 10:38
 * Content:
 */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建ObjectInputStream对象，构造方法中传递字节输入流
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("preson.txt"));
        //使用readObject方法读取保存的文件
        Object object = objectInputStream.readObject();
        //释放资源
        objectInputStream.close();
        //将对象读取出来
        System.out.println(object);
    }
}
