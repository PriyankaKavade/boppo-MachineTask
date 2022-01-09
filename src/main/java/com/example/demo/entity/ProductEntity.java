package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;


@Entity
@Table(name = "PRODUCT_DTLS")
@Data
public class ProductEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "pcode")
	private Integer pcode;
	
	@Column(name = "pname")
	private String pname;
	
	@Column(name = "pprice")
	private Integer pprice;
	
	@Column(name = "pqty")
	private Integer pqty;
	
	@Column(name = "activeSw")
	private String activeSw;
	
	@Column(name = "CREATED_DATE")
	@CreationTimestamp
	private LocalDate currentDate;
	
	@Column(name = "UPDATED_DATE")
	@UpdateTimestamp
	private LocalDate updateDate;

}



