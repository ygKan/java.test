package testWeb;
import java.util.Scanner;
/*Ŀ�ģ�Scanner���ߵ�ʹ�ü�ѭ�����ĸ�ϰ
 * 1.�ȵ���Scanner����
 * 2.����Scanner����
 * 3.����Scanner�����������Ϣ
 * 4.ѭ�����ʹ��
 */
public class testHello {
  public static void main(String[] args){
	  Scanner input=new Scanner(System.in);
	  //��������
	  int classNum=2;//�༶����
	  int stuNum=3;//ѧ������
	  double sum=0;//�����ܳɼ�
	 for (int i =1;i<=classNum;i++){
		  sum=0;//ÿִ��һ�ΰ༶��ɼ�����
		  System.out.println("�����"+i+"���༶�ɼ�:");
		  for(int j=1;j<=stuNum;j++){
			  System.out.println("�����"+j+"ѧԱ�ɼ�:");
			  int score=input.nextInt();
			  sum=sum+score;
		  }
		  double avg =sum/classNum;
		  System.out.println("��"+i+"�༶ƽ���֣�"+avg);
	  }
  }
}
