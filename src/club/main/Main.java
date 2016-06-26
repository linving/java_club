package club.main;

import club.bll.AdminBLL;
import club.bll.UserBLL;
import club.reflection.ProxyCreator;
import club.reflection.ReflectionHelper;

/**
 * Created by 1dian_tech50 on 2016/6/19.
 * User : linving
 * Date : 2016/6/19
 * Time : 12:57
 */
public class Main {


    public static void main(String[] args) throws IllegalAccessException, CloneNotSupportedException, InstantiationException {
        AdminBLL adminBLL = new AdminBLL();
        adminBLL.getAdmin();
        UserBLL userBLL = new UserBLL();
        userBLL.getUser();
    }
}
