package jp.co.lyc.cms.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.co.lyc.cms.mapper.UtilsMapper;
import jp.co.lyc.cms.model.ModelClass;

@Component
public class UtilsService {
	@Autowired
	UtilsMapper utilsMapper;
	/**
	 * 国籍を取得
	 * 
	 * @return
	 */
	public List<ModelClass> getNationalitys() {
		List<ModelClass> list = utilsMapper.getNationalitys();
		return list;
	}

	/**
	 * 場所
	 * 
	 * @return
	 */
	public List<ModelClass> getStation() {
		return utilsMapper.getStation();
	}

	/**
	 * 社員形式を取得
	 * 
	 * @return
	 */
	public List<ModelClass> getStaffForms() {
		List<ModelClass> list = utilsMapper.getStaffForms();
		return list;
	}

	/**
	 * 部署を取得
	 * 
	 * @return
	 */
	public List<ModelClass> getDepartment() {
		List<ModelClass> list = utilsMapper.getDepartment();
		return list;
	}
	
	/**
	 * 仲介区分を取得
	 * 
	 * @return
	 */
	public List<ModelClass> getHomesAgentCode() {
		List<ModelClass> list = utilsMapper.getHomesAgentCode();
		return list;
	}
}