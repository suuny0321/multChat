package com.ll.multiChat.domain.chat.ChatRroom.Controller;

import com.ll.multiChat.domain.chat.ChatRroom.service.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("chat/room")
public class ChatRoomController {

    private final ChatRoomService chatRoomService;

    @PostMapping("/make")
    public  String makeRoom (String name){
        chatRoomService.make(name);
        return "redirect:/chat/chatRoom/make";
    }
    @GetMapping("/list")
    public String roomList (Model model){
        return "doman/chat/chatRoom/list";
    }

}
