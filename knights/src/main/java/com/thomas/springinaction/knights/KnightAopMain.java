package com.thomas.springinaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

/**   
* @Description: TODO(用一句话描述该文件做什么) 
* @author thomas_liu  
* @date 2018年6月30日 下午8:16:00 
* @version V1.0   
*/
public class KnightAopMain {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("knights-aop.xml");
		Knight knight = (Knight) context.getBean("knight");
		
		knight.embarkQuest();
	}

}
