package abs_inter;

public class TeacherJava extends Teacher implements 上机操作  {


    @Override
    void 开班会() {

    }

    @Override
    public void pan() {
        System.out.println("判  Java 卷子.....");
    }

    @Override
    public void lesson() {
        System.out.println("我开始上  java 课 ");
    }

    @Override
    public void control() {
        System.out.println("演示代码 .... ");
    }
}
