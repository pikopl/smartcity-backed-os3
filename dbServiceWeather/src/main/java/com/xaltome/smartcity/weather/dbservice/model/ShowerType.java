/**
 * 
 */
package com.xaltome.smartcity.weather.dbservice.model;

/**
 * @author kopajczy
 *
 */
public enum ShowerType {
	
	UNKNOWN(-1, "None"),
	NO_SHOWER(69, "Brak opadu"),
	OCCASIONAL_RAIN(70, "Opad przelotny"),
	CONSTANT_RAIN(71, "Opad ciągły"),
	HEAVY_RAIN(72, "Opad intensywny");
	
	private int code;
	
	private String description;

	/**
	 * @param value
	 */
	private ShowerType(int code, String description) {
		this.code = code;
		this.descripton = description;
	}

	public int getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
    public static ShowerType valueOf(int i){
    	for (ShowerType showerType : values()){
    		if (showerType.code == i){
    			return showerType;
    		}
    	}
    	throw new IllegalArgumentException("No matching constant for " + i);
    }
	
    public static ShowerType valueOf(String desc){
    	for (ShowerType showerType : values()){
    		if (showerType.descripton.equals(desc)){
    			return showerType;
    		}
    	}
    	throw new IllegalArgumentException("No matching constant for " + desc);
    }
}
