package br.com.chat.domain;

import br.com.chat.enums.MessageType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatMessage {
    private String content, sender;
    private MessageType type;
}