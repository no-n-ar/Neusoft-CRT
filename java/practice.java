import java.util.*;

public class practice{
	public static void main(String[] args){
		int a = 48;
		char b = (char)a;
		System.out.print(b);
		
		
		char a = '��';
		int b = a;
		System.out.print(b);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������x��ֵ:");
		double x = scanner.nextDouble();
		double y = x*x-2*x-4;
		System.out.print("y��ֵΪ:"+y);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������x��ֵ:");
		double x = scanner.nextDouble();
		double y = x%3;
		double z = x++;
		System.out.println(y);
		System.out.print(z);
		
		int age = 68;
		char sex = '��';
		int a = age<25||sex=='Ů'?100:90;
		System.out.println(a);
		
		
		//��ҳҵ��
		Scanner sca = new Scanner(System.in);
		System.out.print("����������:");
		int total = sca.nextInt();
		int size = 10;
		int page = total%size==0 ? total/size : total/size+1;
		System.out.println(page);
		
		Scanner result = new Scanner(System.in);
		System.out.print("������ɼ�:");
		int score = result.nextInt();
		if(score>100||score<0){
			System.out.println("supper man");
		}else if(score >=90&&score<=100){
			System.out.println("����");
		}else if(score >=80&&score<90){
			System.out.println("����");
		}else{
			System.out.println("������");
		}

		
	}
}