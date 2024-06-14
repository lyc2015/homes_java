package jp.co.lyc.cms.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.lyc.cms.model.EmployeeModel;
import jp.co.lyc.cms.model.EmployeeNameModel;
import jp.co.lyc.cms.model.InfoModelClass;
import org.apache.ibatis.annotations.Mapper;

import jp.co.lyc.cms.model.ModelClass;

@Mapper
public interface UtilsMapper {
	/**
	 * 国籍を取得
	 * 
	 * 
	 */
	public List<ModelClass> getNationalitys();

	/**
	 * 担当者を取得
	 *
	 *
	 */
	public List<InfoModelClass> getEmployeeInfo();

	/**
	 * 仲介手数料を取得
	 *
	 *
	 */
	public List<InfoModelClass> getcommissionAdCode();

	/**
	 * 契約者を取得
	 *
	 *
	 */
	public List<InfoModelClass> getCustomers();
	/**
	 * 契約者を取得
	 *
	 *
	 */
	public List<InfoModelClass> getCompany();
}