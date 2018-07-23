package com.ij;

import java.beans.PropertyEditorSupport;

public class studentEditor extends PropertyEditorSupport{
	@Override
	public void setAsText(String name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
		if(name.isEmpty()|| name==null|| name.matches("1-9")){
			name="java Boss is comming"+name;
			setValue(name);
			
		}
		else{
			setValue(name);
		}
		if(name.contains("mr.")|| name.contains("mrs.")){
		setValue(name);


	}
	else {
		name="mrs."+name;
		setValue(name);
	}

	}
	
	

}
