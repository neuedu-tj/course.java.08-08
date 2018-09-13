package exception.thr_ows;

public class TestCase {

    public static void main(String[] args) {

        Bean bean = new Bean();
        try {
            bean.method();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
