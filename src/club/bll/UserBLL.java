package club.bll;

import club.annotation.DAL;
import club.dal.AdminDAL;
import club.dal.UserDAL;

/**
 * Created by 1dian_tech50 on 2016/6/19.
 * User : linving
 * Date : 2016/6/19
 * Time : 13:16
 */
public class UserBLL extends BaseBLL {

    @DAL(UserDAL.class)
    private UserDAL userDAL;

    @DAL(AdminDAL.class)
    private AdminDAL adminDAL;

    public UserBLL() {
        super();
    }

    public void getUser() {
        userDAL.getUser();
        adminDAL.getAdmin();
        System.out.println("进行业务处理");
        System.out.println(" UserBLL 里面 Admin 的 HashCode = " + adminDAL.hashCode());
    }
}
