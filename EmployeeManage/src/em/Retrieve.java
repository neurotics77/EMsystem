package em;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Retrieve {
	static final Scanner sc = new Scanner(System.in);
	public static Formatter formatter = new Formatter(System.out);
	public static void retrieveEmployee()
	{
		Map<Integer, String> dmap = getdname();
		Map<Integer, String> pmap = getpname();
		String sql = "SELECT * FROM employee";
		System.out.println(sql);
		formatter.format("%-2s %-4s      %-35s %-11s %-1s    %-10s  \t %-7s\n", 
            	"编号","姓名","身份证号","电话号码","性别","部门","职位");
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
	        while (rs.next()) {
	            int eid = rs.getInt("eid");
	            String ename = rs.getString("ename");
	            String idcard = rs.getString("idcard");
	            String phone_number = rs.getString("phone_number");
	            String sex = rs.getInt("sex") == 0?"男":"女";
	            int did = rs.getInt("did");
	            int pid = rs.getInt("pid");
	            String dname = dmap.get(did);
	            String pname = pmap.get(pid);
	            formatter.format(" %-2s %-7s %-20s %-11s %-7s %-5s \t %-7s\n", 
	                eid,ename,idcard,phone_number,sex,dname,pname);
	            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void retrieveDepartment()
	{
		String sql = "SELECT * FROM department";
		System.out.println(sql);
		formatter.format("%-2s %-5s    %6s\t%-20s\n", 
            	"编号","部门名称","负责人","简介");
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
	        while (rs.next()) {
	            int did = rs.getInt("did");
	            String dname = rs.getString("dname");
	            String leader = rs.getString("leader");
	            String note = rs.getString("note");
	            formatter.format(" %-2s    %-5s\t%-6s\t%-20s\n", 
	            		did,dname,leader,note);
	            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void retrievePosition()
	{
		Map<Integer, String> dmap = getdname();
		String sql = "SELECT * FROM position";
		System.out.println(sql);
		formatter.format("%-2s\t%-7s\t%6s\t%-20s\n", 
            	"编号","职位名称","所属部门","简介");
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
	        while (rs.next()) {
	            int pid = rs.getInt("pid");
	            String pname = rs.getString("pname");
	            String note = rs.getString("note");
	            int did = rs.getInt("did");
	            String dname = dmap.get(did);
	            formatter.format(" %-2s\t%-7s\t%-10s\t%-12s\n", 
	            		pid,pname,dname,note);
	            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void retrieveSalary()
	{
		Map<Integer, String> emap = getename();
		String sql = "SELECT * FROM salary";
		System.out.println(sql);
		formatter.format("%-2s\t%-5s\t%-5s\t%-5s\t%-6s\t%-6s\n", 
            	"编号","基础工资","加班费","奖金","时间","所有人");
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
	        while (rs.next()) {
	            int sid = rs.getInt("sid");
	            int basic = rs.getInt("basic");
	            int overtime = rs.getInt("overtime");
	            int bonus = rs.getInt("bonus");
	            int time = rs.getInt("time");
	            int eid = rs.getInt("eid");
	            String ename = emap.get(eid);
	            formatter.format(" %-2s\t%-5s\t%-5s\t%-5s\t%-6s\t%-6s\n", 
	            		sid,basic,overtime,bonus,time,ename);
	            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void retrieveSalaryByEmployee()
	{
		System.out.print("员工姓名：");
		String ename = sc.nextLine();
		String sql = "SELECT * FROM salary where eid = ";
		String sql1 = "SELECT eid FROM employee where ename = '" + ename + "'";
		sql += "(" + sql1 + ")";
		System.out.println(sql);
		formatter.format("%-2s\t%-5s\t%-5s\t%-5s\t%-6s\t%-6s\n", 
            	"编号","基础工资","加班费","奖金","时间","所有人");
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
	        while (rs.next()) {
	            int sid = rs.getInt("sid");
	            int basic = rs.getInt("basic");
	            int overtime = rs.getInt("overtime");
	            int bonus = rs.getInt("bonus");
	            int time = rs.getInt("time");
	            formatter.format(" %-2s\t%-5s\t%-5s\t%-5s\t%-6s\t%-6s\n", 
	            		sid,basic,overtime,bonus,time,ename);
	            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void retrieveEmployeeByDept()
	{
		Map<Integer, String> pmap = getpname();
		System.out.print("部门名称：");
		String dname = sc.nextLine();
		String sql = "SELECT * FROM employee where did = ";
		String sql1 = "SELECT did FROM department where dname = '" + dname + "'";
		sql += "(" + sql1 + ")";
		System.out.println(sql);
		formatter.format("%-2s %-4s      %-35s %-11s %-1s    %-10s  \t %-7s\n", 
            	"编号","姓名","身份证号","电话号码","性别","部门","职位");
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
			while (rs.next()) {
	            int eid = rs.getInt("eid");
	            String ename = rs.getString("ename");
	            String idcard = rs.getString("idcard");
	            String phone_number = rs.getString("phone_number");
	            String sex = rs.getInt("sex") == 0?"男":"女";
	            int pid = rs.getInt("pid");
	            String pname = pmap.get(pid);
	            formatter.format(" %-2s %-7s %-20s %-11s %-7s %-5s \t %-7s\n", 
	                eid,ename,idcard,phone_number,sex,dname,pname);
	            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void retrievePositionByDept()
	{
		System.out.print("部门名称：");
		String dname = sc.nextLine();
		String sql = "SELECT * FROM position where did = ";
		String sql1 = "SELECT did FROM department where dname = '" + dname + "'";
		sql += "(" + sql1 + ")";
		System.out.println(sql);
		formatter.format("%-2s\t%-7s\t%6s\t%-20s\n", 
            	"编号","职位名称","所属部门","简介");
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
			while (rs.next()) {
				int pid = rs.getInt("pid");
	            String pname = rs.getString("pname");
	            String note = rs.getString("note");
	            formatter.format(" %-2s\t%-7s\t%-10s\t%-12s\n", 
	            		pid,pname,dname,note);
	            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void retrieveEmployeeByPosition()
	{
		Map<Integer, String> dmap = getdname();
		System.out.print("职位名称：");
		String pname = sc.nextLine();
		String sql = "SELECT * FROM employee where pid = ";
		String sql1 = "SELECT pid FROM position where pname = '" + pname + "'";
		sql += "(" + sql1 + ")";
		System.out.println(sql);
		formatter.format("%-2s %-4s      %-35s %-11s %-1s    %-10s  \t %-7s\n", 
            	"编号","姓名","身份证号","电话号码","性别","部门","职位");
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
			while (rs.next()) {
	            int eid = rs.getInt("eid");
	            String ename = rs.getString("ename");
	            String idcard = rs.getString("idcard");
	            String phone_number = rs.getString("phone_number");
	            String sex = rs.getInt("sex") == 0?"男":"女";
	            int did = rs.getInt("did");
	            String dname = dmap.get(did);
	            formatter.format(" %-2s %-7s %-20s %-11s %-7s %-5s \t %-7s\n", 
	                eid,ename,idcard,phone_number,sex,dname,pname);
	            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Map<Integer, String> getdname() {
		String sql = "select did,dname from department";
		Map<Integer, String> map = new HashMap<Integer, String>();
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
			while(rs.next())
			{
				
				map.put(Integer.valueOf(rs.getInt(1)), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return map;
	}
	
	public static Map<Integer, String> getpname() {
		String sql = "select pid,pname from position";
		Map<Integer, String> map = new HashMap<Integer, String>();
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
			while(rs.next())
			{
				map.put(Integer.valueOf(rs.getInt(1)), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return map;
	}
	
	public static Map<Integer, String> getename() {
		String sql = "select eid,ename from employee";
		Map<Integer, String> map = new HashMap<Integer, String>();
		try {
			ResultSet rs = GaussDBopenGauss.stmt.executeQuery(sql);
			while(rs.next())
			{
				map.put(Integer.valueOf(rs.getInt(1)), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return map;
	}
}
