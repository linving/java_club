package club.main;

import club.bll.AdminBLL;
import club.bll.UserBLL;

/**
 * Created by 1dian_tech50 on 2016/6/19.
 * User : linving
 * Date : 2016/6/19
 * Time : 12:57
 */
public class Main {


    public static void main(String[] args) {

        UserBLL userBLL = new UserBLL();
        userBLL.getUser();
        AdminBLL adminBLL = new AdminBLL();
        adminBLL.getAdmin();
    }
}
