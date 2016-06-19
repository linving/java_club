package club.bll;

import club.annotation.DAL;
import club.dal.BaseDAL;
import club.reflection.ReflectionHelper;

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
        //实例化对象
        ReflectionHelper.initFieldObject(this,clazz);
    }

}
