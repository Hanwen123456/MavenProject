import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.JiSuan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program: MavenProject
 * @description:
 * @author: 作者
 * @create: 2023-07-21 21:12
 */
public class TestJiSuan {

    private JiSuan js;

    @Before
    public void before(){
        js = new JiSuan();
    }

//    @Test
//    public void testAdd1(){
//        Assert.assertEquals(8,js.add(1,8));
//    }
    @Test
    public void testAdd2(){
        Assert.assertEquals(9,js.add(1,8));
    }

    @Test
    public void testConn() throws SQLException {
        com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
        DriverManager.registerDriver(driver);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_game","root","748290");
        System.out.println(conn);
    }


}
