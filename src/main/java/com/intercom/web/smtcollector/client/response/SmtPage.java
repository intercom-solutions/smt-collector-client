package com.intercom.web.smtcollector.client.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.Validate;

public class SmtPage {

	private int size;
	private int totalElements;
	private int totalPages;
	private int number;

	@JsonProperty(value = "size")
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@JsonProperty(value = "totalElements")
	public int getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	@JsonProperty(value = "totalPages")
	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	@JsonProperty(value = "number")
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@JsonIgnore
	public boolean hasPrevious() {
		return (number > 0);
	}

	@JsonIgnore
	public boolean hasNext() {
		return (number < (totalPages - 1));
	}

	@JsonIgnore
	public int getPrevious() {
		Validate.validState(hasPrevious(), "No previous page");
		return (number - 1);
	}

	@JsonIgnore
	public int getNext() {
		Validate.validState(hasNext(), "No next page");
		return (number + 1);
	}

	@JsonIgnore
	public boolean isFirst() {
		return (number == 0);
	}

	@JsonIgnore
	public boolean isLast() {
		return (number == (totalPages - 1));
	}

}
