package com.xiaoxin.day04.循环嵌套;

/*
* A:案例演示
	* 需求：在控制台输出九九乘法表。

1 * 1 = 1
1 * 2 = 2 2 * 2 = 4
1 * 3 = 3 2 * 3 = 6 3 * 3 = 9
...

*
**
***
*/
class Demo3_For99 {
	public static void main(String[] args) {
		for (int i = 9;i >= 1 ;i-- ) {					//行数

			for (int j = 1;j <= i ;j++ ) {				//列数
				System.out.print(j + "*" + i + "=" + (i * j) + "\t" );
			}
			System.out.println();

		}
		System.out.println("=================");

		test1();

		//System.out.println("\"");				转义双引号
		//System.out.println('\'');				//转义单引号
	}
	public static void test1(){
		for(int i = 0;i<=9;i++){
			for(int j =1;j<=i;j++){
				System.out.print(j + "*" + i + "=" + (i * j) + "\t" );
			}
			System.out.println();

		}
	}
}
