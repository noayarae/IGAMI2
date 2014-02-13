package igami2.DataBase.hibernateconfig;
// Generated Jul 17, 2013 10:33:09 PM by Hibernate Tools 3.2.1.GA

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;




/**
 * UsersFeedback generated by hbm2java
 */
@Entity
public class UsersFeedback  implements java.io.Serializable {


    @EmbeddedId
     private UsersFeedbackId id;
     private int rating;
     private float confidence;

    public UsersFeedback() {
    }

    public UsersFeedback(UsersFeedbackId id, int rating, float confidence) {
       this.id = id;
       this.rating = rating;
       this.confidence = confidence;
    }
   
    public UsersFeedbackId getId() {
        return this.id;
    }
    
    public void setId(UsersFeedbackId id) {
        this.id = id;
    }
    public int getRating() {
        return this.rating;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    public float getConfidence() {
        return this.confidence;
    }
    
    public void setConfidence(float confidence) {
        this.confidence = confidence;
    }




}


