package em;
import java.sql.*;
public class GaussDBopenGauss{
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://120.46.185.95:8000/finance";
    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "db_user04";
    static final String PASS = "db_user@04";
    static Connection conn = null;  // 定义为全局变量
    static Statement stmt = null;

    public static void main(String[] args) {
        try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);
            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            // 实例化对象
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            System.out.println(" 进入系统... ");
            EMsystem etsystem = new EMsystem();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
