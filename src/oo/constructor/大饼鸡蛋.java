package oo.constructor;

public class 大饼鸡蛋 {

    int egg;
    boolean spice;
    int type;  // 1. 代表用大饼卷一切   2. 代表用烧饼

    大饼鸡蛋() {
        this.egg = 2;
        this.spice = false;
        this.type = 1;
    }


    大饼鸡蛋(int egg) {
        this.egg = egg;
        this.spice = false;
        this.type = 1;
    }

    大饼鸡蛋(int egg , boolean spice) {
        this.egg = egg;
        this.spice = spice;
        this.type = 1;
    }


}
