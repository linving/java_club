package club.reflection;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by 1dian_tech50 on 2016/6/19.
 * User : linving
 * Date : 2016/6/19
 * Time : 20:07
 * 对象创建 类
 */
public class ObjectCreator {
    //  缓存对象的 map
    public static Map<Class, Object> beanMap = new WeakHashMap<>();

    /**
     * 创建对象
     * 如果在 Map 中 已经存在 则直接 获取
     * 没有就创建 并保存进去
     *
     * @param clazz
     * @return
     */
    public static Object createObject(Class clazz) throws IllegalAccessException, InstantiationException {
        Object object = beanMap.get(clazz);
        if (null == object) {
            object = clazz.newInstance();
            beanMap.put(clazz, object);
        }
        return object;
    }

}
