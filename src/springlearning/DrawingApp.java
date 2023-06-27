package springlearning;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
//		BeanFactory factory = new XmlBeanFactory( new FileSystemResource("spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//bean generated via setter based dependency injection
		Triangle t =  (Triangle) context.getBean("triangle");
		context.registerShutdownHook();
		t.draw();
		context.close();
		//context.registerShutDownHook() function does the same thing as context.close() , VERY IMPORTANT - BOTH BELONG TO AbstractApplicationContext class 
		//the only difference is that you can call the registerShutDownHook() releases the resources initialized to 
		//the context when the JVM terminates at the end of every program. It is a fail safe mechanism.
		//Even if due to some unforeseen event, the JVM gets stuck (or enters a not-responding state), even then the registerShutDownHook() gets triggered.
		
		
		//But using close() is a better practice, the developer can close the context at any time as determined by him.
		//lets say that the JVM unfortunately terminated before it encountered the line where you mentioned context.close() in the program
		//that time , the registerShutDownHook() will act as the fail-proof mechanism provided the control has gone past or 
		//reached that line (the line where context.registerShutdownHook() was mentioned) prior to the break in execution.
		
		
		//so the best practice is to use both context.registerShutdownHook() and context.close() functions 
		//and to register the ShutdownHook immediately after context creation.
	}
}