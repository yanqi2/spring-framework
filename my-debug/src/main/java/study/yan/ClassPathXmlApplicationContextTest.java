package study.yan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.yan.models.A;

/**
 * @author Yan
 * @version 1.0
 * @since 2020/12/28 12:40
 */
public class ClassPathXmlApplicationContextTest {
	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-context.xml");
		A a = cxt.getBean("a", A.class);
		System.out.println(a);
	}
}
