package testWeb;
/*Ŀ�ģ���ά����Ĵ���ʹ��
 * �﷨����������[][]������={{ֵ1��ֵ2.��}��{����}};
 * ��άѭ�����ʱ��Ҫ����ѭ����
 * ����һ���������еĶ�ά����scores������ֵʹ�ö���ѭ�����
 */
public class kan {
   public static void main(String[] args) {
	 //����һ���������еĶ�ά����scores������ֵ
	int [][]scores={{67,74,87,90},{86,58,96,68},{78,79,75,97}};
	//����ѭ�����
	for(int i=0;i<scores.length;i++){//scores.length�ڴ˱�ʾ����
		for(int j=0; j <scores[i].length;j++){
			//scores[i].length��ʾÿ��ֵ�ĸ���
			System.out.println(scores[i] [j]);
		}
		System.out.println();
	}
	
}
}
