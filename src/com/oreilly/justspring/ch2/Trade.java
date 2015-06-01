package com.oreilly.justspring.ch2;


import java.io.Serializable;


public class Trade implements Serializable {
	private String componentName = "";

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentName() {
		return componentName;
	}
}