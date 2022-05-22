package em;

import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	static final Scanner sc = new Scanner(System.in);
	public static void updateEmployee(){
        System.out.print("���޸�Ա����Ϣ��������");
		String ename = sc.nextLine();
		int flag = 1;
		while(flag == 1) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. �޸ĵ绰����");
			System.out.println("2. �޸Ĳ���");
			System.out.println("3. �޸�ְλ");
			System.out.println("4. ȡ��");
			System.out.println("/**************************************/");
			System.out.print("��ѡ���ܣ�");
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
				System.out.println("��������ȷ����ţ�");
			}	
		}
	}
	
	public static void updateEmployeePhone(String ename)
	{
		System.out.println("/**************************************/");
        System.out.print("�µ绰���룺");
		String phone = sc.nextLine();
		String sql = "UPDATE employee SET phone_number = '" + phone + 
				"' where ename = '" + ename + "'";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("�޸�Ա���绰����ɹ���");
		System.out.println("/**************************************/");
	}
	
	public static void updateEmployeeDept(String ename)
	{
		System.out.println("/**************************************/");
        System.out.print("�²������ƣ�");
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
		System.out.println("�޸�Ա���������ųɹ���");
		System.out.println("/**************************************/");
	}
	
	public static void updateEmployeePos(String ename)
	{
		System.out.println("/**************************************/");
        System.out.print("��ְλ���ƣ�");
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
		System.out.println("�޸�Ա��ְλ�ɹ���");
		System.out.println("/**************************************/");
	}
	
	public static void updateDepartment()
	{
        System.out.print("���޸Ĳ��ŵ����ƣ�");
		String dname = sc.nextLine();
		int flag = 1;
		while(flag == 1) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. �޸ĸ�����");
			System.out.println("2. �޸ļ��");
			System.out.println("3. ȡ��");
			System.out.println("/**************************************/");
			System.out.print("��ѡ���ܣ�");
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
				System.out.println("��������ȷ����ţ�");
			}	
		}
	}
	
	public static void updateDepartmentLeader(String dname)
	{
		System.out.println("/**************************************/");
        System.out.print("�¸����ˣ�");
		String leader = sc.nextLine();
		String sql = "UPDATE department SET leader = '" + leader 
				+ "' where dname = '" + dname + "'";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("�޸Ĳ��Ÿ����˳ɹ���");
		System.out.println("/**************************************/");
	}
	
	public static void updateDepartmentNote(String dname)
	{
		System.out.println("/**************************************/");
        System.out.print("�¼�飺");
		String note = sc.nextLine();
		String sql = "UPDATE department SET note = '" + note 
				+ "' where dname = '" + dname + "'";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("�޸Ĳ��ż��ɹ���");
		System.out.println("/**************************************/");
	}
	
	public static void updatePosition()
	{
		System.out.print("���޸�ְλ�����ƣ�");
		String pname = sc.nextLine();
		int flag = 1;
		while(flag == 1) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. �޸���������");
			System.out.println("2. �޸ļ��");
			System.out.println("3. ȡ��");
			System.out.println("/**************************************/");
			System.out.print("��ѡ���ܣ�");
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
				System.out.println("��������ȷ����ţ�");
			}	
		}
	}
	
	public static void updatePositionDept(String pname)
	{
		System.out.println("/**************************************/");
        System.out.print("�²��ţ�");
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
		System.out.println("�޸�ְλ�������ųɹ���");
		System.out.println("/**************************************/");
	}
	
	public static void updatePositionNote(String pname)
	{
		System.out.println("/**************************************/");
        System.out.print("�¼�飺");
		String note = sc.nextLine();
		String sql = "UPDATE position SET note = '" + note 
				+ "' where pname = '" + pname + "'";
		try {
			System.out.println(sql);
			GaussDBopenGauss.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("�޸�ְλ���ɹ���");
		System.out.println("/**************************************/");
	}
	
	public static void updateSalary()
	{
		System.out.print("Ա��������");
		String ename = sc.nextLine();
		System.out.print("���ʷ���ʱ�䣺");
		String time = sc.nextLine();
		int flag = 1;
		while(flag == 1) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. �޸Ļ�������");
			System.out.println("2. �޸ļӰ��");
			System.out.println("3. �޸Ľ���");
			System.out.println("4. ȡ��");
			System.out.println("/**************************************/");
			System.out.print("��ѡ���ܣ�");
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
				System.out.println("��������ȷ����ţ�");
			}	
		}
	}
	
	public static void updateSalaryBasic(String ename, String time)
	{
		System.out.println("/**************************************/");
        System.out.print("�»������ʣ�");
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
		System.out.println("�޸Ļ������ʳɹ���");
		System.out.println("/**************************************/");
	}
	
	public static void updateSalaryOvertime(String ename, String time)
	{
		System.out.println("/**************************************/");
        System.out.print("�¼Ӱ�ѣ�");
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
		System.out.println("�޸ļӰ�ѳɹ���");
		System.out.println("/**************************************/");
	}
	
	public static void updateSalaryBonus(String ename, String time)
	{
		System.out.println("/**************************************/");
        System.out.print("�½���");
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
		System.out.println("�޸Ľ���ɹ���");
		System.out.println("/**************************************/");
	}
}
