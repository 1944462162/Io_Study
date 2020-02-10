package InputStreamReader;

/**
 * Author: wangJianBo
 * Date: 2020/2/10 9:52
 * Content:
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader extends Reader
 *
 * 构造方法：
 *  InputStreamReader（InputStream in）创建一个使用默认的字符集的 InputStreamReader
 *  InputStreamReader (InputStream in,String charsetName) 创建使用指定字符集的 InputStream
 */
public class Demo01InputStreamReader {
    public static void main(String[] args) throws IOException {
        //1.创建InputStreamReader对象，构造方法中传递字节输入流和制定的编码表
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("h.txt"),"gbk");
        int len = 0;
        //使用inputStreamReader对象中的read()方法读取文件
        while ((len = inputStreamReader.read()) != -1){
            System.out.println((char) len);
        }
        //释放资源
        inputStreamReader.close();
    }
}
