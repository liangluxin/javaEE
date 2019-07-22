package com.xiaoxin.day03.位运算符;


public class Demo3_Operator {
	public static void main(String[] args) {
		/*
		*  <<:左移	左边最高位丢弃，右边补齐0
		*  >>:右移	最高位是0，左边补齐0;最高为是1，左边补齐1
		*  >>>:无符号右移 无论最高位是0还是1，左边补齐0
		*  最有效率的算出2 * 8的结果
		*/

		//左移,向左移动几位就是乘以2的几次幂
		//System.out.println(12 << 1);		//24
		//System.out.println(12 << 2);		//48

		/*
		00000000 00000000 00000000 00001100		12的补码
	 (0)0000000 00000000 00000000 000011000		24的补码
	(00)000000 00000000 00000000 0000110000		48的补码
		*/

		//右移,向右移动几位就是除以2的几次幂
		//System.out.println(12 >> 1);
		//System.out.println(12 >> 2);

		/*
		00000000 00000000 00000000 00001100		12的补码
		000000000 00000000 00000000 0000110(0)	6
		0000000000 00000000 00000000 000011(00) 3
		*/

		//最有效率的算出2 * 8的结果
		System.out.println(2 << 3);
	}
}
