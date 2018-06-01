package cn.fay.filter;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/4/20 下午12:04.
 */
public class App {
    public static void main(String[] args) {
        System.out.println(new Filter() {
            @Override
            public Object invoke(Invoker invoker, Invocation invocation) {
                System.out.println("filter 1");
                return new Invoker() {
                    @Override
                    public Object invoke(Invocation invocation) {
                        return new Filter() {
                            @Override
                            public Object invoke(Invoker invoker, Invocation invocation) {
                                System.out.println("filter 2");
                                return invoker.invoke(invocation);
                            }
                        }.invoke(invoker, invocation);
                    }
                }.invoke(invocation);
            }
        }.invoke((Invoker) invocation -> "origin run", null));
    }
}
