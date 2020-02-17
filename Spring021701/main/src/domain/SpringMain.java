package domain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		//SpringContainer 클래스 객체 만들기
		/*
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Factory.class);
		
		//Bean 생성 메소드를 호출해서 Bean을 생성
		//Factory 클래스의 create 라는 메소드를 이요해서 인스턴스를 생성하고 리턴
		Item item1 = context.getBean("create", Item.class);
		
		item1.setNum(1);
		item1.setName("사과");
		System.out.println(item1.hashCode());
		
		Item item2 = context.getBean("create", Item.class);
		item2.setNum(2);
		item2.setName("한라봉");
		System.out.println(item2.hashCode());
		*/
		
		
		//XML을 이용하는 방법
		GenericXmlApplicationContext context =
				new GenericXmlApplicationContext("classpath:applicationcontext.xml");
		
		//Bean 생성 메소드를 호출해서 Bean을 생성
		//Factory 클래스의 create 라는 메소드를 이요해서 인스턴스를 생성하고 리턴
		//Item item1 = context.getBean("create", Item.class);
		
		//xml 파일을 이용할 때는 id를 기재
		Item item1 = context.getBean("item", Item.class);
		item1.setNum(1);
		item1.setName("사과");
		System.out.println(item1);
		
		//Item item2 = context.getBean("create", Item.class);
		
		Item item2 = context.getBean("item", Item.class);
		item2.setNum(2);
		item2.setName("한라봉");
		System.out.println(item2);

	}

}
