package com.ll.multiChat.global.initData;


import com.ll.multiChat.domain.chat.ChatMessage.service.ChatMessageService;
import com.ll.multiChat.domain.chat.ChatRroom.service.ChatRoomService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!prod")
public class NotProd {
    @Bean  //initdate 만들어서 넣기 ( 기본적으로 초기 데이터를 이런식으로 보통 넣는다)
    public ApplicationRunner initNotProd(ChatRoomService chatRoomService, ChatMessageService chatMessageService) {
        return args -> {
            ChatRoom chatRoom1 = chatRoomService.make("공부");
            ChatRoom chatRoom2 = chatRoomService.make("식사");
            ChatRoom chatRoom3 = chatRoomService.make("휴식");

//            IntStream.rangeClosed(1, 100).forEach(num -> {
//            });

            System.out.println("Not Prod");
        };
    }
}
