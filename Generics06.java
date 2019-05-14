/*
   Author:linrui
   Date:2019/5/14
   Content: 通配符
   作用：可以接收所有的泛型类型，但是又不能够让用户随意修改
   ? extends 类：设置泛型上限：
   ? super 类：设置泛型下限：
   上限可以用在声明，不能修改；而下限只能用在方法参数，可以修改内容！
*/

public class Generics06 {
    public static void main(String[] args) {
        //此时实例化对象Message对象传入参数为String类型
        Message<String> mes= new Message();
        mes.setMessage("String Message");
        Message<? super Integer> message=new Message<>();
        message.setMessage(20);
    }
}

class Message<T> extends Generics06{
    T message;

    T getMessage() {
        return message;
    }

    void setMessage(T message) {
        this.message = message;
    }
}