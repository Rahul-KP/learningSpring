package springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
//		BeanFactory factory = new XmlBeanFactory( new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//bean generated via setter based dependency injection
		Triangle t =  (Triangle) context.getBean("triangleShape");
		t.draw();
		
		//bean generated via constructor based dependency injection
		t = (Triangle) context.getBean("triangleType");
		t.draw();
		
		t = (Triangle) context.getBean("triangleHeight");
		t.draw();
		
		t = (Triangle) context.getBean("Overloading1");
		t.draw();
		
		t = (Triangle) context.getBean("Overloading2");
		t.draw();
		
		((AbstractApplicationContext) context).close();
	}
}