package igami2.DataBase.hibernateconfig;
// Generated Jul 17, 2013 10:33:09 PM by Hibernate Tools 3.2.1.GA



/**
 * CbmInitial generated by hbm2java
 */
public class CbmInitial  implements java.io.Serializable {


     private CbmInitialId id;
     private String chosenff;
     private String regionsubbasinid;
     private String chosenbmp;
     private String assignments;
     private Double f0;
     private Double f1;
     private Double f2;
     private Double f3;
     private Double f4;
     private Double f5;

    public CbmInitial() {
    }

	
    public CbmInitial(CbmInitialId id) {
        this.id = id;
    }
    public CbmInitial(CbmInitialId id, String chosenff, String regionsubbasinid, String chosenbmp, String assignments, Double f0, Double f1, Double f2, Double f3, Double f4, Double f5) {
       this.id = id;
       this.chosenff = chosenff;
       this.regionsubbasinid = regionsubbasinid;
       this.chosenbmp = chosenbmp;
       this.assignments = assignments;
       this.f0 = f0;
       this.f1 = f1;
       this.f2 = f2;
       this.f3 = f3;
       this.f4 = f4;
       this.f5 = f5;
    }
   
    public CbmInitialId getId() {
        return this.id;
    }
    
    public void setId(CbmInitialId id) {
        this.id = id;
    }
    public String getChosenff() {
        return this.chosenff;
    }
    
    public void setChosenff(String chosenff) {
        this.chosenff = chosenff;
    }
    public String getRegionsubbasinid() {
        return this.regionsubbasinid;
    }
    
    public void setRegionsubbasinid(String regionsubbasinid) {
        this.regionsubbasinid = regionsubbasinid;
    }
    public String getChosenbmp() {
        return this.chosenbmp;
    }
    
    public void setChosenbmp(String chosenbmp) {
        this.chosenbmp = chosenbmp;
    }
    public String getAssignments() {
        return this.assignments;
    }
    
    public void setAssignments(String assignments) {
        this.assignments = assignments;
    }
    public Double getF0() {
        return this.f0;
    }
    
    public void setF0(Double f0) {
        this.f0 = f0;
    }
    public Double getF1() {
        return this.f1;
    }
    
    public void setF1(Double f1) {
        this.f1 = f1;
    }
    public Double getF2() {
        return this.f2;
    }
    
    public void setF2(Double f2) {
        this.f2 = f2;
    }
    public Double getF3() {
        return this.f3;
    }
    
    public void setF3(Double f3) {
        this.f3 = f3;
    }
    public Double getF4() {
        return this.f4;
    }
    
    public void setF4(Double f4) {
        this.f4 = f4;
    }
    public Double getF5() {
        return this.f5;
    }
    
    public void setF5(Double f5) {
        this.f5 = f5;
    }




}

