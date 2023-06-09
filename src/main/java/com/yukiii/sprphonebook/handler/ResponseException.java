package com.yukiii.sprphonebook.handler;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ResponseException {

	private Date timestamp;
	private String message;
	private String error;
}
