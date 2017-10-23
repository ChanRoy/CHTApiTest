package com.cht;

import java.util.List;

public class ListObject extends AbstractJsonObject {

	// 列表对象
	private List<?> items;
	
	public List<?> getItesm() {
		
		return items;
	}
	
	public void setItems(List<?> items) {
		
		this.items = items;
	}
	
	
}
