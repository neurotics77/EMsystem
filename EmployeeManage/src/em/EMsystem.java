package em;

import java.util.Scanner;

public class EMsystem {
	static final Scanner sc = new Scanner(System.in);
	static boolean isQuit = false;
	EMsystem()
	{
		System.out.println("��ӭ����Ա������ϵͳ��");
		systemInit();
	}
	public void systemInit()
	{
		int flag = 1;
		while(flag == 1 & isQuit == false) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. ��ѯ��Ϣ");
			System.out.println("2. �����Ϣ");
			System.out.println("3. �޸���Ϣ");
			System.out.println("4. ɾ����Ϣ");
			System.out.println("0. �˳�ϵͳ");
			System.out.println("/**************************************/");
			System.out.print("��ѡ���ܣ�");
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
				System.out.print("��������ȷ����ţ�");
			}	
		}
	}
	
	public void Retrieve_func()
	{
		int flag = 1;
		while(flag == 1 & isQuit == false) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. ��ѯ����Ա��������Ϣ");
			System.out.println("2. ��ѯ���в�����Ϣ");
			System.out.println("3. ��ѯ����ְλ��Ϣ");
			System.out.println("4. ��ѯ���й�����Ϣ");
			System.out.println("5. ��ѯĳԱ�������й�����Ϣ");
			System.out.println("6. ��ѯĳ�����µ�����Ա��");
			System.out.println("7. ��ѯĳ�����µ�����ְλ");
			System.out.println("8. ��ѯĳְλ�µ�����Ա��");
			System.out.println("9. ������һ��");
			System.out.println("0. �˳�ϵͳ");
			System.out.println("/**************************************/");
			System.out.print("��ѡ���ܣ�");
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
				System.out.println("��������ȷ����ţ�");
			}	
		}
	}
	
	public void CreateFunc()
	{
		int flag = 1;
		while(flag == 1 & isQuit == false) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. ���Ա����Ϣ");
			System.out.println("2. ��Ӳ�����Ϣ");
			System.out.println("3. ���ְλ��Ϣ");
			System.out.println("4. ��ӹ�����Ϣ");
			System.out.println("5. ������һ��");
			System.out.println("0. �˳�ϵͳ");
			System.out.println("/**************************************/");
			System.out.print("��ѡ���ܣ�");
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
				System.out.println("��������ȷ����ţ�");
			}	
		}
	}
	
	public void UpdateFunc()
	{
		int flag = 1;
		while(flag == 1 & isQuit == false) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. �޸�ĳԱ���Ļ�����Ϣ");
			System.out.println("2. �޸Ĳ�����Ϣ");
			System.out.println("3. �޸�ְλ��Ϣ");
			System.out.println("4. �޸�ĳԱ���Ĺ�����Ϣ");
			System.out.println("5. ������һ��");
			System.out.println("0. �˳�ϵͳ");
			System.out.println("/**************************************/");
			System.out.print("��ѡ���ܣ�");
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
				System.out.println("��������ȷ����ţ�");
			}	
		}
	}
	
	public void DeleteFunc()
	{
		int flag = 1;
		while(flag == 1 & isQuit == false) {
			System.out.println();
			System.out.println("/**************************************/");
			System.out.println("1. ɾ��ĳԱ��");
			System.out.println("2. ɾ��ĳ����");
			System.out.println("3. ɾ��ĳְλ");
			System.out.println("4. ɾ��ĳ������Ϣ");
			System.out.println("5. ɾ��ĳ���ŵ�����Ա����Ϣ");
			System.out.println("6. ɾ��ĳԱ�������й�����Ϣ");
			System.out.println("7. ������һ��");
			System.out.println("0. �˳�ϵͳ");
			System.out.println("/**************************************/");
			System.out.print("��ѡ���ܣ�");
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
				System.out.println("��������ȷ����ţ�");
			}	
		}
	}
	
	public void QuitFunc()
	{
		System.out.println("ϵͳ�˳�");
	}
	
	public void ReturnFunc()
	{
		systemInit();
	}
	
}
