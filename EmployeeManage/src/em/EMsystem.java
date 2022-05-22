package em;

import java.util.Scanner;

public class EMsystem {
	static final Scanner sc = new Scanner(System.in);
	static boolean isQuit = false;
	EMsystem()
	{
		System.out.println("欢迎进入员工管理系统！");
		systemInit();
	}
	public void systemInit()
	{
		int flag = 1;
		while(flag == 1 & isQuit == false) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. 查询信息");
			System.out.println("2. 添加信息");
			System.out.println("3. 修改信息");
			System.out.println("4. 删除信息");
			System.out.println("0. 退出系统");
			System.out.println("/**************************************/");
			System.out.print("请选择功能：");
			String s = sc.nextLine();
			switch(s) {
			case "1":
				Retrieve_func();
				break;
			case "2":
				CreateFunc();
				break;
			case "3":
				UpdateFunc();
				break;
			case "4":
				DeleteFunc();
				break;
			case "0":
				QuitFunc();
				isQuit = true;
				break;
			default:
				System.out.print("请输入正确的序号！");
			}	
		}
	}
	
	public void Retrieve_func()
	{
		int flag = 1;
		while(flag == 1 & isQuit == false) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. 查询所有员工基本信息");
			System.out.println("2. 查询所有部门信息");
			System.out.println("3. 查询所有职位信息");
			System.out.println("4. 查询所有工资信息");
			System.out.println("5. 查询某员工的所有工资信息");
			System.out.println("6. 查询某部门下的所有员工");
			System.out.println("7. 查询某部门下的所有职位");
			System.out.println("8. 查询某职位下的所有员工");
			System.out.println("9. 返回上一级");
			System.out.println("0. 退出系统");
			System.out.println("/**************************************/");
			System.out.print("请选择功能：");
			String s=sc.nextLine();
			switch(s) {
			case "1":
				Retrieve.retrieveEmployee();
				break;
			case "2":
				Retrieve.retrieveDepartment();
				break;
			case "3":
				Retrieve.retrievePosition();
				break;
			case "4":
				Retrieve.retrieveSalary();
				break;
			case "5":
				Retrieve.retrieveSalaryByEmployee();
				break;
			case "6":
				Retrieve.retrieveEmployeeByDept();
				break;
			case "7":
				Retrieve.retrievePositionByDept();
				break;
			case "8":
				Retrieve.retrieveEmployeeByPosition();
				break;
			case "9":
				flag = 0;
				ReturnFunc();
				break;
			case "0":
				flag = 0;
				QuitFunc();
				isQuit = true;
				break;
			default:
				System.out.println("请输入正确的序号！");
			}	
		}
	}
	
	public void CreateFunc()
	{
		int flag = 1;
		while(flag == 1 & isQuit == false) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. 添加员工信息");
			System.out.println("2. 添加部门信息");
			System.out.println("3. 添加职位信息");
			System.out.println("4. 添加工资信息");
			System.out.println("5. 返回上一级");
			System.out.println("0. 退出系统");
			System.out.println("/**************************************/");
			System.out.print("请选择功能：");
			String s=sc.nextLine();
			switch(s) {
			case "1":
				Create.createEmployee();
				break;
			case "2":
				Create.createDepartment();
				break;
			case "3":
				Create.createPosition();
				break;
			case "4":
				Create.createSalary();
				break;
			case "5":
				flag = 0;
				ReturnFunc();
				break;
			case "0":
				flag = 0;
				QuitFunc();
				isQuit = true;
				break;
			default:
				System.out.println("请输入正确的序号！");
			}	
		}
	}
	
	public void UpdateFunc()
	{
		int flag = 1;
		while(flag == 1 & isQuit == false) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. 修改某员工的基本信息");
			System.out.println("2. 修改部门信息");
			System.out.println("3. 修改职位信息");
			System.out.println("4. 修改某员工的工资信息");
			System.out.println("5. 返回上一级");
			System.out.println("0. 退出系统");
			System.out.println("/**************************************/");
			System.out.print("请选择功能：");
			String s=sc.nextLine();
			switch(s) {
			case "1":
				Update.updateEmployee();
				break;
			case "2":
				Update.updateDepartment();
				break;
			case "3":
				Update.updatePosition();
				break;
			case "4":
				Update.updateSalary();
				break;
			case "5":
				flag = 0;
				ReturnFunc();
				break;
			case "0":
				flag = 0;
				QuitFunc();
				isQuit = true;
				break;
			default:
				System.out.println("请输入正确的序号！");
			}	
		}
	}
	
	public void DeleteFunc()
	{
		int flag = 1;
		while(flag == 1 & isQuit == false) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. 删除某员工");
			System.out.println("2. 删除某部门");
			System.out.println("3. 删除某职位");
			System.out.println("4. 删除某工资信息");
			System.out.println("5. 删除某部门的所有员工信息");
			System.out.println("6. 删除某员工的所有工资信息");
			System.out.println("7. 返回上一级");
			System.out.println("0. 退出系统");
			System.out.println("/**************************************/");
			System.out.print("请选择功能：");
			String s=sc.nextLine();
			switch(s) {
			case "1":
				Delete.deleteEmployee();
				break;
			case "2":
				Delete.deleteDepartment();
				break;
			case "3":
				Delete.deletePosition();
				break;
			case "4":
				Delete.deleteSalary();
				break;
			case "5":
				Delete.deleteEmployeesByDept();
				break;
			case "6":
				Delete.deleteSalarysByEmployee();
				break;
			case "7":
				flag = 0;
				ReturnFunc();
				break;
			case "0":
				flag = 0;
				QuitFunc();
				isQuit = true;
				break;
			default:
				System.out.println("请输入正确的序号！");
			}	
		}
	}
	
	public void QuitFunc()
	{
		System.out.println("系统退出");
	}
	
	public void ReturnFunc()
	{
		systemInit();
	}
	
}
