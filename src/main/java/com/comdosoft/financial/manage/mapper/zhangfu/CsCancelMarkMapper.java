package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.CsCancelMark;
import java.util.List;

public interface CsCancelMarkMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_cancel_marks
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_cancel_marks
	 * @mbggenerated
	 */
	int insert(CsCancelMark record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_cancel_marks
	 * @mbggenerated
	 */
	CsCancelMark selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_cancel_marks
	 * @mbggenerated
	 */
	List<CsCancelMark> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cs_cancel_marks
	 * @mbggenerated
	 */
	int updateByPrimaryKey(CsCancelMark record);
}