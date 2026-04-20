package com.smhrd.board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration //설정파일
@EnableWebSocketMessageBroker //메시지 브로커(구독관리, 엔드포인트 설정 ...) 활성화
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    //메세지 브로커 정의(구독관리, 메세지)
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //클라이언트가 채널 구독("채팅" / 알림)하는 주소
        registry.enableSimpleBroker("/topic");
        //클라이언트가 서버로 메시지 보낼 수 있는 주소
        registry.setApplicationDestinationPrefixes("/app");
    }
    //엔드포인트 추가 설정 (클라이언트 -> 서버로 연결할 엔드포인트)
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // /chat 이라는 경로로 요청이 들어오면 클라이언트와 서버를 연결 (CONNECT)
        registry.addEndpoint("/chat")
                .setAllowedOriginPatterns("*") // CORS(다른주소에서 요청하는것을 막음) 허용
                .withSockJS(); //Fallback 지원 (오래된 브라우저에서는 지원하지 않을수도 있음 -> 연결유지를 도와줌)
    }
}







