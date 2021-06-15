package net.codetojoy.simple.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Result {
    @JsonProperty("people")
    private List<Person> people;

    @JsonProperty("card")
    private int card;

    @JsonProperty("message")
    private String message;

    public int getCard() { return card; }
    public void setCard(int card) { this.card = card; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public List<Person> getPeople() { return people; }
    public void setPeople(List<Person> people) { this.people = people; }
}
