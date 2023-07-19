package com.endava.java2023.service.mapper;

import com.endava.java2023.repository.model.Events;
import com.endava.java2023.service.modelDTO.EventDto;

public class EventToEventDtoMapper {

    public static EventDto convert(Events event){
        return new EventDto(event.getEventId());

    }
}
