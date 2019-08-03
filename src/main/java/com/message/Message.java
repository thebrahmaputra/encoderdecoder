package com.message;

import java.time.LocalTime;

/**
 * @author mepratikbidwai
 */
public class Message {
    private String msg;
    private String source;
    private String stock;
    private String client;
    private String received;
    private String side;
    private String exch;
    private String price;
    private String qty;

    public Message(String msg, String source){
        this.msg = msg;
        this.source = source;
        this.received = LocalTime.now().toString();
    }

    public Message(String stock, String side, String exch, String price, String qty, String client){
        this(stock, side, exch, price, qty, client, LocalTime.now().toString());
    }

    public Message(String stock, String side, String exch, String price, String qty, String client, String received){
        this.stock = stock;
        this.client = client;
        this.side = side;
        this.exch = exch;
        this.price = price;
        this.qty = qty;
        this.received = received;
    }

    public String getContent(){return stock;}
    public String getStock(){
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getClient(){
        //return source;
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getReceived(){
        return received;
    }

    public String getMsg() {
        return msg;
    }

    public String getSource() {
        return source;
    }

    public String getSide() {
        return side;
    }

    public String getExch() {
        return exch;
    }

    public String getPrice() {
        return price;
    }

    public String getQty() {
        return qty;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    /*@Override
    public boolean equals(Object o){
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(stock, message.stock) &&
                Objects.equals(client, message.client) &&
                Objects.equals(received, message.received) ;
    }

    @Override
    public int hashCode(){
        return Objects.hash(stock, client, received);
    }*/
}
