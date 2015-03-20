package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class DictionaryBillingCycle {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dictionary_billing_cycles.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dictionary_billing_cycles.name
	 * @mbggenerated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dictionary_billing_cycles.description
	 * @mbggenerated
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dictionary_billing_cycles.created_at
	 * @mbggenerated
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dictionary_billing_cycles.updated_at
	 * @mbggenerated
	 */
	private Date updatedAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column dictionary_billing_cycles.service_rate
	 * @mbggenerated
	 */
	private Integer serviceRate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dictionary_billing_cycles.id
	 * @return  the value of dictionary_billing_cycles.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dictionary_billing_cycles.id
	 * @param id  the value for dictionary_billing_cycles.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dictionary_billing_cycles.name
	 * @return  the value of dictionary_billing_cycles.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dictionary_billing_cycles.name
	 * @param name  the value for dictionary_billing_cycles.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dictionary_billing_cycles.description
	 * @return  the value of dictionary_billing_cycles.description
	 * @mbggenerated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dictionary_billing_cycles.description
	 * @param description  the value for dictionary_billing_cycles.description
	 * @mbggenerated
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dictionary_billing_cycles.created_at
	 * @return  the value of dictionary_billing_cycles.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dictionary_billing_cycles.created_at
	 * @param createdAt  the value for dictionary_billing_cycles.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dictionary_billing_cycles.updated_at
	 * @return  the value of dictionary_billing_cycles.updated_at
	 * @mbggenerated
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dictionary_billing_cycles.updated_at
	 * @param updatedAt  the value for dictionary_billing_cycles.updated_at
	 * @mbggenerated
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column dictionary_billing_cycles.service_rate
	 * @return  the value of dictionary_billing_cycles.service_rate
	 * @mbggenerated
	 */
	public Integer getServiceRate() {
		return serviceRate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column dictionary_billing_cycles.service_rate
	 * @param serviceRate  the value for dictionary_billing_cycles.service_rate
	 * @mbggenerated
	 */
	public void setServiceRate(Integer serviceRate) {
		this.serviceRate = serviceRate;
	}
}