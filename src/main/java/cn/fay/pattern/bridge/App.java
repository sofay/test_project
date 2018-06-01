package cn.fay.pattern.bridge;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/13 上午10:27.
 */
public class App {
    public static void main(String[] args) {
        new StreetRoad(new PersonalCar(new Man())).run();
        new StreetRoad(new PersonalCar(new Women())).run();
        new StreetRoad(new BusCar(new Man())).run();
        new StreetRoad(new BusCar(new Women())).run();
        new SpeedRoad(new PersonalCar(new Man())).run();
        new SpeedRoad(new PersonalCar(new Women())).run();
        new SpeedRoad(new BusCar(new Man())).run();
        new SpeedRoad(new BusCar(new Women())).run();
    }
}
