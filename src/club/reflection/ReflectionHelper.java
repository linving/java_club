package club.reflection;

import club.annotation.DAL;
import club.annotation.ScopeType;

import java.lang.reflect.Field;

/**
 * Created by 1dian_tech50 on 2016/6/19.
 * User : linving
 * Date : 2016/6/19
 * Time : 20:06
 * <p>
 * 反射帮助类
 */
public class ReflectionHelper {

    /**
     * 赋值有注解的变量
     *
     * @param object 变量所在的对象
     * @param clazz  变量所在的Class
     */
    public static void initFieldObject(Object object, Class clazz) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
        //获取到该类的所有变量
        Field[] fields = clazz.getDeclaredFields();
        //遍历
        for (Field field : fields) {
            // 是否有 Anno 类型注解
            if (field.isAnnotationPresent(DAL.class)) {
                // 使私有变量可以访问
                field.setAccessible(true);
                //获取到注解
                DAL annDAL = field.getAnnotation(DAL.class);
                //获取到注解上面的class 用来 创建 Object
                Class cla = annDAL.value();
                //获取实例
                XObject instance = ObjectCreator.createObject(cla);
                ScopeType scopeType = annDAL.scope();
                //根据 Scope 赋值
                if (scopeType.equals(ScopeType.Prototype)) {
                    field.set(object, instance.clone());
                } else if (scopeType.equals(ScopeType.Singleton)) {
                    field.set(object, instance);
                }

            }
        }
    }
}
