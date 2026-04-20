package com.smhrd.board.service;

//import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service //Repository와 연결되는 역할(Service) -> Spring 컨테이너에 알려주는 역할
public class BlogService {
//
//    //new BlogRepository();
//    //직접 객체 생성 불가능 -> Spring 컨테이너에 객체 관리 부탁(IoC) -> 주입(DI)받아 사용
//    private final BlogRepository repository;
//    //의존성 주입 -> 생성자 주입 방식
//    public BlogService(BlogRepository repository){
//        this.repository = repository;
//    }
//    //게시물 추가 기능
//    public Article save(AddArticleRequest request){ //request(title, content)
//        return repository.save(request.toEntity()); //insert~
//    }
//    //게시물 전체 리스트 조회 기능
//    public List<Article> findAll(){
//        List<Article> list = repository.findAll(); //select~
//        return list;
//    }
//
//    //특정 게시물 조회 기능
//    public Article findById(long id){
//        //optional => Null 값을 처리할 수 있는 기능을 포함
//        // ~> 넘겨준 id가 DB에 없는 ID일 경우에는 조회할 데이터가 없어서 Null 이 넘어옴
//        return repository.findById(id) //조회가능한 id
//                .orElseThrow(()->new IllegalArgumentException("not found : " + id)); //조회불가능한 id
//    }
//
//    //특정 게시물 삭제 기능
//    public void delete(long id){
//        repository.deleteById(id);
//        //JPA(JDBC) -> DELETE FROM ARTICLE WHERE ID=?
//    }

    //특정 게시물 1개 수정 기능
//    @Transactional //엔티티의 변경된 값으로 테이블 데이터가 수정됨!
//    public Article update(long id, UpdateArticleRequest request){
//        //1. 수정하고 싶은 데이터를 꺼내와야함(READ -> SELECT)
//        Article article = repository.findById(id) //조회가능한 id
//                .orElseThrow(()->new IllegalArgumentException("not found : " + id));
//
//        //2. 조회한 값을 가지고 있는 엔티티(Article)의 값을 수정 (update)
//        article.update(request.getTitle(), request.getContent());
//
//        return article;
//    }


}








