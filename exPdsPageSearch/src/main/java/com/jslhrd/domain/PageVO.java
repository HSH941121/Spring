package com.jslhrd.domain;

import lombok.Data;

@Data
public class PageVO {
	
	// ������ ó����
	private int startpage;
	private int endpage;
	
	//�˻���
	private String search;
	private String key;
}
