package com.jslhrd.domain;

import lombok.Data;

@Data
public class PdsVO {
	private int idx;
	private String name;
	private String pass;
	private String email;
	private String subject;
	private String contents;
	private int readcnt;
	private String regdate;
	private String filename;
}
