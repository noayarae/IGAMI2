package igami2.DataBase.hibernateconfig;
// Generated Jul 17, 2013 10:33:09 PM by Hibernate Tools 3.2.1.GA



/**
 * SdmId generated by hbm2java
 */
public class SdmId  implements java.io.Serializable {


     private int userid;
     private int sdmId;

    public SdmId() {
    }

    public SdmId(int userid, int sdmId) {
       this.userid = userid;
       this.sdmId = sdmId;
    }
   
    public int getUserid() {
        return this.userid;
    }
    
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getSdmId() {
        return this.sdmId;
    }
    
    public void setSdmId(int sdmId) {
        this.sdmId = sdmId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SdmId) ) return false;
		 SdmId castOther = ( SdmId ) other; 
         
		 return (this.getUserid()==castOther.getUserid())
 && (this.getSdmId()==castOther.getSdmId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUserid();
         result = 37 * result + this.getSdmId();
         return result;
   }   


}


