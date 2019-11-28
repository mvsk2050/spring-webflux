package com.ex.springwebflux.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Orders {

	@Id
	private int orderId;
	
	@Column
	private String orderName;
}
