package cn.fay.filter;

/**
 * @author fay  fay9395@gmail.com
 * @date 2018/4/20 下午12:03.
 */
public interface Filter {
    Object invoke(Invoker invoker, Invocation invocation);
}
