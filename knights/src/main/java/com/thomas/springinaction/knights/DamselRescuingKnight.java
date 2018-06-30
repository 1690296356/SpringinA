package com.thomas.springinaction.knights;

/**   
* @Description: damsel少女，书上一直说是公主，个人也觉得公主配骑士
* @author thomas_liu  
* @date 2018年6月30日 下午4:15:52 
* @version V1.0   
*/
public class DamselRescuingKnight implements Knight {
	
	private RescueDamselQuest quest;

	public DamselRescuingKnight() {
		super();
		// 与RescueDamselQuest耦合紧密
		quest = new RescueDamselQuest();
	}



	public void embarkQuest() throws QuestException {
		quest.embark();
	}
	
	

}
