package com.bin.spring.beans.cllection;


public class DataSource {
	private java.util.Properties properties ;

	public java.util.Properties getProperties() {
		return properties;
	}

	public void setProperties(java.util.Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "DataSource [properties=" + properties + "]";
	}
	
	
}
