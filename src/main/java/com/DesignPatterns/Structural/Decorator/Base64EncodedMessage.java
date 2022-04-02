package com.DesignPatterns.Structural.Decorator;

import org.springframework.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
//decorator

public class Base64EncodedMessage implements Message {

    private Message msg;

    Base64EncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
    }
}
