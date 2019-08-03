package com.message.decoder;

import com.message.Message;

import javax.json.Json;
import javax.json.JsonObject;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import java.io.StringReader;

public class MessageDecoder implements Decoder.Text<Message> {
    @Override
    public Message decode(final String textMessage) throws DecodeException {
        JsonObject jsonObject = Json.createReader(new StringReader(textMessage)).readObject();
        Message message = new Message(jsonObject.getString("stock"), jsonObject.getString("side"),
                jsonObject.getString("exch"), jsonObject.getString("price"), jsonObject.getString("qty"),
                jsonObject.getString("client"), jsonObject.getString("received"));

        //public Message(String stock, String side, String exch, String price, String qty, String client, String received){
        /*message.setStock(jsonObject.getString("content"));
        message.setClient(jsonObject.getString("sender"));
        message.setStock();
        message.setReceived(LocalTime.now().toString());*/
        return message;

        /*.add("stock", message.getStock())
                .add("client", message.getClient())
                .add("received", message.getReceived())
                .add("price", message.getPrice())
                .add("qty", message.getQty())
                .add("side", message.getSide())
                .add("exch", message.getExch())
                .build().toString();*/
    }

    @Override
    public boolean willDecode(String s){
        return true;
    }

    @Override
    public void init(EndpointConfig config){

    }

    @Override
    public void destroy() {

    }
}
