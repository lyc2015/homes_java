package jp.co.lyc.cms.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jp.co.lyc.cms.common.BaseController;
import jp.co.lyc.cms.model.SalesModel;
import jp.co.lyc.cms.service.SalesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sales")
public class SalesInfoController extends BaseController {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SalesInfoService salesService;

    @PostMapping("/insertSales")
    public Map<String, Object> insertSales(@RequestBody SalesModel emp) {
        Map<String, Object> resultMap = new HashMap<>();

        // 验证输入数据
        // String errorsMessage = validateSales(emp);
        // if (!errorsMessage.isEmpty()) {
        //     resultMap.put("errorsMessage", errorsMessage);
        //     return resultMap;
        // }

        // 插入数据到数据库
        boolean result = salesService.insertSalesInfo(emp);
        resultMap.put("result", result);
        return resultMap;
    }

//    private String validateSales(SalesModel emp) {
//        StringBuilder errorsMessage = new StringBuilder();
//
//        if (emp.getNationalityCode() == null) {
//            errorsMessage.append("国籍を入力してください。");
//        }
//        if (emp.getIntoCompanyYearAndMonth() == null || emp.getIntoCompanyYearAndMonth().isEmpty()) {
//            errorsMessage.append("入社年月を入力してください。");
//        }
//        if (emp.getGenderStatus() == null || emp.getGenderStatus().isEmpty()) {
//            errorsMessage.append("性別を入力してください。");
//        }
//        if (emp.getAlphabetName() == null || emp.getAlphabetName().isEmpty()) {
//            errorsMessage.append("ローマ字を入力してください。");
//        // }
//        // if (emp.getSalesFirstName() == null || emp.getSalesFirstName().isEmpty()
//        //         || emp.getSalesLastName() == null || emp.getSalesLastName().isEmpty()) {
//        //     errorsMessage.append("社員名を入力してください。");
//        }
//
//        return errorsMessage.toString();
//    }

    @GetMapping("/getSales")
    @ResponseBody
    public List<SalesModel> getSales() {
        logger.info("National: 売上情報読み取り開始");
        return salesService.getSalesInfo();
    }

    @GetMapping("/getSalesId")
    @ResponseBody
    public Map<String, Object>  getSalesId() {
        logger.info("National: salesId読み取り開始");
        Map<String, Object> resultMap = new HashMap<>();
        // 插入数据到数据库
        String result = salesService.getSalesId();
        resultMap.put("result", "success");
        resultMap.put("nextId", result);

        return resultMap;
    }



}