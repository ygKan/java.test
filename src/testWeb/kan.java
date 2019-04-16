package testWeb;
/*目的：二维数组的创建使用
 * 语法：数据类型[][]数组名={{值1，值2.。}，{。。}};
 * 二维循环输出时需要二重循环。
 * 定义一个三行四列的二维数组scores，并赋值使用二次循环输出
 */
public class kan {
   public static void main(String[] args) {
	 //定义一个三行四列的二维数组scores，并赋值
	int [][]scores={{67,74,87,90},{86,58,96,68},{78,79,75,97}};
	//二次循环输出
	for(int i=0;i<scores.length;i++){//scores.length在此表示行数
		for(int j=0; j <scores[i].length;j++){
			//scores[i].length表示每行值的个数
			System.out.println(scores[i] [j]);
		}
		System.out.println();
	}
	
}
}
