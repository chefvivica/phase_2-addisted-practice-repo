package com.entity;

public class Os {
	private long OsId;
    private String name;
    
    public Os() {
            
    }
    public Os(String name) {
            this.OsId = 0;
            this.name = name;
    }
    
    public long getOsId() {return this.OsId; }
    public String getName() { return this.name;}
    public void setOsId(long id) { this.OsId = id;}
    public void setName(String name) { this.name= name;}

}
