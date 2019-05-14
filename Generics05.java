/*
   Author:linrui
   Date:2019/5/14
   Content: 泛型基本使用:泛型方法
  语法：
     class MyClass{
         public <T> void testMethod(T t) {
             System.out.println(t);
           }
        }
*/

public class Generics05 {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="张三";
        student.age=20;
        student.print(student.name,student.age);
        Student<String> student1=new Student();
        student1.age="20";
        student1.name="zzzz";
        student1.print(student1.name,student1.age);
    }
}

class Student<T> {
    T name;
    T age;
    public  void print(T name, T age) {
        System.out.println("学生姓名是：" + name + " 年龄为：" + age);
    }
    public <T> T print2(T t){
        return t;
    }
}
