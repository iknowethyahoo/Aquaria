package com.pricl.test.core.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Helper extends PropertyPlaceholderConfigurer implements
		ApplicationContextAware {
	private static Map<String, String> props = new HashMap<String, String>();

	@Override
	protected void processProperties(
			ConfigurableListableBeanFactory beanFactoryToProcess,
			Properties props) throws BeansException {
		// 初始化props
		for (Object key : props.keySet()) {
			Helper.props.put(key.toString(), props.get(key).toString());
		}
		super.processProperties(beanFactoryToProcess, props);
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public static String getValue(String key) {
		return props.get(key);
	}

	// ////////////////////
	private static ApplicationContext context = null;

	@SuppressWarnings("static-access")
	@Override
	public void setApplicationContext(ApplicationContext context1)
			throws BeansException {
		this.context = context1;
	}

	/**
	 * 如：SnsUser.class
	 * 
	 * @param clazz
	 * @return
	 */
	public static <T> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}

	/**
	 * bean别名 如未定义 首字母需要要写
	 * 
	 * @param name
	 * @return
	 */
	public static Object getBean(String name) {
		return context.getBean(name);
	}

	/**
	 * 获取EntityManagerFactory
	 * 
	 * @return
	 */
	public static EntityManagerFactory getEntityManagerFactory() {
		return context.getBean(EntityManagerFactory.class);
	}
}
