package igami2.DataBase.hibernateconfig;
// Generated Jul 17, 2013 10:33:09 PM by Hibernate Tools 3.2.1.GA



/**
 * CbmInitialF1Id generated by hbm2java
 */
public class CbmInitialF1Id  implements java.io.Serializable {


     private byte tenureType;
     private int bmpid;
     private int indvid;

    public CbmInitialF1Id() {
    }

    public CbmInitialF1Id(byte tenureType, int bmpid, int indvid) {
       this.tenureType = tenureType;
       this.bmpid = bmpid;
       this.indvid = indvid;
    }
   
    public byte getTenureType() {
        return this.tenureType;
    }
    
    public void setTenureType(byte tenureType) {
        this.tenureType = tenureType;
    }
    public int getBmpid() {
        return this.bmpid;
    }
    
    public void setBmpid(int bmpid) {
        this.bmpid = bmpid;
    }
    public int getIndvid() {
        return this.indvid;
    }
    
    public void setIndvid(int indvid) {
        this.indvid = indvid;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CbmInitialF1Id) ) return false;
		 CbmInitialF1Id castOther = ( CbmInitialF1Id ) other; 
         
		 return (this.getTenureType()==castOther.getTenureType())
 && (this.getBmpid()==castOther.getBmpid())
 && (this.getIndvid()==castOther.getIndvid());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getTenureType();
         result = 37 * result + this.getBmpid();
         result = 37 * result + this.getIndvid();
         return result;
   }   


}


