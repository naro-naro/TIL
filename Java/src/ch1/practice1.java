package ch1;
 import java.util.Scanner;
 public class practice1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name;
		for(;;) {
        Scanner input = new Scanner(System.in);
		System.out.print("�л��� �̸��� �Է��ϼ���:");
		
		name = input.nextLine();
		
		if(name == "��") {
		System.out.println(name+"�� ���ΰ� �ϱ� �Ƚ��ϴ�.");}
		else if(name == "��" ) {
		System.out.println(name+"�� ���ΰ� �ϱ� �ȱ���!");}
		else {
			System.out.println(name+"�Ե� ���� ��������...");}
		}	
	}
}
