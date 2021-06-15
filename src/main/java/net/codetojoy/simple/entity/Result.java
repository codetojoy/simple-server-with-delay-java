package net.codetojoy.simple.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Result {
    @JsonProperty("people")
    private List<Person> people;

    @JsonProperty("message")
    private String message;

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public List<Person> getPeople() { return people; }
    public void setPeople(List<Person> people) { this.people = people; }
}
