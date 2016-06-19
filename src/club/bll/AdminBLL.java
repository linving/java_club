package club.bll;

import club.annotation.DAL;
import club.dal.AdminDAL;
import club.dal.UserDAL;

/**
 * Created by 1dian_tech50 on 2016/6/19.
 * User : linving
 * Date : 2016/6/19
 * Time : 20:36
 */
public class AdminBLL extends BaseBLL {
    @DAL(UserDAL.class)
    private UserDAL userDAL;
    @DAL(AdminDAL.class)
    private AdminDAL adminDAL;

    public AdminBLL() {
        super();
    }

    public void getAdmin() {
        adminDAL.getAdmin();
        System.out.println(" AdminBLL 里面 Admin 的 HashCode = " + adminDAL.hashCode());
    }


}
