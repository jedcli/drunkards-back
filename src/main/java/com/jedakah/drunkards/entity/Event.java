package com.jedakah.drunkards.entity;

import java.util.Date;
import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Event extends AbstractEntity {

  private User host;
  private Location location;
  private Date createdAt;
  private EventStatus eventStatus;

  @Data
  public static class Location {
    private String latitude;
    private String longitude;
  }

  public enum EventStatus {
    ACTIVE,
    COMPLETED
  }

}
