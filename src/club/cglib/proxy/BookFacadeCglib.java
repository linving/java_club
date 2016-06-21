package club.cglib.proxy;




import club.annotation.AOP;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by 1dian_tech50 on 2016/6/21.
 * User : linving
 * Date : 2016/6/21
 * Time : 11:51
 */
public class BookFacadeCglib implements MethodInterceptor {
    private Object target;

    /**
     * 创建代理对象
     *
     * @param target
     * @return
     */
    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        // 回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    @Override
    // 回调方法
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        System.out.println("事物开始");
        AOP aop = method.getDeclaredAnnotation(AOP.class);
        System.out.println("AOP : " + aop.annotationType().getName());
        Object object = proxy.invokeSuper(obj, args);
        System.out.println("事物结束");
        return object;
    }
}
