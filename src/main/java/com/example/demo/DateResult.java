package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DateResult
{
	private String date;

	@JsonProperty("milliseconds_since_epoch")
	private String millisecondsSinceEpoch;
	private String time;
}
