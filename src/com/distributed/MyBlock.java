package com.distributed;

import javax.xml.bind.DatatypeConverter;
import java.util.*;
import java.security.*;

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
	
	public String getStringOfBlock(){
		
		String theBlock = "";
		
		
		return "";
	}
	
	
	public boolean validate(String block){
		
		return true;
	}
    
	public ArrayList<String> getDataAboutTransations(String transAddr) {
		ArrayList<String> dataAndAdrresses = new ArrayList();	
		
		return dataAndAdrresses;
		
	}
}
