package com.comdosoft.financial.timing.domain.zhangfu;

import java.util.Date;
import java.util.List;

public class OpeningApplie {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.apply_customer_id
	 * @mbggenerated
	 */
	private Integer applyCustomerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.preliminary_verify_user_id
	 * @mbggenerated
	 */
	private Integer preliminaryVerifyUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.terminal_id
	 * @mbggenerated
	 */
	private Integer terminalId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.status
	 * @mbggenerated
	 */
	private Byte status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.created_at
	 * @mbggenerated
	 */
	private Date createdAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.updated_at
	 * @mbggenerated
	 */
	private Date updatedAt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.types
	 * @mbggenerated
	 */
	private Integer types;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.merchant_id
	 * @mbggenerated
	 */
	private Integer merchantId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.merchant_name
	 * @mbggenerated
	 */
	private String merchantName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.sex
	 * @mbggenerated
	 */
	private Integer sex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.birthday
	 * @mbggenerated
	 */
	private Date birthday;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.card_id
	 * @mbggenerated
	 */
	private String cardId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.phone
	 * @mbggenerated
	 */
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.email
	 * @mbggenerated
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.city_id
	 * @mbggenerated
	 */
	private Integer cityId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.name
	 * @mbggenerated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.pay_channel_id
	 * @mbggenerated
	 */
	private Integer payChannelId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.account_bank_num
	 * @mbggenerated
	 */
	private String accountBankNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.account_bank_name
	 * @mbggenerated
	 */
	private String accountBankName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.account_bank_code
	 * @mbggenerated
	 */
	private String accountBankCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.tax_registered_no
	 * @mbggenerated
	 */
	private String taxRegisteredNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.organization_code_no
	 * @mbggenerated
	 */
	private String organizationCodeNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.billing_cyde_id
	 * @mbggenerated
	 */
	private Integer billingCydeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.activate_status
	 * @mbggenerated
	 */
	private Integer activateStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.apply_status
	 * @mbggenerated
	 */
	private String applyStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column opening_applies.submit_status
	 * @mbggenerated
	 */
	private Integer submitStatus;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.id
	 * @return  the value of opening_applies.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.id
	 * @param id  the value for opening_applies.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.apply_customer_id
	 * @return  the value of opening_applies.apply_customer_id
	 * @mbggenerated
	 */
	public Integer getApplyCustomerId() {
		return applyCustomerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.apply_customer_id
	 * @param applyCustomerId  the value for opening_applies.apply_customer_id
	 * @mbggenerated
	 */
	public void setApplyCustomerId(Integer applyCustomerId) {
		this.applyCustomerId = applyCustomerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.preliminary_verify_user_id
	 * @return  the value of opening_applies.preliminary_verify_user_id
	 * @mbggenerated
	 */
	public Integer getPreliminaryVerifyUserId() {
		return preliminaryVerifyUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.preliminary_verify_user_id
	 * @param preliminaryVerifyUserId  the value for opening_applies.preliminary_verify_user_id
	 * @mbggenerated
	 */
	public void setPreliminaryVerifyUserId(Integer preliminaryVerifyUserId) {
		this.preliminaryVerifyUserId = preliminaryVerifyUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.terminal_id
	 * @return  the value of opening_applies.terminal_id
	 * @mbggenerated
	 */
	public Integer getTerminalId() {
		return terminalId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.terminal_id
	 * @param terminalId  the value for opening_applies.terminal_id
	 * @mbggenerated
	 */
	public void setTerminalId(Integer terminalId) {
		this.terminalId = terminalId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.status
	 * @return  the value of opening_applies.status
	 * @mbggenerated
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.status
	 * @param status  the value for opening_applies.status
	 * @mbggenerated
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.created_at
	 * @return  the value of opening_applies.created_at
	 * @mbggenerated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.created_at
	 * @param createdAt  the value for opening_applies.created_at
	 * @mbggenerated
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.updated_at
	 * @return  the value of opening_applies.updated_at
	 * @mbggenerated
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.updated_at
	 * @param updatedAt  the value for opening_applies.updated_at
	 * @mbggenerated
	 */
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.types
	 * @return  the value of opening_applies.types
	 * @mbggenerated
	 */
	public Integer getTypes() {
		return types;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.types
	 * @param types  the value for opening_applies.types
	 * @mbggenerated
	 */
	public void setTypes(Integer types) {
		this.types = types;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.merchant_id
	 * @return  the value of opening_applies.merchant_id
	 * @mbggenerated
	 */
	public Integer getMerchantId() {
		return merchantId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.merchant_id
	 * @param merchantId  the value for opening_applies.merchant_id
	 * @mbggenerated
	 */
	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.merchant_name
	 * @return  the value of opening_applies.merchant_name
	 * @mbggenerated
	 */
	public String getMerchantName() {
		return merchantName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.merchant_name
	 * @param merchantName  the value for opening_applies.merchant_name
	 * @mbggenerated
	 */
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.sex
	 * @return  the value of opening_applies.sex
	 * @mbggenerated
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.sex
	 * @param sex  the value for opening_applies.sex
	 * @mbggenerated
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.birthday
	 * @return  the value of opening_applies.birthday
	 * @mbggenerated
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.birthday
	 * @param birthday  the value for opening_applies.birthday
	 * @mbggenerated
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.card_id
	 * @return  the value of opening_applies.card_id
	 * @mbggenerated
	 */
	public String getCardId() {
		return cardId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.card_id
	 * @param cardId  the value for opening_applies.card_id
	 * @mbggenerated
	 */
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.phone
	 * @return  the value of opening_applies.phone
	 * @mbggenerated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.phone
	 * @param phone  the value for opening_applies.phone
	 * @mbggenerated
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.email
	 * @return  the value of opening_applies.email
	 * @mbggenerated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.email
	 * @param email  the value for opening_applies.email
	 * @mbggenerated
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.city_id
	 * @return  the value of opening_applies.city_id
	 * @mbggenerated
	 */
	public Integer getCityId() {
		return cityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.city_id
	 * @param cityId  the value for opening_applies.city_id
	 * @mbggenerated
	 */
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.name
	 * @return  the value of opening_applies.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.name
	 * @param name  the value for opening_applies.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.pay_channel_id
	 * @return  the value of opening_applies.pay_channel_id
	 * @mbggenerated
	 */
	public Integer getPayChannelId() {
		return payChannelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.pay_channel_id
	 * @param payChannelId  the value for opening_applies.pay_channel_id
	 * @mbggenerated
	 */
	public void setPayChannelId(Integer payChannelId) {
		this.payChannelId = payChannelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.account_bank_num
	 * @return  the value of opening_applies.account_bank_num
	 * @mbggenerated
	 */
	public String getAccountBankNum() {
		return accountBankNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.account_bank_num
	 * @param accountBankNum  the value for opening_applies.account_bank_num
	 * @mbggenerated
	 */
	public void setAccountBankNum(String accountBankNum) {
		this.accountBankNum = accountBankNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.account_bank_name
	 * @return  the value of opening_applies.account_bank_name
	 * @mbggenerated
	 */
	public String getAccountBankName() {
		return accountBankName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.account_bank_name
	 * @param accountBankName  the value for opening_applies.account_bank_name
	 * @mbggenerated
	 */
	public void setAccountBankName(String accountBankName) {
		this.accountBankName = accountBankName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.account_bank_code
	 * @return  the value of opening_applies.account_bank_code
	 * @mbggenerated
	 */
	public String getAccountBankCode() {
		return accountBankCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.account_bank_code
	 * @param accountBankCode  the value for opening_applies.account_bank_code
	 * @mbggenerated
	 */
	public void setAccountBankCode(String accountBankCode) {
		this.accountBankCode = accountBankCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.tax_registered_no
	 * @return  the value of opening_applies.tax_registered_no
	 * @mbggenerated
	 */
	public String getTaxRegisteredNo() {
		return taxRegisteredNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.tax_registered_no
	 * @param taxRegisteredNo  the value for opening_applies.tax_registered_no
	 * @mbggenerated
	 */
	public void setTaxRegisteredNo(String taxRegisteredNo) {
		this.taxRegisteredNo = taxRegisteredNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.organization_code_no
	 * @return  the value of opening_applies.organization_code_no
	 * @mbggenerated
	 */
	public String getOrganizationCodeNo() {
		return organizationCodeNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.organization_code_no
	 * @param organizationCodeNo  the value for opening_applies.organization_code_no
	 * @mbggenerated
	 */
	public void setOrganizationCodeNo(String organizationCodeNo) {
		this.organizationCodeNo = organizationCodeNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.billing_cyde_id
	 * @return  the value of opening_applies.billing_cyde_id
	 * @mbggenerated
	 */
	public Integer getBillingCydeId() {
		return billingCydeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.billing_cyde_id
	 * @param billingCydeId  the value for opening_applies.billing_cyde_id
	 * @mbggenerated
	 */
	public void setBillingCydeId(Integer billingCydeId) {
		this.billingCydeId = billingCydeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.activate_status
	 * @return  the value of opening_applies.activate_status
	 * @mbggenerated
	 */
	public Integer getActivateStatus() {
		return activateStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.activate_status
	 * @param activateStatus  the value for opening_applies.activate_status
	 * @mbggenerated
	 */
	public void setActivateStatus(Integer activateStatus) {
		this.activateStatus = activateStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.apply_status
	 * @return  the value of opening_applies.apply_status
	 * @mbggenerated
	 */
	public String getApplyStatus() {
		return applyStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.apply_status
	 * @param applyStatus  the value for opening_applies.apply_status
	 * @mbggenerated
	 */
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column opening_applies.submit_status
	 * @return  the value of opening_applies.submit_status
	 * @mbggenerated
	 */
	public Integer getSubmitStatus() {
		return submitStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column opening_applies.submit_status
	 * @param submitStatus  the value for opening_applies.submit_status
	 * @mbggenerated
	 */
	public void setSubmitStatus(Integer submitStatus) {
		this.submitStatus = submitStatus;
	}

	private List<TerminalOpeningInfo> terminalOpeningInfos;
	private Merchant merchant;

    public List<TerminalOpeningInfo> getTerminalOpeningInfos() {
        return terminalOpeningInfos;
    }

    public void setTerminalOpeningInfos(List<TerminalOpeningInfo> terminalOpeningInfos) {
        this.terminalOpeningInfos = terminalOpeningInfos;
    }

    public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public static final  Integer TYPE_PUBLIC = 1;
    public static final  Integer TYPE_PRIVATE = 2;

    public static final byte STATUS_WAITING_FIRST_CHECK = 1;	// 待初次预审
    public static final byte STATUS_FIRST_CHECK_FAIL = 2;    //待初预审不通过
    public static final byte STATUS_SECOND_CHECKING = 3;	  // 二次预审中
    public static final byte STATUS_SECOND_CHECK_FAIL = 4;	// 二次预审不通过
    public static final byte STATUS_WAITING_CHECKE = 5;				// 待审核
    public static final byte STATUS_CHECKING = 6;			// 审核中
    public static final byte STATUS_CHECK_FAIL = 7;    //审核失败
    public static final byte STATUS_CHECK_SUCCESS = 8;    //审核成功
    public static final byte STATUS_CANCEL = 9;				// 已取消
    
    
    public static final int ACTIVATE_STATUS_NO_ACTIVED = 0;  //未激活
    public static final int ACTIVATE_STATUS_NO_REGISTED = 1; //激活未注册
    public static final int ACTIVATE_STATUS_REGISTED = 2;  //已注册
}