package com.smhrd.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//Annotation : 컴파일 시 확인하는 주석
//Spring Framework : annotation을 기반으로 동작
//@SpringBootApplication
//해당 위치를 기준으로 하위에 있는 클래스들만 객체화 하여 사용할 수 있도록 함
//@EnableJpaAuditing  //Auditing 기능 활성화 (Entity)
@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
