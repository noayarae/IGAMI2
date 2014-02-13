package igami2.DataBase.hibernateconfig;
// Generated Jul 17, 2013 10:33:09 PM by Hibernate Tools 3.2.1.GA

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;




/**
 * Biasindvdata generated by hbm2java
 */
@Entity
public class Biasindvdata  implements java.io.Serializable {


    @EmbeddedId
     private BiasindvdataId id;
     private long indvid;
     private Byte ratingActual;
     private Byte ratingNew;
     private Double confidenceActual;
     private Double confidenceNew;

    public Biasindvdata() {
    }

	
    public Biasindvdata(BiasindvdataId id, long indvid) {
        this.id = id;
        this.indvid = indvid;
    }
    public Biasindvdata(BiasindvdataId id, long indvid, Byte ratingActual, Byte ratingNew, Double confidenceActual, Double confidenceNew) {
       this.id = id;
       this.indvid = indvid;
       this.ratingActual = ratingActual;
       this.ratingNew = ratingNew;
       this.confidenceActual = confidenceActual;
       this.confidenceNew = confidenceNew;
    }
   
    public BiasindvdataId getId() {
        return this.id;
    }
    
    public void setId(BiasindvdataId id) {
        this.id = id;
    }
    public long getIndvid() {
        return this.indvid;
    }
    
    public void setIndvid(long indvid) {
        this.indvid = indvid;
    }
    public Byte getRatingActual() {
        return this.ratingActual;
    }
    
    public void setRatingActual(Byte ratingActual) {
        this.ratingActual = ratingActual;
    }
    public Byte getRatingNew() {
        return this.ratingNew;
    }
    
    public void setRatingNew(Byte ratingNew) {
        this.ratingNew = ratingNew;
    }
    public Double getConfidenceActual() {
        return this.confidenceActual;
    }
    
    public void setConfidenceActual(Double confidenceActual) {
        this.confidenceActual = confidenceActual;
    }
    public Double getConfidenceNew() {
        return this.confidenceNew;
    }
    
    public void setConfidenceNew(Double confidenceNew) {
        this.confidenceNew = confidenceNew;
    }




}


