package com.tyss.ecommercerest.bean;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@JsonRootName("response")
@JsonPropertyOrder({"status", "message"})
@XmlRootElement(name = "response")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FlipcartResponse implements Serializable{

	@JsonProperty("status")
	@XmlElement(name = "status-code")
	private int statusCode;
	
	
	private String message;
	
	@JsonProperty("item_info")
	@XmlElement(name = "item-info")
	private Item item;
	
	private List<Item> itemList;
	
}
