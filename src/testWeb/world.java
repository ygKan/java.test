package testWeb;
import java.util.Scanner;//导入工具

/*目的：条件语句switch 及Scanner工具使用练习；
 */
public class world {
   public static void main(String[] args){
	   Scanner input=new Scanner(System.in);//创建scanner对象
	   System.out.println("请输入信息：");
	   String month =input.next();//接受scanner对象的信息并保存在month中
	   switch(month){
	     case"六月":
	    	 System.out.println("六月的风");
	    	 break;
	     case"五月":
	    	 System.out.println("五月的雨");
	    	 break;
	     case"四月":
	    	 System.out.println("四月是你的谎言");
	         break;
	     default:
	    	 System.out.println("春走了");
	   }
   }

}
