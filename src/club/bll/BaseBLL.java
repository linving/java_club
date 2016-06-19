package club.bll;

import club.annotation.DAL;
import club.dal.BaseDAL;

import java.lang.reflect.Field;

/**
 * Created by 1dian_tech50 on 2016/6/19.
 * User : linving
 * Date : 2016/6/19
 * Time : 13:15
 */
public class BaseBLL {
    public BaseBLL() {
        try {
            initInstant();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private void initInstant() throws IllegalAccessException, InstantiationException {
        //得到Class
        Class<?> clazz = this.getClass();
        //获取 Class 变量
        Field[] fields = clazz.getDeclaredFields();
        //
        for (Field field : fields) {
            // 是否有 DAL  注解
            if (field.isAnnotationPresent(DAL.class)) {
                // 使私有变量可以访问
                field.setAccessible(true);
                //获取到注解
                DAL annDAL = field.getAnnotation(DAL.class);
                //获取到注解上面的class 用来 创建 Object
                Class cla = annDAL.value();
                // 通过反射创建对象
                Object object = cla.newInstance();
                // 将反射创建的对象 赋值到 该这个变量里面
                field.set(this, object);
            }
        }

    }

}
