package com.yedam.java.book.service;

import java.util.Date;

import lombok.Data;

@Data
public class BookVO {
	private int bookNo;
	private String bookName;
	private String bookCoverimg;
	// 기본 : yyyy/MM/dd
	private Date bookDate;
	private int bookPrice;
	private String bookPublisher;
	private String bookInfo;
	
	public void setBookPrice(Integer bookPrice) {
		if(bookPrice == null) {
			this.bookPrice=0;
		}else{
			this.bookPrice = bookPrice;
		}
	}
}
