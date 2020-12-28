package com.entity;

public class Color {
    private long colorId;
    private String name;
    
    public Color() {
            
    }
    public Color(String name) {
            this.colorId = 0;
            this.name = name;
    }
    
    public long getCOLORID() {return this.colorId; }
    public String getName() { return this.name;}
    public void setCOLORID(long id) { this.colorId = id;}
    public void setName(String name) { this.name = name;}

}
