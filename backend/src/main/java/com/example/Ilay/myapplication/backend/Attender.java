package com.example.Ilay.myapplication.backend;

import com.google.appengine.repackaged.org.codehaus.jackson.annotate.JsonIgnore;
import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * Created by Ilay on 20/4/2015.
 */

@Entity
public class Attender {
    @Id
    Long id;
    Ref<TrempitUser> trempitUser;// = Ref.create(new TrempitUser());
    Ref<Event> event;
    String fullName;
    Location startingLocation;

    public Attender() {
    }

    public Attender(Location startingLocation, String fullName, Event event, TrempitUser trempitUser) {
        this.startingLocation = startingLocation;
        this.fullName = fullName;
        this.event = Ref.create(event);
        this.trempitUser = Ref.create(trempitUser);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TrempitUser getTrempitUser() {
        if (trempitUser != null) {
            return trempitUser.get();
        }
        else {
            return null;
        }
    }

    public void setTrempitUser(TrempitUser newTrempitUser) {
        this.trempitUser = Ref.create(newTrempitUser);
    }

    public Event getEvent() {
        if (event != null) {
            return event.get();
        }
        else {
            return null;
        }
    }

    public void setEvent(Event newEvent) {
        this.event = Ref.create(newEvent);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Location getStartingLocation() {
        return startingLocation;
    }

    public void setStartingLocation(Location newStartingLocation) {
        this.startingLocation = newStartingLocation;
    }
}
