package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    public static int count;
    private int num;

    public void setNum(int count){
        this.num = count;
    }

    public static int increase(){
        count++;
        return count;
    }

    public static int decrease(){
        count--;
        return count;
    }
}
