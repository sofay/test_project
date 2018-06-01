package cn.fay.pattern.bridge;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/13 上午10:25.
 */
public class StreetRoad extends Road {
    private Car car;

    public StreetRoad(Car car) {
        this.car = car;
    }

    @Override
    void run() {
        car.run();
        System.out.println("在市区道路上");
    }
}
