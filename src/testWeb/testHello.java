package testWeb;
import java.util.Scanner;
/*目的：Scanner工具的使用及循环语句的复习
 * 1.先导入Scanner工具
 * 2.建立Scanner对象
 * 3.接受Scanner对象输入的信息
 * 4.循环语句使用
 */
public class testHello {
  public static void main(String[] args){
	  Scanner input=new Scanner(System.in);
	  //创建对象
	  int classNum=2;//班级数量
	  int stuNum=3;//学生数量
	  double sum=0;//保存总成绩
	 for (int i =1;i<=classNum;i++){
		  sum=0;//每执行一次班级后成绩归零
		  System.out.println("输入第"+i+"个班级成绩:");
		  for(int j=1;j<=stuNum;j++){
			  System.out.println("输入第"+j+"学员成绩:");
			  int score=input.nextInt();
			  sum=sum+score;
		  }
		  double avg =sum/classNum;
		  System.out.println("第"+i+"班级平均分："+avg);
	  }
  }
}
