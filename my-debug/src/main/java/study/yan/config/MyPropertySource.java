package study.yan.config;


import org.springframework.core.env.PropertySource;

/**
 * @author Yan
 * @version 1.0
 * @since 2020/12/28 15:02
 */
public class MyPropertySource extends PropertySource {

	public MyPropertySource(String name) {
		super(name);
	}

	@Override
	public Object getProperty(String name) {
		return "custom property";
	}
}
