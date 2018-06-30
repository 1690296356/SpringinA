package com.thomas.springinaction.knights;

/**   
* @Description: 解救公主 
* @author thomas_liu  
* @date 2018年6月30日 下午4:07:00 
* @version V1.0   
*/
public class RescueDamselQuest implements Quest {

	public void embark() throws QuestException {
		System.out.println("Rescuing damsel in distress");
	}

}
