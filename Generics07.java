/*
   Author:linrui
   Date:2019/5/14
   Content: 泛型接口
   语法：
     interface IMessage<T> { // 在接口上定义了泛型
        public void print(T t);
       }
*/

public class Generics07 {
    public static void main(String[] args) {
        Stud<String> stud = new Stud();
        stud.print("打印的方法");
        Stud<Integer> stud2 = new Stud();
        stud2.print(02);
        Stud stud3 = new Stud();
        stud3.print("s");
    }

}

interface Stu<T> {
    T print(T t);
}

class Stud<T> implements Stu<T> {
    @Override
    public T print(T t) {
        System.out.println("print ：" + t);
        return t;
    }
}
