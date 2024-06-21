package jp.co.lyc.cms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.lyc.cms.common.BaseController;
import jp.co.lyc.cms.model.ManagementCompanyModel;
import jp.co.lyc.cms.service.ManagementCompanySerice;

@RestController
@RequestMapping("/employee")
public class ManagementCompanyController extends BaseController {

    @Autowired
    private ManagementCompanySerice managementCompanySerice;

    @PostMapping("/registerManagementCompany")
    public Map<String, Object> register(@RequestBody ManagementCompanyModel managementCompanyModel) {
        Map<String, Object> resultMap = new HashMap<>();

        // 插入数据到数据库
        boolean result = managementCompanySerice.registerManagementCompany(managementCompanyModel);
        resultMap.put("result", result);
        return resultMap;
    }

    @PostMapping("/searchManagementCompanyID")
    public Map<String, Object> searchMaxID() {
        Map<String, Object> resultMap = new HashMap<>();

        // 最大管理会社IDを検索 ID+1をreturn
        String maxID = managementCompanySerice.searchMaxManagementCompanyID();
        if (maxID == null) {
            resultMap.put("maxID", "M0001");
        } else {
            resultMap.put("maxID", maxID);
        }
        return resultMap;
    }

    @PostMapping("/searchAllManagementCompanyInfo")
    public List<ManagementCompanyModel> searchAllIdName() {
        // Map<String, Object> resultMap = new HashMap<>();

        // すべての管理会社情報をreturn
        List<ManagementCompanyModel> allManagementCompanyInfo = managementCompanySerice.searchAllManagementCompanyInfo();
        return allManagementCompanyInfo;
    }


    @PostMapping("/getManagementCompanyInfoByID")
    public List<ManagementCompanyModel> getCompanyInfoByID(@RequestBody ManagementCompanyModel managementCompanyModel) {

        // すべての管理会社情報をreturn
        List<ManagementCompanyModel> allManagementCompanyInfo = managementCompanySerice.getManagementCompanyInfoByID(managementCompanyModel);
        return allManagementCompanyInfo;
    }

    @PostMapping("/updateManagementCompanyInfo")
    public Map<String, Object>  update(@RequestBody ManagementCompanyModel managementCompanyModel) {
        Map<String, Object> resultMap = new HashMap<>();

        // 插入数据到数据库
        int updateResult = managementCompanySerice.updateCompanyInfo(managementCompanyModel);
        resultMap.put("result", updateResult);
        return resultMap;
    }



}
