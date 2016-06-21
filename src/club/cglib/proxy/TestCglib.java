package club.cglib.proxy;

/**
 * Created by 1dian_tech50 on 2016/6/21.
 * User : linving
 * Date : 2016/6/21
 * Time : 11:53
 */
public class TestCglib {
    public static void main(String[] args) {
        BookFacadeCglib cglib=new BookFacadeCglib();
        BookFacade bookCglib=(BookFacade)cglib.getInstance(new BookFacade());
        System.out.println(" BookFacadeCglib "+bookCglib.getClass().getName());
        bookCglib.addBook();
    }
}
