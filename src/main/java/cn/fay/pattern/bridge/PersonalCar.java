package cn.fay.pattern.bridge;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/13 上午10:27.
 */
public class PersonalCar extends Car {
    private People people;
    public PersonalCar(People people) {
        this.people = people;
    }
    @Override
    void run() {
        people.run();
        System.out.print("私家车");
    }
}
