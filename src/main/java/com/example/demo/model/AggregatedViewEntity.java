package com.example.demo.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name = "aggregated_view")
public class AggregatedViewEntity {

	@Id
	private String attribute;

	private double totalBudgetInLakhs;

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public double getTotalBudgetInLakhs() {
		return totalBudgetInLakhs;
	}

	public void setTotalBudgetInLakhs(double totalBudgetInLakhs) {
		this.totalBudgetInLakhs = totalBudgetInLakhs;
	}

}
