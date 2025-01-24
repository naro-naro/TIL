package JcScanner;
import java.util.Scanner;
public class JcPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   double dt,r,area;
   dt = Math.PI;
   
   for(;;) {Scanner input=new Scanner(System.in);
   System.out.print("r에 해당하는 실수값을 입력하세요:");
   r=input.nextDouble();
   if(r==0) break;
   else if(r<0) continue;
   
  area=dt*r*r;
   
   
   System.out.println("반지름이 "+r+"인 삼각형의 넓이는 "+(int)(area*100)/100.0+"입니다.");
	
   }	
}
}