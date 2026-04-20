package com.smhrd.board.controller;

import com.smhrd.board.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller //view 반환 , 동기통신
@RequestMapping("/api") //앞부분 공통 엔드포인트 처리
public class UserController {

    private final UserService service;
//
//    //회원가입
//    @PostMapping("/users")
//    public String  signup(CreateUserRequest request){
//        //@RequestBody : JSON -> JavaObject
//        //form(submit) -=> JSON 형식 X (FORM-DATA 형식)
//        // @ModelAttribute (생략 가능)
//        service.signup(request); //DB에 추가
//        // articleList.html 페이지 반환
//
//        //forwarding 방식 이동 (첫 요청의 주소만 주소창에 노출)
//        //return "articleList";
//
//        //redirecting 방식 이동 (articleList.html을 리턴 + 게시물 리스트)
//        return "redirect:/articles";
//    }
//
//    //로그인
//    @PostMapping("/login")
//    public String login(LoginRequest request, HttpSession session){
//        User user = service.login(request);
//        //사용자의 로그인 상태 기억
//        //Model : 일회성 (Request)
//        //Session : 사용자의 정보 (서버)
//        session.setAttribute("loginUser", user.getUsername()); //유지하고 싶은 정보 저장
//
//        return "redirect:/articles";
//    }
//
//    //<a></a>
//    @GetMapping("/logout")
//    public String logout(HttpSession session){
//
//        session.invalidate(); //세션에 저장된 사용자 정보 삭제
//
//        return "redirect:/articles";
//    }
}













