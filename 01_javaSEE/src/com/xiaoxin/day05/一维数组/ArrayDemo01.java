package com.xiaoxin.day05.一维数组;
class ArrayDemo01 {
	public static void main(String[] args) {
		//定义一个数组,静态初始化
		int[] arr = {10,20,13,15,25,10,15};
		//数组遍历: 遍历是什么意思? 把数组中的每个元素一个个拿出来看一下
		//System.out.println(arr[0]);
		//arr.length 属性:数组名.length
		for (int i = 0;i < arr.length ;i++ ){  //数组中有多少个元素,我就帮你一个个打印出来 //细节 别写=号
			System.out.println(arr[i]); //
		}
		test();
	}
	
	public static void test(){
		int[] arr = {10,20,30,405,30,405,600};
		
		for (int i =0;i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
