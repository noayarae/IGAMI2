package igami2.DataBase.hibernateconfig;
// Generated Jul 17, 2013 10:33:09 PM by Hibernate Tools 3.2.1.GA



/**
 * KendallstatsUserData generated by hbm2java
 */
public class KendallstatsUserData  implements java.io.Serializable {


     private KendallstatsUserDataId id;
     private Double mean;
     private Double stdDeviation;

    public KendallstatsUserData() {
    }

	
    public KendallstatsUserData(KendallstatsUserDataId id) {
        this.id = id;
    }
    public KendallstatsUserData(KendallstatsUserDataId id, Double mean, Double stdDeviation) {
       this.id = id;
       this.mean = mean;
       this.stdDeviation = stdDeviation;
    }
   
    public KendallstatsUserDataId getId() {
        return this.id;
    }
    
    public void setId(KendallstatsUserDataId id) {
        this.id = id;
    }
    public Double getMean() {
        return this.mean;
    }
    
    public void setMean(Double mean) {
        this.mean = mean;
    }
    public Double getStdDeviation() {
        return this.stdDeviation;
    }
    
    public void setStdDeviation(Double stdDeviation) {
        this.stdDeviation = stdDeviation;
    }




}


