package com.smhrd.board.domain;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor //기본생성자
@Setter //* JPA (Select -> 기본생성자 + Setter 조합으로 동작)
@Getter
//@Entity //JPA 엔티티로 지정
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //회원식별자

    private String username; //아이디
    private String password; //비밀번호
}
