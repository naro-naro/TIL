package JcScanner;
import java.util.Scanner;
public class JcPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double dt,r,area;
   dt = Math.PI;
   
   for(;;) {Scanner input=new Scanner(System.in);
   System.out.print("r�� �ش��ϴ� �Ǽ����� �Է��ϼ���:");
   r=input.nextDouble();
   if(r==0) break;
   else if(r<0) continue;
   
  area=dt*r*r;
   
   
   System.out.println("�������� "+r+"�� �ﰢ���� ���̴� "+(int)(area*100)/100.0+"�Դϴ�.");
	
   }	
}
}