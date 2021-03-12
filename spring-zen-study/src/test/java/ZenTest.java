import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zen.bean.Student;

public class ZenTest {
	@Test
	public void testZen(){
		// 这是一个中文注解测试
		String config = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

		Student student = ctx.getBean("myStudent", Student.class);
		student.setName("Foo");
		System.out.println("Student: "+ student);

	}
}
