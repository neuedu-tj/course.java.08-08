package oo.encapsulation;

public class TestCase {

    public static void main(String[] args) {

            Person p = new Person();

            Emp tom = new Emp();
            tom.person = p;


            Emp jack = new Emp();

            tom.up = jack;


//
//            tom.up.person.name;
//
//            tom.down[1].person.addr[0].detail




    }
}
