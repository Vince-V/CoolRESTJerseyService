package com.distributed;

public class MyBlock {
	
	private long time; 
	private int num; 
	private String priorHash;
	
	public MyBlock(long time, int num, String priorHash) 
    { 
        this.time = time; 
        this.num = num; 
        this.priorHash = priorHash; 
    }

}
