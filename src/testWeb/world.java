package testWeb;
import java.util.Scanner;//���빤��

/*Ŀ�ģ��������switch ��Scanner����ʹ����ϰ��
 */
public class world {
   public static void main(String[] args){
	   Scanner input=new Scanner(System.in);//����scanner����
	   System.out.println("��������Ϣ��");
	   String month =input.next();//����scanner�������Ϣ��������month��
	   switch(month){
	     case"����":
	    	 System.out.println("���µķ�");
	    	 break;
	     case"����":
	    	 System.out.println("���µ���");
	    	 break;
	     case"����":
	    	 System.out.println("��������Ļ���");
	         break;
	     default:
	    	 System.out.println("������");
	   }
   }

}
