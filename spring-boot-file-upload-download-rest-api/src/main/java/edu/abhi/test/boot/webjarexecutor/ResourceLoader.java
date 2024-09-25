/**
 * 
 */
package edu.abhi.test.boot.webjarexecutor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author abhisheksa
 *
 */
@SuppressWarnings({ "unchecked", "resource" })
public class ResourceLoader {

	private static final Map<String, String> resources = new HashMap<>();
	
	static {
		ApplicationContext context = new ClassPathXmlApplicationContext("../spring/root-context.xml");
		resources.putAll(context.getBean("resources", Map.class));
	}

	/**
	 * @return the resources
	 */
	public static Map<String, String> getResources() {
		return resources;
	}
	
	public static String getResource(String key) {
		return resources.get(key);
	}

}
