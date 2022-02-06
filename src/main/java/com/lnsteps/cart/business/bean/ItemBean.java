package com.lnsteps.cart.business.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data // bundles toString(), getters and setters
@Builder
public class ItemBean {
	private Long id;
	private String name;
	private Double price;
	private Integer quantity;
}
