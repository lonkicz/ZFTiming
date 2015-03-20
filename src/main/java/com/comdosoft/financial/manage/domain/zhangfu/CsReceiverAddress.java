package com.comdosoft.financial.manage.domain.zhangfu;

import java.util.Date;

public class CsReceiverAddress {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cs_receiver_addresses.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cs_receiver_addresses.address
	 * @mbggenerated
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cs_receiver_addresses.phone
	 * @mbggenerated
	 */
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cs_receiver_addresses.zip_code
	 * @mbggenerated
	 */
	private String zipCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cs_receiver_addresses.receiver
	 * @mbggenerated
	 */
	private String receiver;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column cs_receiver_addresses.created_at
	 * @mbggenerated
	 */
	private Date createdAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cs_receiver_addresses.id
	 * @return  the value of cs_receiver_addresses.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cs_receiver_addresses.id
	 * @param id  the value for cs_receiver_addresses.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cs_receiver_addresses.address
	 * @return  the value of cs_receiver_addresses.address
	 * @mbggenerated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cs_receiver_addresses.address
	 * @param address  the value for cs_receiver_addresses.address
	 * @mbggenerated
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cs_receiver_addresses.phone
	 * @return  the value of cs_receiver_addresses.phone
	 * @mbggenerated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cs_receiver_addresses.phone
	 * @param phone  the value for cs_receiver_addresses.phone
	 * @mbggenerated
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cs_receiver_addresses.zip_code
	 * @return  the value of cs_receiver_addresses.zip_code
	 * @mbggenerated
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cs_receiver_addresses.zip_code
	 * @param zipCode  the value for cs_receiver_addresses.zip_code
	 * @mbggenerated
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cs_receiver_addresses.receiver
	 * @return  the value of cs_receiver_addresses.receiver
	 * @mbggenerated
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cs_receiver_addresses.receiver
	 * @param receiver  the value for cs_receiver_addresses.receiver
	 * @mbggenerated
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column cs_receiver_addresses.created_at
	 * @return  the value of cs_receiver_addresses.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column cs_receiver_addresses.created_at
	 * @param createdAt  the value for cs_receiver_addresses.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}