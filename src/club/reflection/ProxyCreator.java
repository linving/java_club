package club.reflection;

import club.Interceptor.Interceptor;
import club.annotation.AOP;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by 1dian_tech50 on 2016/6/26.
 * User : linving
 * Date : 2016/6/26
 * Time : 9:46
 * <p>
 * 生成代理类
 */
public class ProxyCreator implements MethodInterceptor {

    private Object target;

    public Object getProxyObject(Object object) throws IllegalAccessException, CloneNotSupportedException, InstantiationException {
        this.target = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        // 回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        Object o = enhancer.create() ;
        return o ;
    }


    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object object;
        if(method.isAnnotationPresent(AOP.class)){
            AOP aop = method.getDeclaredAnnotation(AOP.class);
            Class clazz = aop.value();
            System.out.println("AOP : " + aop.value().getName());
            Interceptor interceptor = (Interceptor) clazz.newInstance();
            interceptor.before();
            object = methodProxy.invokeSuper(obj, args);
            interceptor.after();
        }else {
             object = methodProxy.invokeSuper(obj, args);
        }
        return object;
    }
}
