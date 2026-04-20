package com.smhrd.board.controller;

import com.smhrd.board.service.BlogService;
import org.springframework.web.bind.annotation.*;

//Controller (Controller - 결과값(뷰-화면)/ RestController - 결과값(데이터(값)-Model))
@RestController//응답은 Model(데이터) 형식으로 함
public class BlogController {

    private final BlogService service;

    public BlogController(BlogService service){
        this.service = service;
    }
//    @PostMapping("/api/articles")
//    public void addArticle() { //jackson(json<->java object)
//
//    }

    //게시물 추가 기능
    //요청 주소 : [POST]http://localhost:8085/api/articles
//    @PostMapping("/api/articles")
//    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request){ //jackson(json<->java object)
//
//        //request.getTitle();
//        //request.getContent();
//
//        //사용자 입력한 요청 파라미터(title, content) 받기
//        //request.getParameter("title");
//        Article savedArticle = service.save(request);
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
//    }

    // 게시물 전체 리스트 조회 기능
//    @GetMapping("/api/articles")
//    public ResponseEntity<List<ArticleResponse>> findAllArticles(){
//
//        List<Article> list = service.findAll();
//        //응답(id제외, title, content) -> list
//
//        //리스트안에서 순차적으로 Article(id,title, content) 객체를 꺼내와서
//        //ArticleResponse(title,content) 타입의 새로운 객체에 매핑
//        //~> 리스트로 묶기
//        List<ArticleResponse> articles = list.stream().map(ArticleResponse::new).toList();
//
//        return ResponseEntity.ok().body(articles);
//    }
//
//    // 특정 게시물 조회 기능
//    @GetMapping("/api/articles/{id}")
//    public ResponseEntity<ArticleResponse> findArticle(@PathVariable long id){
//        Article article = service.findById(id);
//
//        //new ArticleResponse(article); //Article -> ArticleResponse(DTO)
//
//        return ResponseEntity.ok().body(new ArticleResponse(article));
//    }
//
//    //특정 게시물 1개 삭제
//    @DeleteMapping("/api/articles/{id}")
//    public ResponseEntity<Void> deleteArticle(@PathVariable long id){
//        service.delete(id);
//
//        return ResponseEntity.ok().build();
//    }

    //특정 게시물 1개 수정
//    @PutMapping("/api/articles/{id}")
//    public ResponseEntity<Article> updateArticle(@PathVariable long id, @RequestBody UpdateArticleRequest request){
//        Article updatedArticle = service.update(id, request);
//
//        return ResponseEntity.ok().body(updatedArticle);
//    }
}











