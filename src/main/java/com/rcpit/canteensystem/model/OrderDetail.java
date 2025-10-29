package com.rcpit.canteensystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderDetailId;

	@ManyToOne
	@JoinColumn(name = "order_id") // Foreign Key to the Order table
	private Order order;

	@ManyToOne
	@JoinColumn(name = "item_id") // Foreign Key to the MenuItem table
	private MenuItem menuItem;

	private int quantity;
	private double priceAtOrder;

	// Getters and Setters
	public long getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(long orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPriceAtOrder() {
		return priceAtOrder;
	}

	public void setPriceAtOrder(double priceAtOrder) {
		this.priceAtOrder = priceAtOrder;
	}
}