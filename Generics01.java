/*
   Author:linrui
   Date:2019/5/12
   Content:
   JDK1.2: 推出了轻量级的界面包：Swing
   JDK1.5: 推出新程序结构的设计思想。
   JDK1.8: Lambda表达式、接口定义加强
   JDK1.5之后追加了可变参数
   public [static] [final] 返回值 方法名称([参数类型 参数名称][参数类型 ... 参数名称]){}
   如果要传递多类参数，可变参数一定放在最后，并且只能设置一个可变参数
*/


public class Generics01 {

    //传入单个变量的求和函数
    public static int add(int... data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    //如果是多参数，可变参数应该放在最后边
    public static int add(String string, int... data) {
        System.out.print(string);
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(add(new int[]{1, 2, 3}));
        System.out.println(add(new int[]{1, 2, 3, 5}));
        System.out.println(add(new int[]{1, 2, 3, 5, 6}));
        System.out.println(add("值是：", new int[]{1, 2, 3}));
        System.out.println(add("值是：", new int[]{1, 2, 3, 5}));
        System.out.println(add("值是：", new int[]{1, 2, 3, 5, 6}));
    }
}
