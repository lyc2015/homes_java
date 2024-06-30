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
import jp.co.lyc.cms.model.CustomerRegisterModel;
import jp.co.lyc.cms.model.ManagementCompanyModel;
import jp.co.lyc.cms.service.CustomerRegisterService;

@RestController
@RequestMapping("/employee")
public class CustomerRegisterController {

    @Autowired
    private CustomerRegisterService customerRegisterService;

    @PostMapping("/searchAllNationalityInfo")
    public List<CustomerRegisterModel> searchAllNationalityInfo() {
        // すべての国籍情報をreturn
        List<CustomerRegisterModel> allNationalityInfo = customerRegisterService.searchAllNationalityInfo();
        return allNationalityInfo;
    }

    @PostMapping("/searchAllVisaInfo")
    public List<CustomerRegisterModel> searchAllVisaType() {
        // すべてのビザを取得
        List<CustomerRegisterModel> allVisaType = customerRegisterService.searchAllVisaInfo();
        return allVisaType;
    }

    @PostMapping("/getAllCustomerBase")
    public List<CustomerRegisterModel> getAllCustomerBase() {
        // すべてのビザを取得
        List<CustomerRegisterModel> allCustomerBaseInfo = customerRegisterService.getAllCustomerBase();
        return allCustomerBaseInfo;
    }

    @PostMapping("/getAllStations")
    public List<CustomerRegisterModel> getAllStations() {
        // すべてのビザを取得
        List<CustomerRegisterModel> allStationsInfo = customerRegisterService.getStations();
        return allStationsInfo;
    }


    @PostMapping("/getMaxCustomerNo")
    public Map<String, Object> getMaxID() {
        Map<String, Object> resultMap = new HashMap<>();

        // 最大IDを検索 ID+1をreturn
        String maxID = customerRegisterService.getMaxNo();
        if (maxID == null) {
            resultMap.put("maxID", "C00001");
        } else {
            resultMap.put("maxID", maxID);
        }
        return resultMap;
    }

}
