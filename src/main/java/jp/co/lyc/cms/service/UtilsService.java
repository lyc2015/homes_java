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
}