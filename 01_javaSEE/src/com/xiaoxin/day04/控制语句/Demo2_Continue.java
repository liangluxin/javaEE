package com.xiaoxin.day04.控制语句;

/*
* A:continue的使用场景
	* 只能在循环中 
*/
class Demo2_Continue {
	public static void main(String[] args) {
		for (int x = 1;x <= 10 ;x++ ) {
			if (x == 4) {
				//break;
				continue;							//终止本次循环,继续下次循环
			}

			System.out.println("x = " + x);
		}
		System.out.println("----");
	}
}
