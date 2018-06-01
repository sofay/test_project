import java.util.Date;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/3/27 下午8:40.
 */
public interface InterfaceDefault {
    void nonDefault(String name, Date date, Object obj, int id);

    default void test(String fffffffay) {
        long innerV1 = 0;
        Double[][] innerV3 = new Double[0][0];
        Object innerV2 = null;
        System.out.println("hello");
        System.out.println(innerV1);
        System.out.println(innerV2);
        System.out.println(innerV3);
    }
}
