package cn.fay.pattern.bridge;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/13 上午10:26.
 */
public class BusCar extends Car {
    private People people;

    public BusCar(People people) {
        this.people = people;
    }

    @Override
    void run() {
        people.run();
        System.out.print("公共汽车");
    }
}
