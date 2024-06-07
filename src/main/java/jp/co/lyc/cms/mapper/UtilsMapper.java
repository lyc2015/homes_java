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
	 * 
	 */
	public List<ModelClass> getNationalitys();

}