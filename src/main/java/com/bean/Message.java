package com.bean;

public class Message {

    private int message_Id;
    private int user_Id;
    private String message_Content;

    public Message() {
    }

    public Message(int message_Id, int user_Id, String message_Content) {
        this.message_Id = message_Id;
        this.user_Id = user_Id;
        this.message_Content = message_Content;
    }

    public int getMessage_Id() {
        return message_Id;
    }

    public void setMessage_Id(int message_Id) {
        this.message_Id = message_Id;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public String getMessage_Content() {
        return message_Content;
    }

    public void setMessage_Content(String message_Content) {
        this.message_Content = message_Content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_Id=" + message_Id +
                ", user_Id=" + user_Id +
                ", message_Content='" + message_Content + '\'' +
                '}';
    }
}
