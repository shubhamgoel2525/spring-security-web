package com.example.securityweb.models;

public class HelloResponse {
	private String response;
	private String responseBy;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getResponseBy() {
		return responseBy;
	}

	public void setResponseBy(String responseBy) {
		this.responseBy = responseBy;
	}

	public HelloResponse(String response, String responseBy) {
		super();
		this.response = response;
		this.responseBy = responseBy;
	}
}
