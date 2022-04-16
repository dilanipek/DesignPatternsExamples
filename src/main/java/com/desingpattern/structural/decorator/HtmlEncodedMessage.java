package com.desingpattern.structural.decorator;

import org.apache.commons.text.*;

//decorator
public class HtmlEncodedMessage implements Message {

    private Message msg;

    public HtmlEncodedMessage(Message message) {
        this.msg = message;

    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(msg.getContent());
    }
}
