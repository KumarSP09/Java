package com.kumar;

import java.io.Serializable;

public abstract class BaseClass implements Cloneable, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4507136322510686149L;
	
	private String	BaseName;
	private String	BaseAddress;
	
	public String getBaseName() {
		return BaseName;
	}
	public void setBaseName(String baseName) {
		BaseName = baseName;
	}
	public String getBaseAddress() {
		return BaseAddress;
	}
	public void setBaseAddress(String baseAddress) {
		BaseAddress = baseAddress;
	}
	
}
