package com.message.encoder;

import com.message.Message;

import javax.json.Json;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class MessageEncoder implements Encoder.Text<Message> {
    @Override
    public String encode(final Message message) {

        /*private String msg;
    private String source;
    private String stock;
    private String client;
    private String received;
    private String side;
    private String exch;
    private String price;
    private String qty;*/
        return Json.createObjectBuilder()
                //.add("content", message.getContent())
                .add("stock", message.getStock())
                .add("client", message.getClient())
                .add("received", message.getReceived())
                .add("price", message.getPrice())
                .add("qty", message.getQty())
                .add("side", message.getSide())
                .add("exch", message.getExch())
                .build().toString();
    }

    @Override
    public void init(EndpointConfig config){

    }

    @Override
    public void destroy(){

    }
}
