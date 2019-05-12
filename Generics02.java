/*
   Author:linrui
   Date:2019/5/12
   Content: JDK1.5后的foreach循环

      for(数据类型 临时变量 : 数组(集合)) {
      循环次数为数组长度，而每一次循环都会顺序取出数组中的一个元素赋值给临时变量
      }

   优点：可以很好的避免数组越界的问题
   缺点：但是这种数组的操作只适合简单输出模式。
*/

public class Generics02 {
    public static void print1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void print2(int[] array) {
        for (int i : array) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 3, 6};
        print1(arr);
        System.out.println();
        print2(arr);
    }
}
