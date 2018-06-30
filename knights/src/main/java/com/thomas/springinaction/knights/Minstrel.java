package com.thomas.springinaction.knights;

/**   
* @Description: 吟游诗人 作为骑士的一个切面
* @author thomas_liu  
* @date 2018年7月1日 上午12:42:20 
* @version V1.0   
*/
public class Minstrel {
	
	public void singBeforeQuest(){
		System.out.println("Fa la la; The knight is so brave!");
	}
	
	public void singAfterQuest(){
		System.out.println("Tee hee he; The brave knight did embark on a quest!");
	}
	
}
