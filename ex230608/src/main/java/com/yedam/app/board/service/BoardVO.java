package com.yedam.app.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {
	private int bno;
	private String title;
	private String contents;
	private String writer;
	@DateTimeFormat(pattern="yyyy-MM-dd")	
	private Date regdate;	// java.util.date  :  yyyy/mm/dd  | input태그  :  yyyy-mm-dd
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedate;
	private String image;
}
