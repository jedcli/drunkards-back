package com.jedakah.drunkards.manager;

import com.jedakah.drunkards.to.event.CreateEventRequest;
import com.jedakah.drunkards.to.event.GetEventResponse;
import java.util.List;

public interface EventManager {

    GetEventResponse getEvent(Long eventId);
    List<GetEventResponse> getAllEvents();
    GetEventResponse createEvent(CreateEventRequest createEventRequest);
    GetEventResponse leaveEvent(Long eventId);
    GetEventResponse stopEvent(Long eventId);
    GetEventResponse joinEvent(Long eventId);

}
