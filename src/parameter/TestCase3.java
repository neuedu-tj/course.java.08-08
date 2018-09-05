package parameter;

public class TestCase3 {

    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5};

        System.out.println( add(   1,2,5,65,7,5,4,3,56) );

    }

    static int add(int... args) {
        int sum = 0 ;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }


}
