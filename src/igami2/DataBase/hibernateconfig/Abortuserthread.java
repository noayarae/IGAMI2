package igami2.DataBase.hibernateconfig;
// Generated Jul 17, 2013 10:33:09 PM by Hibernate Tools 3.2.1.GA

import javax.persistence.Entity;
import javax.persistence.Id;




/**
 * Abortuserthread generated by hbm2java
 */
@Entity
public class Abortuserthread  implements java.io.Serializable {


    @Id
     private int userid;
     private Boolean abort;

    public Abortuserthread() {
    }

	
    public Abortuserthread(int userid) {
        this.userid = userid;
    }
    public Abortuserthread(int userid, Boolean abort) {
       this.userid = userid;
       this.abort = abort;
    }
   
    public int getUserid() {
        return this.userid;
    }
    
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public Boolean getAbort() {
        return this.abort;
    }
    
    public void setAbort(Boolean abort) {
        this.abort = abort;
    }




}


