package igami2.DataBase.hibernateconfig;
// Generated Jul 17, 2013 10:33:09 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * UsersFeedbackTiming generated by hbm2java
 */
@Entity
public class UsersFeedbackTiming  implements java.io.Serializable {


    @EmbeddedId
     private UsersFeedbackTimingId id;
     private Integer page;
     private String event;
     private Date eventtime;

    public UsersFeedbackTiming() {
    }

	
    public UsersFeedbackTiming(UsersFeedbackTimingId id) {
        this.id = id;
    }
    public UsersFeedbackTiming(UsersFeedbackTimingId id, Integer page, String event, Date eventtime) {
       this.id = id;
       this.page = page;
       this.event = event;
       this.eventtime = eventtime;
    }
   
    public UsersFeedbackTimingId getId() {
        return this.id;
    }
    
    public void setId(UsersFeedbackTimingId id) {
        this.id = id;
    }
    public Integer getPage() {
        return this.page;
    }
    
    public void setPage(Integer page) {
        this.page = page;
    }
    public String getEvent() {
        return this.event;
    }
    
    public void setEvent(String event) {
        this.event = event;
    }
    public Date getEventtime() {
        return this.eventtime;
    }
    
    public void setEventtime(Date eventtime) {
        this.eventtime = eventtime;
    }




}


