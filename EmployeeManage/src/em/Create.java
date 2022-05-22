package em;

import java.sql.*;
import java.util.Scanner;

public class Create {
	static final Scanner sc = new Scanner(System.in);
	public static void createEmployee(){
		System.out.println();
		System.out.println("/**************************************/");
        String sql = "insert into employee (eid,ename,idcard,phone_number,sex,did,pid) VALUES (";
		sql += getId("employee", "eid") + ",";
        System.out.print("姓名�?");
		String name = sc.nextLine();
		sql += "'" + name + "'" + ","; 
		System.out.print("身份证号�?");
		String idcard = sc.nextLine();
		sql += "'" + idcard + "'" + ","; 
		System.out.print("电话号码姓名�?");
		String phone_number = sc.nextLine();
		sql += "'" + phone_number + "'" + ","; 
		System.out.print("性别�?");
		String sex = sc.nextLine();
		sql += sex + ","; 
		System.out.print("部门�?");
		String dname = sc.nextLine();
		sql += getdid(dname) + ","; 
		System.out.print("职位�?");
		String pname = sc.nextLine();
		sql += getpid(pname) + ")"; 
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("新增员工信息成功�?");
    }
	
	public static void createDepartment(){
		System.out.println();
		System.out.println("/**************************************/");
        String sql = "insert into department (did,dname,leader,note) VALUES (";
		sql += getId("department", "did") + ",";
        System.out.print("部门名称�?");
		String name = sc.nextLine();
		sql += "'" + name + "'" + ","; 
		System.out.print("部门负责人：");
		String leader = sc.nextLine();
		sql += "'" + leader + "'" + ","; 
		System.out.print("部门�?介：");
		String note = sc.nextLine();
		sql += "'" + note + "'" + ")"; 
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("新增部门信息成功�?");
    }
	
	public static void createPosition(){
		System.out.println();
		System.out.println("/**************************************/");
        String sql = "insert into position (pid,pname,note,did) VALUES (";
		sql += getId("position", "pid") + ",";
        System.out.print("职位名称�?");
		String name = sc.nextLine();
		sql += "'" + name + "'" + ","; 
		System.out.print("职位�?介：");
		String note = sc.nextLine();
		sql += "'" + note + "'" + ","; 
		System.out.print("�?属部门：");
		String department = sc.nextLine();
		sql += "'" + getdid(department) + "'" + ")"; 
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("新增职位信息成功�?");
    }
	
	public static void createSalary(){
		System.out.println();
		System.out.println("/**************************************/");
        String sql = "insert into salary (sid,basic,overtime,bonus,time,eid) VALUES (";
		sql += getId("salary", "sid") + ",";
        System.out.print("基础工资�?");
		String basic = sc.nextLine();
		sql += basic + ","; 
		System.out.print("加班工资�?");
		String note = sc.nextLine();
		sql += note + ","; 
		System.out.print("奖金�?");
		String bonus = sc.nextLine();
		sql += bonus + ",";
		System.out.print("发放时间�?");
		String time = sc.nextLine();
		sql += time + ","; 
		System.out.print("工资�?有人�?");
		String ename = sc.nextLine();
		sql += geteid(ename) + ")";
		System.out.println(sql);
        try {
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println("/**************************************/");
        System.out.println("新增工资信息成功�?");
    }
	
	
	public static int getId(String table, String id){
		String sql = "select max(" + id + ") from " + table;
		int maxid = 0;
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
			while(rs.next())
				maxid = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return maxid + 1;
	}
	
	public static int getdid(String dname) {
		String sql = "select did from department where dname = '" + dname + "'";
		int did = 0;
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
			while(rs.next())
				did = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return did;
	}
	
	public static int geteid(String ename) {
		String sql = "select eid from employee where ename = '" + ename + "'";
		int eid = 0;
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
			while(rs.next())
				eid = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return eid;
	}
	
	public static int getpid(String pname) {
		String sql = "select pid from position where pname = '" + pname + "'";
		int pid = 0;
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
			while(rs.next())
				pid = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pid;
	}
}
