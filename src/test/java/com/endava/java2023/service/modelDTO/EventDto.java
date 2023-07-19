package com.endava.java2023.service.modelDTO;

import java.util.Map;

public class EventDto {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //de lucrat pe mai tarziu la constructor il intrebam pe daniel in alta zi
    public EventDto(int id) {
        this.id = id;
    }


}
