package com.smhrd.board.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController { //채팅 메시지를 처리하는 컨트롤러

    //클라이언트(사용자)가 입력한 채팅메시지를 받아서 다른 클라이언트(사용자)에게 전달
//    @MessageMapping("/sendMessage") //클라이언트가 메세지를 이곳으로 보내면 메서드를 실행 (/app/sendMessage)
//    @SendTo("/topic/messages")  // 처리 결과를 구독(/topic/messages)한 모든 클라이언트에게 전달
//    public ChatMessage sendMessage(ChatMessage message){
//        //다른 클라이언트에 전달하는메시지   //입력받은 채팅메시지
//        return message; //JAVA Object ~> (JACKSON) ~> 문자열 타입의 JSON 형식 데이터
//    }
}
