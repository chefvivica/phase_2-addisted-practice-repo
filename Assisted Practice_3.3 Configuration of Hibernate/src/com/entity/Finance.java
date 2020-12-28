package com.entity;

public class Finance {

    private long FinanceId;
    private String name;
    private String ftype;
    
    public Finance() {
            
    }
    public Finance(String name, String ftype) {
            this.FinanceId = 0;
            this.name = name;
            this.ftype = ftype;
    }
    
    public long getFinanceId() {return this.FinanceId; }
    public String getName() { return this.name;}
    public String getFtype() { return this.ftype;}
    public void setFinanceId(long id) { this.FinanceId = id;}
    public void setName(String name) { this.name = name;}
    public void setFtype(String ftype) { this.ftype= ftype;}

	
}
