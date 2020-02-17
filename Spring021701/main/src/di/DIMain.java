package di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DIMain {

	public static void main(String[] args) {
		//스프링 설정 파일의 경로를 설정
		//classpath: src 또는 src/main/java, src/main/resources
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:diconfig.xml");
		//bean 찾아오기
		//주입받는 코드가 없음
		DTO dto = context.getBean("dto", DTO.class);
		System.out.println(dto);
		//diconfig.xml 파일에서 설정한 내용이 출력
		System.out.println(dto.getName());
		
		DTO dto1 = context.getBean("dto1", DTO.class);
		System.out.println(dto1.getName());
		
		DTO dto2 = context.getBean("dto2", DTO.class);
		System.out.println(dto2.getName());
		
		context.close();
		
		

	}

}
