package em;

import java.sql.*;
import java.util.Scanner;

public class Delete {
	static final Scanner sc = new Scanner(System.in);
	public static void deleteEmployee(){
		System.out.println();
		System.out.println("/**************************************/");
        System.out.print("待删除员工的姓名：");
		String ename = sc.nextLine();
        String sql = "delete from employee where ename = '" + ename + "'";
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("删除员工信息成功！");
    }
	
	public static void deleteDepartment(){
		System.out.println();
		System.out.println("/**************************************/");
        System.out.print("待删除部门的名称：");
		String dname = sc.nextLine();
        String sql = "delete from department where dname = " + dname;
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("删除部门信息成功！");
    }
	
	public static void deletePosition(){
		System.out.println();
		System.out.println("/**************************************/");
        System.out.print("待删除职位的名称：");
		String pname = sc.nextLine();
        String sql = "delete from employee where pname = " + pname;
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("删除职位信息成功！");
    }
	
	public static void deleteSalary(){
		System.out.println();
		System.out.println("/**************************************/");
        System.out.print("待删除工资信息的时间：");
		String time = sc.nextLine();
		String sql = "delete from salary where time = " + time;
		System.out.print("待删除工资信息对应的员工姓名：");
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
        System.out.println("删除工资信息成功！");
    }
	
	public static void deleteEmployeesByDept(){
		System.out.println();
		System.out.println("/**************************************/");
        System.out.print("部门名称：");
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
        System.out.println("删除该部门的所有员工信息成功！");
    }
	
	public static void deleteSalarysByEmployee(){
		System.out.println();
		System.out.println("/**************************************/");
        System.out.print("员工姓名：");
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
        System.out.println("删除该员工的所有工资信息成功！");
    }
	
}
