package com.jk.util;


public class PageUtil {
	
	//当前页
	private int page = 1;
	
	//每页条数
	private int rows = 3;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

}
