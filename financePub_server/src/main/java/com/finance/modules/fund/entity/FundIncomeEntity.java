package com.finance.modules.fund.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2019-07-11 09:41:42
 */
@Data
@TableName("fund_income")
public class FundIncomeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type= IdType.AUTO)
	private Integer id;
	/**
	 * 
	 */
	private Integer fundTypeId;
	/**
	 * 
	 */
	private String fundTypeName;
	/**
	 * 
	 */
	private String content;
	/**
	 * 
	 */
	private BigDecimal money;
	/**
	 * 
	 */
	private Long sysUserId;
	/**
	 * 
	 */
	private String sysUserName;
	/**
	 * 
	 */
	private String address;
	/**
	 * 
	 */
	private String remark;
	/**
	 * 
	 */
	private String picUrl;
	/**
	 * 
	 */
	private Integer monthNum;

	private Integer yearNum;

	private Integer dayNum;

	private Date incomeTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 
	 */
	private Integer enabled;

}
