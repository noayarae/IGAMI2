package igami2.DataBase.hibernateconfig;
// Generated Jul 17, 2013 10:33:09 PM by Hibernate Tools 3.2.1.GA



/**
 * SdmModellingData generated by hbm2java
 */
public class SdmModellingData  implements java.io.Serializable {


     private SdmModellingDataId id;
     private Integer rating;
     private Double confidence;
     private String datavalues;

    public SdmModellingData() {
    }

	
    public SdmModellingData(SdmModellingDataId id) {
        this.id = id;
    }
    public SdmModellingData(SdmModellingDataId id, Integer rating, Double confidence, String datavalues) {
       this.id = id;
       this.rating = rating;
       this.confidence = confidence;
       this.datavalues = datavalues;
    }
   
    public SdmModellingDataId getId() {
        return this.id;
    }
    
    public void setId(SdmModellingDataId id) {
        this.id = id;
    }
    public Integer getRating() {
        return this.rating;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    public Double getConfidence() {
        return this.confidence;
    }
    
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }
    public String getDatavalues() {
        return this.datavalues;
    }
    
    public void setDatavalues(String datavalues) {
        this.datavalues = datavalues;
    }




}


