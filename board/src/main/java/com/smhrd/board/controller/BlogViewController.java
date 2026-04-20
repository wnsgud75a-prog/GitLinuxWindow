package com.smhrd.board.controller;

import ch.qos.logback.core.model.Model;
import com.smhrd.board.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor //초기화가 필수인 필드만 초기화하는 생성자 생성 + final (Lombok)
@Controller //View(화면)을 응답하는 컨트롤러
public class BlogViewController {

    //생성자 주입 방식
    private final BlogService service;

//    public BlogViewController(BlogService service){
//        this.service = service;
//    }
    @GetMapping("/")   //http://localhost:8085/articles
    public String getArticles(Model model) {
        return "articleList";
    }

    //게시물 전체 리스트(데이터-Model)가 출력된 화면(View) 응답하는 기능
//    @GetMapping("/")   //http://localhost:8085/articles
//    public String getArticles(Model model){
//        //List<Article> list = service.findAll();
//        //List<ArticleListViewResponse> articles = list.stream().map(ArticleListViewResponse::new).toList();
//        // 응답시 데이터를 포함할 수 있도록 Model(데이터를 저장하는 객체->Spring Container 에서 관리) 객체 사용
//
//        //model.addAttribute("articles", articles); //모델에 값 저장
//
//        //View-Resolver(Spring 내장) : view name을 가지고 응답할 View를 찾아주는 역할
//        // => resources/templates/{view name}.html (기본값)
//
//        return "articleList"; //view name
//    }
//
//    //게시물 상세보기 화면
//    @GetMapping("/articles/{id}")
//    public String getArticle(@PathVariable Long id, Model model){
//
//        Article article = service.findById(id);
//        //new ArticleListViewResponse(article);
//        model.addAttribute("article", new ArticleViewResponse(article));
//
//        return "article";
//    }
//
//    //게시물 추가 or 수정 화면
//    @GetMapping("/new-articles")  //?k=v(쿼리스트링) 은 경로가 아니기 때문에 따로 받아야 함!
//    public String newArticle(@RequestParam(required = false) Long id, Model model){
//        //required : 해당 파라미터가 필수인지 표시 (false -> 필수가 아님을 명시함 , 수정(o), 등록(x))
//        // (쿼리스트링, get) -> request.getParameter(name)
//        if(id == null){ //(등록) -> 그냥 이동
//            model.addAttribute("article", new ArticleViewResponse());
//        }else{ //(수정) -> 선택한 게시물의 정보(현재 DB값)를 가지고 이동
//            Article article = service.findById(id);
//            model.addAttribute("article", new ArticleViewResponse(article));
//        }
//
//        return "newArticle";
//    }
//
//    //BlogViewController 요청 (HTTP 통신)  http://localhost:8085
//    //ChatController 요청 (WebSocket 통신) ws://localhost:8085
//    @GetMapping("/chat")
//    public String chat(){
//        return "chat";
//    }


}






