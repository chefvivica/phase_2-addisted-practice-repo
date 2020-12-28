package com.entity;

public class ScreenSizes {
    private long ScreenId;
    private String size;
    
    public ScreenSizes() {
            
    }
    public ScreenSizes(String size) {
            this.ScreenId = 0;
            this.size = size;
    }
    
    public long getScreenId() {return this.ScreenId; }
    public String getSize() { return this.size;}
    public void setScreenId(long id) { this.ScreenId = id;}
    public void setSize(String size) { this.size = size;}

}
