package com.kangzhan.entiy;

/**
 * 依赖注入范例：Greeting。
 * 
 * @author 北大青鸟
 */
public class Greeting {
	// 说话的人
	private String person = "Nobody";
	// 说话的内容
	private String words = "nothing";

	/**
	 * 获得 说话的人。
	 *
	 * @return 说话的人

	/**
	 * 定义说话方法。
	 */
	public void sayGreeting() {
		System.out.println(person + "说：“" + words + "”");
	}

}