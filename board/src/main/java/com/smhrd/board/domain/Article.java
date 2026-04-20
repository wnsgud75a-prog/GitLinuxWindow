package com.smhrd.board.domain;

//import jakarta.persistence.*;
import lombok.*;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;

//게시물 1개 표현(Model) + 테이블 매핑

//Auditing(감시, 감사) 옵션
//@EntityListeners(AuditingEntityListener.class)
@Setter //Setter 메서드 자동 완성
@Getter //getId, getTitle, getContent -> Getter 메서드 자동 완성
@AllArgsConstructor //전체 필드 초기화 생성자 자동 완성 어노테이션
//@NoArgsConstructor(access = AccessLevel.PROTECTED) //lombok ->기본생성자 자동 완성 어노테이션ㅣ
//@Entity //JPA 핵심 키워드 -> 관계형테이블과 매핑될 모델을 지정
public class Article {
//
//    @Id //기본키 (필수)
//    @GeneratedValue(strategy = GenerationType.IDENTITY) //1~
//    @Column(updatable = false)
//    private Long id; //long(8byte 정수) -> 식별자(Primary Key)
//
//    @Column(name="title", nullable = false)
//    private String title;
//    @Column(name="content", nullable = false)
//    private String content;
//
//    @CreatedDate //날짜생성
//    @Column(name="created_at")
//    private LocalDateTime createdAt; //게시물이 추가된 시간(자동)
//
//    @LastModifiedDate
//    @Column(name="updated_at")
//    private LocalDateTime updatedAt; //최근 수정 시간 (자동)
//
//
//
//    //생성자
//    //Builder 패턴 : 매개변수가 많을 경우 유용한 객체 생성 패턴 ~> lombok
//    //alt + enter => 임포트
//    @Builder
//    public Article(String title, String content){
//        this.title = title;
//        this.content = content;
//    }
//    //new Article("t", "c");
//    //new Article().title("t").content("c")
//
//    //               사용자가 변경하려고 넘겨준 값
//    public void update(String title, String content){ //기존의 저장된 데이터를 수정
//        this.title = title;
//        this.content = content;
//    }

}
