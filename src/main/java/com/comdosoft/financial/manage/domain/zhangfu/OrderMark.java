package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class OrderMark {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_marks.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_marks.order_id
	 * @mbggenerated
	 */
	private Integer orderId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_marks.customer_id
	 * @mbggenerated
	 */
	private Integer customerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_marks.created_at
	 * @mbggenerated
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_marks.content
	 * @mbggenerated
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_marks.id
	 * @return  the value of order_marks.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_marks.id
	 * @param id  the value for order_marks.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_marks.order_id
	 * @return  the value of order_marks.order_id
	 * @mbggenerated
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_marks.order_id
	 * @param orderId  the value for order_marks.order_id
	 * @mbggenerated
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_marks.customer_id
	 * @return  the value of order_marks.customer_id
	 * @mbggenerated
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_marks.customer_id
	 * @param customerId  the value for order_marks.customer_id
	 * @mbggenerated
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_marks.created_at
	 * @return  the value of order_marks.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_marks.created_at
	 * @param createdAt  the value for order_marks.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_marks.content
	 * @return  the value of order_marks.content
	 * @mbggenerated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_marks.content
	 * @param content  the value for order_marks.content
	 * @mbggenerated
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}