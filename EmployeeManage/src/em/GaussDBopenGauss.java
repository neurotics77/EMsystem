package em;
import java.sql.*;
public class GaussDBopenGauss{
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://120.46.185.95:8000/finance";
    // ���ݿ���û��������룬��Ҫ�����Լ�������
    static final String USER = "db_user04";
    static final String PASS = "db_user@04";
    static Connection conn = null;  // ����Ϊȫ�ֱ���
    static Statement stmt = null;

    public static void main(String[] args) {
        try{
            // ע�� JDBC ����
            Class.forName(JDBC_DRIVER);
            // ������
            System.out.println("�������ݿ�...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            // ʵ��������
            System.out.println(" ʵ����Statement����...");
            stmt = conn.createStatement();
            System.out.println(" ����ϵͳ... ");
            EMsystem etsystem = new EMsystem();
        }catch(SQLException se){
            // ���� JDBC ����
            se.printStackTrace();
        }catch(Exception e){
            // ���� Class.forName ����
            e.printStackTrace();
        }finally{
            // �ر���Դ
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// ʲô������
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
