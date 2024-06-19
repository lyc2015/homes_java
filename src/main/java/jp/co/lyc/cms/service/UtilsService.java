package jp.co.lyc.cms.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.lyc.cms.model.InfoModelClass;
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
	 * 売上登録の基本情報を取得
	 *
	 * @return
	 */
	public Map<String, Object> getSalesBaseInfo() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<InfoModelClass> commissionAdCode = utilsMapper.getcommissionAdCode();
		List<Object> adCodeList = new ArrayList<Object>();
		for (InfoModelClass modelClass : commissionAdCode) {
			Map<String, Object> empMode = new HashMap<String, Object>();
			empMode.put("value", modelClass.getId());
			empMode.put("label", modelClass.getBrokerageFeeName());
			adCodeList.add(empMode);
		}
		List<InfoModelClass> list = utilsMapper.getEmployeeInfo();
		List<Object> employeeList = getInfoMap(list);
		List<InfoModelClass> cuslist = utilsMapper.getCustomers();
		List<Object> customerList = getInfoMap(cuslist);
		List<InfoModelClass> comList = utilsMapper.getCompany();
		List<Object> company = new ArrayList<Object>();
		for (InfoModelClass modelClass : comList) {
			Map<String, Object> empMode = new HashMap<String, Object>();
			empMode.put("value", modelClass.getId());
			empMode.put("label", modelClass.getFirstName());
			company.add(empMode);
		}

		List<InfoModelClass> InstList = utilsMapper.getInstitutionInfo();
		List<Object> institutionInfo = new ArrayList<Object>();
		for (InfoModelClass modelClass : InstList) {
			Map<String, Object> empMode = new HashMap<String, Object>();
			empMode.put("value", modelClass.getId());
			empMode.put("label", modelClass.getFirstName());
			institutionInfo.add(empMode);
		}

		List<InfoModelClass> vList = utilsMapper.getVisa();
		List<Object> visaList = new ArrayList<Object>();
		for (InfoModelClass modelClass : vList) {
			Map<String, Object> empMode = new HashMap<String, Object>();
			empMode.put("value", modelClass.getId());
			empMode.put("label", modelClass.getFirstName());
			visaList.add(empMode);
		}

		resultMap.put("employeeList",employeeList);
		resultMap.put("adCodeList", adCodeList);
		resultMap.put("customerList",customerList);
		resultMap.put("company",company);
		resultMap.put("institutionInfo",institutionInfo);
		resultMap.put("visaList",visaList);
		return resultMap;
	}
	public List<Object> getInfoMap(List<InfoModelClass> list) {

		List<Object> newList = new ArrayList<Object>();
		for(InfoModelClass modelClass : list) {
			Map<String, Object> empMode = new HashMap<String, Object>();
			empMode.put("id", modelClass.getId());
			empMode.put("firstName", modelClass.getId());
			empMode.put("lastName", modelClass.getLastName());
			newList.add(empMode);
		}

		return newList;
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