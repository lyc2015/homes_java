package jp.co.lyc.cms.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import jp.co.lyc.cms.model.ModelClass;

@Mapper
public interface UtilsMapper {
	/**
	 * 国籍を取得
	 * 
	 * @return
	 */
	public List<ModelClass> getNationalitys();

	/**
	 * 場所
	 * 
	 * @return
	 */
	public List<ModelClass> getStation();

	/**
	 * 社員形式を取得
	 * 
	 * 
	 */
	public List<ModelClass> getStaffForms();

	/**
	 * 部署を取得
	 * 
	 * 
	 */
	public List<ModelClass> getDepartment();

	/**
	 * 仲介区分を取得
	 * 
	 * 
	 */
	public List<ModelClass> getHomesAgentCode();	

}