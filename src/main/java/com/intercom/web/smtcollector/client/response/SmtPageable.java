package com.intercom.web.smtcollector.client.response;

public class SmtPageable {

	private int page;
	private int size;
	private String sort;
	private static final int DEFAULT_PAGE = 0;
	private static final int DEFAULT_SIZE = 20;

	public SmtPageable(int page, int size, String sort) {
		this.page = page;
		this.size = size;
		this.sort = sort;
	}

	public SmtPageable(int page, int size) {
		this(page, size, null);
	}

	public SmtPageable(String sort) {
		this(DEFAULT_PAGE, DEFAULT_SIZE, sort);
	}

	public SmtPageable() {
		this(DEFAULT_PAGE, DEFAULT_SIZE, null);
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

}
