package com.thomas.springinaction.knights;

/**   
* @Description: TODO(用一句话描述该文件做什么) 
* @author thomas_liu  
* @date 2018年6月30日 下午4:11:50 
* @version V1.0   
*/
public class BraveKnight implements Knight {
	private Quest quest;
	
	public BraveKnight(Quest quest) {
		super();
		this.quest = quest;
	}

	public void embarkQuest() throws QuestException {
		quest.embark();	
	}

}
