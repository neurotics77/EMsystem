package em;

import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	static final Scanner sc = new Scanner(System.in);
	public static void updateEmployee(){
        System.out.print("待修改员工信息的姓名：");
		String ename = sc.nextLine();
		int flag = 1;
		while(flag == 1) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. 修改电话号码");
			System.out.println("2. 修改部门");
			System.out.println("3. 修改职位");
			System.out.println("4. 取消");
			System.out.println("/**************************************/");
			System.out.print("请选择功能：");
			String s=sc.nextLine();
			switch(s) {
			case "1":
				updateEmployeePhone(ename);
				break;
			case "2":
				updateEmployeeDept(ename);
				break;
			case "3":
				updateEmployeePos(ename);
				break;
			case "4":
				flag = 0;
				break;
			default:
				System.out.println("请输入正确的序号！");
			}	
		}
	}
	
	public static void updateEmployeePhone(String ename)
	{
		System.out.println("/**************************************/");
        System.out.print("新电话号码：");
		String phone = sc.nextLine();
		String sql = "UPDATE employee SET phone_number = '" + phone + 
				"' where ename = '" + ename + "'";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("修改员工电话号码成功！");
		System.out.println("/**************************************/");
	}
	
	public static void updateEmployeeDept(String ename)
	{
		System.out.println("/**************************************/");
        System.out.print("新部门名称：");
		String dname = sc.nextLine();
		String sql = "UPDATE employee SET did = ";
		String sql1 = "SELECT did from department where dname = '" + dname + "'";
		sql += "(" + sql1 + ")";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("修改员工所属部门成功！");
		System.out.println("/**************************************/");
	}
	
	public static void updateEmployeePos(String ename)
	{
		System.out.println("/**************************************/");
        System.out.print("新职位名称：");
		String pname = sc.nextLine();
		String sql = "UPDATE employee SET pid = ";
		String sql1 = "SELECT pid from position where pname = '" + pname + "'";
		sql += "(" + sql1 + ")";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("修改员工职位成功！");
		System.out.println("/**************************************/");
	}
	
	public static void updateDepartment()
	{
        System.out.print("待修改部门的名称：");
		String dname = sc.nextLine();
		int flag = 1;
		while(flag == 1) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. 修改负责人");
			System.out.println("2. 修改简介");
			System.out.println("3. 取消");
			System.out.println("/**************************************/");
			System.out.print("请选择功能：");
			String s=sc.nextLine();
			switch(s) {
			case "1":
				updateDepartmentLeader(dname);
				break;
			case "2":
				updateDepartmentNote(dname);
				break;
			case "3":
				flag = 0;
				break;
			default:
				System.out.println("请输入正确的序号！");
			}	
		}
	}
	
	public static void updateDepartmentLeader(String dname)
	{
		System.out.println("/**************************************/");
        System.out.print("新负责人：");
		String leader = sc.nextLine();
		String sql = "UPDATE department SET leader = '" + leader 
				+ "' where dname = '" + dname + "'";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("修改部门负责人成功！");
		System.out.println("/**************************************/");
	}
	
	public static void updateDepartmentNote(String dname)
	{
		System.out.println("/**************************************/");
        System.out.print("新简介：");
		String note = sc.nextLine();
		String sql = "UPDATE department SET note = '" + note 
				+ "' where dname = '" + dname + "'";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("修改部门简介成功！");
		System.out.println("/**************************************/");
	}
	
	public static void updatePosition()
	{
		System.out.print("待修改职位的名称：");
		String pname = sc.nextLine();
		int flag = 1;
		while(flag == 1) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. 修改所属部门");
			System.out.println("2. 修改简介");
			System.out.println("3. 取消");
			System.out.println("/**************************************/");
			System.out.print("请选择功能：");
			String s=sc.nextLine();
			switch(s) {
			case "1":
				updatePositionDept(pname);
				break;
			case "2":
				updatePositionNote(pname);
				break;
			case "3":
				flag = 0;
				break;
			default:
				System.out.println("请输入正确的序号！");
			}	
		}
	}
	
	public static void updatePositionDept(String pname)
	{
		System.out.println("/**************************************/");
        System.out.print("新部门：");
		String dname = sc.nextLine();
		String sql = "UPDATE position SET did = ";
		String sql1 = "SELECT did FROM department where dname ='" + dname + "'";
		sql += "(" + sql1 + ")" + " where pname = '" + pname + "'";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("修改职位所属部门成功！");
		System.out.println("/**************************************/");
	}
	
	public static void updatePositionNote(String pname)
	{
		System.out.println("/**************************************/");
        System.out.print("新简介：");
		String note = sc.nextLine();
		String sql = "UPDATE position SET note = '" + note 
				+ "' where pname = '" + pname + "'";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("修改职位简介成功！");
		System.out.println("/**************************************/");
	}
	
	public static void updateSalary()
	{
		System.out.print("员工姓名：");
		String ename = sc.nextLine();
		System.out.print("工资发放时间：");
		String time = sc.nextLine();
		int flag = 1;
		while(flag == 1) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. 修改基础工资");
			System.out.println("2. 修改加班费");
			System.out.println("3. 修改奖金");
			System.out.println("4. 取消");
			System.out.println("/**************************************/");
			System.out.print("请选择功能：");
			String s=sc.nextLine();
			switch(s) {
			case "1":
				updateSalaryBasic(ename, time);
				break;
			case "2":
				updateSalaryOvertime(ename, time);
				break;
			case "3":
				updateSalaryBonus(ename, time);
				break;
			case "4":
				flag = 0;
				break;
			default:
				System.out.println("请输入正确的序号！");
			}	
		}
	}
	
	public static void updateSalaryBasic(String ename, String time)
	{
		System.out.println("/**************************************/");
        System.out.print("新基础工资：");
		String basic = sc.nextLine();
		String sql = "UPDATE salary SET basic = " + basic 
				+ " where time = " + time + " and eid = ";
		String sql1 = "SELECT eid from employee where ename = '" + ename + "'";
		sql += "(" + sql1 + ")";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("修改基础工资成功！");
		System.out.println("/**************************************/");
	}
	
	public static void updateSalaryOvertime(String ename, String time)
	{
		System.out.println("/**************************************/");
        System.out.print("新加班费：");
		String overtime = sc.nextLine();
		String sql = "UPDATE salary SET overtime = " + overtime 
				+ " where time = " + time + " and eid = ";
		String sql1 = "SELECT eid from employee where ename = '" + ename + "'";
		sql += "(" + sql1 + ")";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("修改加班费成功！");
		System.out.println("/**************************************/");
	}
	
	public static void updateSalaryBonus(String ename, String time)
	{
		System.out.println("/**************************************/");
        System.out.print("新奖金：");
		String bonus = sc.nextLine();
		String sql = "UPDATE salary SET bonus = " + bonus 
				+ " where time = " + time + " and eid = ";
		String sql1 = "SELECT eid from employee where ename = '" + ename + "'";
		sql += "(" + sql1 + ")";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("修改奖金成功！");
		System.out.println("/**************************************/");
	}
}
