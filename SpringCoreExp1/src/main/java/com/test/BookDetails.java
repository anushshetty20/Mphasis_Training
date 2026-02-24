package com.test;

public class BookDetails {
	
	private int pages;
	
	private String publisher;
	
	private int pyear;

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPyear() {
		return pyear;
	}

	public void setPyear(int pyear) {
		this.pyear = pyear;
	}

	@Override
	public String toString() {
		return "BookDetails [pages=" + pages + ", publisher=" + publisher + ", pyear=" + pyear + "]";
	}
	
}
