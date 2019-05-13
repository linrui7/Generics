/*
   Author:linrui
   Date:2019/5/13
   Content:   JDK1.5引入了三大常用新特性：泛型、枚举(enum)、注解（Annotation）。
   eg:
   如果传入的参数是int型或者double型，或者字符串
   那么就可以定义泛型，参数类型根据传入参数的类型而改变
*/

public class Generics03 {
    public static void main(String[] args) {
        Point point1=new Point();
        point1.setX(30);
        point1.setY(20);
        Point point2=new Point();
        point2.setX(30.0);
        point2.setY(20.00);
        Point point3=new Point();
        point3.setX("三十个");
        point3.setY("二十个");
        System.out.println(" X:"+point1.getX()+" Y:"+point1.getY());
        System.out.println(" X:"+point2.getX()+" Y:"+point2.getY());
        System.out.println(" X:"+point3.getX()+" Y:"+point3.getY());
    }
}
class Point{
    Object x;
    Object y;

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }
}
