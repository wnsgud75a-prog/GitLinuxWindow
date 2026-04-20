package com.smhrd.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
//
//    private final UserRepository repository;
//
//    //회원가입
//    public Long signup(CreateUserRequest request){
//        User user = new User();
//        user.setUsername(request.getUsername());
//        user.setPassword(request.getPassword());
//
//        return repository.save(user).getId(); //값 추가 후 id 값만 리턴
//    }
//
//    //로그인
//    public User login(LoginRequest request){
//        // 1. select * from user where username=?
//        // 2. 해당 username을 가진 사용자 정보를 전부 가져옴 (username 중복 X)  0, 1
//        // 3. 사용자정보중 패스워드 값과 사용자가 입력한 패스워드 일치여부 확인 ~> 성공 / 실패 (오류처리)
//        User user = repository.findByUsername(request.getUsername())
//                .orElseThrow(()-> new IllegalArgumentException("해당 사용자 없음"));
//
//        if(!user.getPassword().equals(request.getPassword())){ // 불일치 할 경우 (!false ~> true)
//            throw new IllegalArgumentException("비밀번호 오류");
//        }
//
//        //일치한 경우
//        return user;
//    }
}










