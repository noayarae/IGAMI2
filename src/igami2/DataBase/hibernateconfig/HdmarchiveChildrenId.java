package igami2.DataBase.hibernateconfig;
// Generated Jul 17, 2013 10:33:09 PM by Hibernate Tools 3.2.1.GA



/**
 * HdmarchiveChildrenId generated by hbm2java
 */
public class HdmarchiveChildrenId  implements java.io.Serializable {


     private int userid;
     private int searchid;
     private long indvid;
     private int globalSessionid;
     private int localSessionid;
     private int sessionid;
     private byte sessionType;

    public HdmarchiveChildrenId() {
    }

    public HdmarchiveChildrenId(int userid, int searchid, long indvid, int globalSessionid, int localSessionid, int sessionid, byte sessionType) {
       this.userid = userid;
       this.searchid = searchid;
       this.indvid = indvid;
       this.globalSessionid = globalSessionid;
       this.localSessionid = localSessionid;
       this.sessionid = sessionid;
       this.sessionType = sessionType;
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
    public long getIndvid() {
        return this.indvid;
    }
    
    public void setIndvid(long indvid) {
        this.indvid = indvid;
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
    public byte getSessionType() {
        return this.sessionType;
    }
    
    public void setSessionType(byte sessionType) {
        this.sessionType = sessionType;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof HdmarchiveChildrenId) ) return false;
		 HdmarchiveChildrenId castOther = ( HdmarchiveChildrenId ) other; 
         
		 return (this.getUserid()==castOther.getUserid())
 && (this.getSearchid()==castOther.getSearchid())
 && (this.getIndvid()==castOther.getIndvid())
 && (this.getGlobalSessionid()==castOther.getGlobalSessionid())
 && (this.getLocalSessionid()==castOther.getLocalSessionid())
 && (this.getSessionid()==castOther.getSessionid())
 && (this.getSessionType()==castOther.getSessionType());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUserid();
         result = 37 * result + this.getSearchid();
         result = 37 * result + (int) this.getIndvid();
         result = 37 * result + this.getGlobalSessionid();
         result = 37 * result + this.getLocalSessionid();
         result = 37 * result + this.getSessionid();
         result = 37 * result + this.getSessionType();
         return result;
   }   


}


