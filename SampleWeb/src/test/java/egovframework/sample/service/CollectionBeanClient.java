package egovframework.sample.service;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import egovframework.sample.service.impl.CollectionBean;

public class CollectionBeanClient {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("egovframework/spring/context-common.xml");
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
		List<String> addressList = bean.getAddressList();
		System.out.println("<주소 목록>");
		for(String address : addressList) {
			System.out.println(address.toString());
		}
		
		factory.close();
	}
}
