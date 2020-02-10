package ObjectStream;

/**
 * Author: wangJianBo
 * Date: 2020/2/10 10:24
 * Content:
 */

import java.io.Serializable;

/**
 *  序列化和反序列化的时候，会破除NotSerializableException没有序列化异常
 *  类通过Serializable接口已启用序列化功能，未实现此接口的类将无法实现任何状态序列化或反序列化
 */
public class Person implements Serializable {
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
