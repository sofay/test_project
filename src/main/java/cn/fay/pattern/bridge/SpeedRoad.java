package cn.fay.pattern.bridge;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/13 上午10:25.
 */
public class SpeedRoad extends Road {
    private Car car;

    public SpeedRoad(Car car) {
        this.car = car;
    }

    @Override
    void run() {
        car.run();
        System.out.println("在高速公路上");
    }
}
