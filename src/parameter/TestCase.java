package parameter;

public class TestCase {

    public static void main(String[] args) {



        int a = 1;  //基本类型 传值
        int[] b = {1};   //引用类型  传址     new 大饼鸡蛋()
        add(1);
        add(b);
        System.out.println( a );
        System.out.println(b[0]);
    }

    public static void  add(int a ) {
        a +=1;
    }

    public static void  add(int a , String b ) {
        a +=1;
    }

    public static void  add(String b , int a ) {
        a +=1;
    }

    public static void  add(int[] b ) {
        b[0] = b[0]+1;
    }
}
