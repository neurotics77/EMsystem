package em;

import java.sql.*;
import java.util.Scanner;

public class Delete {
	static final Scanner sc = new Scanner(System.in);
	public static void deleteEmployee(){
		System.out.println();
		System.out.println("/**************************************/");
        System.out.print("��ɾ��Ա����������");
		String ename = sc.nextLine();
        String sql = "delete from employee where ename = '" + ename + "'";
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("ɾ��Ա����Ϣ�ɹ���");
    }
	
	public static void deleteDepartment(){
		System.out.println();
		System.out.println("/**************************************/");
        System.out.print("��ɾ�����ŵ����ƣ�");
		String dname = sc.nextLine();
        String sql = "delete from department where dname = " + dname;
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("ɾ��������Ϣ�ɹ���");
    }
	
	public static void deletePosition(){
		System.out.println();
		System.out.println("/**************************************/");
        System.out.print("��ɾ��ְλ�����ƣ�");
		String pname = sc.nextLine();
        String sql = "delete from employee where pname = " + pname;
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("ɾ��ְλ��Ϣ�ɹ���");
    }
	
	public static void deleteSalary(){
		System.out.println();
		System.out.println("/**************************************/");
        System.out.print("��ɾ��������Ϣ��ʱ�䣺");
		String time = sc.nextLine();
		String sql = "delete from salary where time = " + time;
		System.out.print("��ɾ��������Ϣ��Ӧ��Ա��������");
		String ename = sc.nextLine();
        //sql += " and eid = " + geteid(ename);
        String sql1 = "select eid from employee where ename = '" + ename + "'";
        sql += " and eid = (" + sql1 + ")";
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("ɾ��������Ϣ�ɹ���");
    }
	
	public static void deleteEmployeesByDept(){
		System.out.println();
		System.out.println("/**************************************/");
        System.out.print("�������ƣ�");
		String dname = sc.nextLine();
        String sql = "delete from employee where did = ";
        String sql1 = "select did from department where dname = '" + dname + "'";
        sql += "(" + sql1 + ")";
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("ɾ���ò��ŵ�����Ա����Ϣ�ɹ���");
    }
	
	public static void deleteSalarysByEmployee(){
		System.out.println();
		System.out.println("/**************************************/");
        System.out.print("Ա��������");
		String ename = sc.nextLine();
        String sql = "delete from salary where eid = ";
        String sql1 = "select eid from employee where ename = '" + ename + "'";
        sql += "(" + sql1 + ")";
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("ɾ����Ա�������й�����Ϣ�ɹ���");
    }
	
}
