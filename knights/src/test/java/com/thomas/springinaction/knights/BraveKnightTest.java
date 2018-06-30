package com.thomas.springinaction.knights;

import static org.mockito.Mockito.*;

import org.junit.Test;

/**   
* @Description: TODO(用一句话描述该文件做什么) 
* @author thomas_liu  
* @date 2018年6月30日 下午6:08:48 
* @version V1.0   
*/
public class BraveKnightTest {
	
	@Test
	public void knightShouldEmbarkOnQuest() throws QuestException{
		
		//mock一个Quest
		Quest mockQuest = mock(Quest.class);
		
		//注入这个quest
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkQuest();
		
//		verify(mockQuest, times(1)).embark();
		
//		verify(mockQuest, atLeast(5)).embark();
		
		verify(mockQuest, atLeastOnce()).embark();
		
	}
	
}
