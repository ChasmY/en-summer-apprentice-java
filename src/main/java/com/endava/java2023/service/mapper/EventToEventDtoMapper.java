package com.endava.java2023.service.mapper;

import com.endava.java2023.repository.modelDBO.Event;
import com.endava.java2023.service.modelDTO.EventDto;

public class EventToEventDtoMapper {


    public static EventDto convert(Event event){
        return new EventDto(event.getEventId(),event.getVenue(), event.getEventTypeId(),event.getEventName()
        ,event.getStartDate(), event.getEndDate(), event.getDescription());

    }
}
