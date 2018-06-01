package cn.fay.spring.cache;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/6/4 下午4:28.
 */
public class OptServiceImpl {

    public String getSome(String abc) {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("optServiceImpl run");
        return abc + "," + abc;
    }

    public void update(String abc) {
    }
}
