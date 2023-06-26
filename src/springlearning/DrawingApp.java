package springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
//		BeanFactory factory = new XmlBeanFactory( new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//bean generated via setter based dependency injection
		Triangle t =  (Triangle) context.getBean("triangle");
		t.draw();		
		((AbstractApplicationContext) context).close();
	}
}