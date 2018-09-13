package exception.basic;

public class TestCase {

    public static void main(String[] args) {

        try {

            Integer.parseInt("asdasd1");

            Class.forName("abc");
            System.out.println(1/0);

        } catch (ClassNotFoundException e) {
            System.err.printf("类 没找到....");
        } catch (ArithmeticException e) {
            System.err.printf("数学错误 .... ");
        } catch (Exception e) {
            System.out.println(" 具体是什么不知道 , 反正有错 ...... ");
        }


    }


}
