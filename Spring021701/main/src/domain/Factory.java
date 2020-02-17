package domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Spring의 Bean을 생성해주는 클래스라는 어노테이션
@Configuration
public class Factory {
	//Bean을 만들어주는 메소드라는 어노테이션
	//이 메소드는 매번 Item 인스턴스를 만들어서 리턴하는 것이 아니고
	//처음 1개를 만들고 다음부터는 이 메소드를 호출하면 만들어진 것을 리턴
	@Bean
	public static Item create() {
		//이 메소드는 계속 호출되지 않고 맨 처음 한 번만 호출하고 다음부터는 이전에 만들어진 객체를 이용
		return new Item();
	}

}
