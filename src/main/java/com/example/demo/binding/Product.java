package com.example.demo.binding;

import java.time.LocalDate;

import lombok.Data;


@Data
public class Product {
	
	private Integer pcode;
	
	private String pname;
	
	private Integer pprice;
	
	private Integer pqty;
	
	private String activeSw;
	
	private LocalDate currentDate;
	
	private LocalDate updateDate;

	


}
