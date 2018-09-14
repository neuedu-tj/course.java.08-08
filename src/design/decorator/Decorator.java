package design.decorator;

public class Decorator implements Move {

    private MonkeyKing mk;

    public Decorator(MonkeyKing mk) {  // 如果想实例化 , 那么必须把 猴王  传进来
        this.mk = mk;
    }

    @Override
    public void fly() {
        mk.fly();
    }
}
