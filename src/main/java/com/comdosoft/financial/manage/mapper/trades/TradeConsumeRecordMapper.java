package com.comdosoft.financial.manage.mapper.trades;

import com.comdosoft.financial.manage.domain.trades.TradeConsumeRecord;
import java.util.List;

public interface TradeConsumeRecordMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_consume_records
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_consume_records
	 * @mbggenerated
	 */
	int insert(TradeConsumeRecord record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_consume_records
	 * @mbggenerated
	 */
	TradeConsumeRecord selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_consume_records
	 * @mbggenerated
	 */
	List<TradeConsumeRecord> selectAll();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table trade_consume_records
	 * @mbggenerated
	 */
	int updateByPrimaryKey(TradeConsumeRecord record);
}