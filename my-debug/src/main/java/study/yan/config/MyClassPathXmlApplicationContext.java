package study.yan.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.MutablePropertySources;

/**
 * @author Yan
 * @version 1.0
 * @since 2020/12/28 14:48
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
	@Override
	protected void initPropertySources() {
		MutablePropertySources propertySources = getEnvironment().getPropertySources();
		MyPropertySource custom = new MyPropertySource("custom");
		propertySources.addLast(custom);
		propertySources.replace("", null);
		propertySources.replace("custom", null);
		getEnvironment().setRequiredProperties("custom");
		super.initPropertySources();
	}
}
