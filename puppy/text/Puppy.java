package puppy.text;
import java.util.*;
import java.io.Console;
import java.lang.String;

  public class Puppy{
	  public static void main(String[] args)
	  {
		  Scanner in = new Scanner(System.in);
		  System.out.print("你需要的最多的重读字段次数？");
		  int n = in.nextInt();
		  System.out.print("你需要多少行重复字段？");
		  int k = in.nextInt();
		  System.out.print("你需要的重复字段是：");
		  String str = in.next();
		  
		  int[] numbers = new int[n];
		  for(int i = 0;i < numbers.length; i++)//创建一个数组numbers 为 1到n
			  numbers[i]= i + 1;
		  //for(int a = 0;a < n; a++)
			//  System.out.print(".");//输出了n个问号
		  System.out.println();//输出换行
		  int[] result = new int[k];
		  for(int i = 0;i < result.length;i++)
		  { int r = (int)(Math.random()* n );  //获取0到n-1的随机数
		  result[i] = numbers[r]; //result的第i个元素存放为numbers[r]存放的数值
		  numbers[r] = numbers[n-1];
		  n--;
		  }
		  Arrays.sort(result);//对result进行排序
		  for(int r :result)
		      {
			  //System.out.println(r);
		      for(int b = 0;b < r; b++)
		          System.out.print(str);
	          System.out.println();}
		  //循环输出问号
		  System.out.println("接下来一段是波浪形重复符号");
		  
		  for(int c = 0;c < k; c++) {
			  if (c % 2 == 0) {  //如果是奇数行，则输出长字符
				  for(int d = 0; d < n; d++) {
					  System.out.print(str);}
					  }
			  //否则是偶数行，就只输出一半    
			  else  { 
				  for(int d = 0; 2*d < k ; d++) {
					  System.out.print(str);}
				  }
			  System.out.println();
			  
			  }	  
		  }
		}

  
  