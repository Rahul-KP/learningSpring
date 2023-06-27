package springlearning;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
//		BeanFactory factory = new XmlBeanFactory( new FileSystemResource("spring.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//bean generated via setter based dependency injection
		Shape s =  (Shape) context.getBean("circle");
		context.registerShutdownHook();
		s.draw();
		context.close();
	}
}