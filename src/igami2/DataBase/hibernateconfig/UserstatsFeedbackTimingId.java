package igami2.DataBase.hibernateconfig;
// Generated Jul 17, 2013 10:33:09 PM by Hibernate Tools 3.2.1.GA



/**
 * UserstatsFeedbackTimingId generated by hbm2java
 */
public class UserstatsFeedbackTimingId  implements java.io.Serializable {


     private int userid;
     private int searchid;
     private int globalSessionid;
     private int localSessionid;
     private int sessionid;
     private int introspectionType;
     private int id;

    public UserstatsFeedbackTimingId() {
    }

    public UserstatsFeedbackTimingId(int userid, int searchid, int globalSessionid, int localSessionid, int sessionid, int introspectionType, int id) {
       this.userid = userid;
       this.searchid = searchid;
       this.globalSessionid = globalSessionid;
       this.localSessionid = localSessionid;
       this.sessionid = sessionid;
       this.introspectionType = introspectionType;
       this.id = id;
    }
   
    public int getUserid() {
        return this.userid;
    }
    
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getSearchid() {
        return this.searchid;
    }
    
    public void setSearchid(int searchid) {
        this.searchid = searchid;
    }
    public int getGlobalSessionid() {
        return this.globalSessionid;
    }
    
    public void setGlobalSessionid(int globalSessionid) {
        this.globalSessionid = globalSessionid;
    }
    public int getLocalSessionid() {
        return this.localSessionid;
    }
    
    public void setLocalSessionid(int localSessionid) {
        this.localSessionid = localSessionid;
    }
    public int getSessionid() {
        return this.sessionid;
    }
    
    public void setSessionid(int sessionid) {
        this.sessionid = sessionid;
    }

    public int getIntrospectionType() {
        return introspectionType;
    }

    public void setIntrospectionType(int introspectionType) {
        this.introspectionType = introspectionType;
    }   
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserstatsFeedbackTimingId) ) return false;
		 UserstatsFeedbackTimingId castOther = ( UserstatsFeedbackTimingId ) other; 
         
		 return (this.getUserid()==castOther.getUserid())
 && (this.getSearchid()==castOther.getSearchid())
 && (this.getGlobalSessionid()==castOther.getGlobalSessionid())
 && (this.getLocalSessionid()==castOther.getLocalSessionid())
 && (this.getSessionid()==castOther.getSessionid())
 && (this.getIntrospectionType()==castOther.getIntrospectionType())
 && (this.getId()==castOther.getId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUserid();
         result = 37 * result + this.getSearchid();
         result = 37 * result + this.getGlobalSessionid();
         result = 37 * result + this.getLocalSessionid();
         result = 37 * result + this.getSessionid();
         result = 37 * result + this.getIntrospectionType();
         result = 37 * result + this.getId();
         return result;
   }   


}


