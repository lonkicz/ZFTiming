package com.comdosoft.financial.manage.mapper.zhangfu;

import com.comdosoft.financial.manage.domain.zhangfu.OperateRecord;
import java.util.List;

public interface OperateRecordMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table operate_records
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table operate_records
	 * @mbggenerated
	 */
	int insert(OperateRecord record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table operate_records
	 * @mbggenerated
	 */
	OperateRecord selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table operate_records
	 * @mbggenerated
	 */
	List<OperateRecord> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table operate_records
	 * @mbggenerated
	 */
	int updateByPrimaryKey(OperateRecord record);
}