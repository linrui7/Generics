/*
   Author:linrui
   Date:2019/5/13
   Content:  泛型基本使用:泛型类
   语法：
      class MyClass<T> {
        T value1;
      }
   实例化：
      MyClass<String> myClass1 = new MyClass<String>();
      MyClass myClass1 = new MyClass<String>();
      MyClass myClass1 = new MyClass<>();

*/

public class Generics04 {
    public static void main(String[] args) {
        Myclass point1 = new Myclass<>();
        point1.setX(30);
        point1.setY(20);
        Myclass point2 = new Myclass<Double>();
        point2.setX(30.0);
        point2.setY(20.00);
        Myclass point3 = new Myclass();
        point3.setX("三十个");
        point3.setY("二十个");
        System.out.println(" A:" + point1.getX() + " A:" + point1.getY());
        System.out.println(" X:" + point2.getX() + " Y:" + point2.getY());
        System.out.println(" X:" + point3.getX() + " Y:" + point3.getY());
    }
}

class Myclass<T> {
    T x;
    T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}


