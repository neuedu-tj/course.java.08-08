package oo.polymorphic;

public class Park {

    void parking(Auto auto) {

        if(auto instanceof  Bus) {
            System.out.println("一小时 20");
        } else if( auto instanceof  Car) {
            System.out.println("一小时 2");
        }else if( auto instanceof  Bike) {
            System.out.println("共享单车 不准入内 ...   ");
        } else {
            System.out.println(" 不能存 坦克 .. . . . . ");
        }
    }

}
