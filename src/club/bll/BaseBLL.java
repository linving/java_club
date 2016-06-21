package club.bll;

import club.reflection.ReflectionHelper;
import club.reflection.XObject;

/**
 * Created by 1dian_tech50 on 2016/6/19.
 * User : linving
 * Date : 2016/6/19
 * Time : 13:15
 */
public class BaseBLL extends XObject{
    public BaseBLL() {
        try {
            initInstant();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private void initInstant() throws IllegalAccessException, InstantiationException, CloneNotSupportedException {
        //得到Class
        Class<?> clazz = this.getClass();
        //实例化对象
        ReflectionHelper.initFieldObject(this,clazz);
    }

}
