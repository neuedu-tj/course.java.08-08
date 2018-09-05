package parameter;

public class TestCase2 {

    public static void main(String[] args) {

        int a = 11;

        Stu s1 = new Stu();
        s1.setAge(a);
        s1.setName("tom");

        Stu[] stus = {s1};

        System.out.println(stus[0].getName());
        System.out.println(stus[0].getAge());

        System.out.println("--------------------");

        s1.setName("jack");
        a = 12;

        System.out.println(stus[0].getName());
        System.out.println(stus[0].getAge());


    }
}
