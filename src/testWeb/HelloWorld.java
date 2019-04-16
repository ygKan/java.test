package testWeb;
/*课程目的：多重条件句运用。
 * 运用if局进行多重判断
 */
public class HelloWorld {
   public static void main(String[] args){
	   int age =25;//定义初始值
	   if (age > 60){
		   System.out.print("老年");
	   }else if (age > 40){
		   System.out.println("中年");
	   }else if(age > 18){
		   System.out.println("青年");
	   }else{
		   System.out.println("未成年");
	   }
   }
}
