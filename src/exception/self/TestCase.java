package exception.self;

import java.util.Scanner;

public class TestCase {


    public static void main(String[] args) {


        System.out.println("民政局  登记结婚  . 办事处");


        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try{
            if(age > 20 && age <=80 ) {
                System.out.println("祝您幸福.....");
            } else if( age > 80) {
                System.out.println("你确定么  ? ");
            } else if( age < 20 ) {
                throw new AgeException("你要不在等两年  。。。。。 ");
            }
        } catch (AgeException e) {
            e.printStackTrace();
        }




    }


}
