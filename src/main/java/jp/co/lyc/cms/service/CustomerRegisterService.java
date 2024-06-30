package jp.co.lyc.cms.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import jp.co.lyc.cms.mapper.CustomerRegisterMapper;
import jp.co.lyc.cms.model.CustomerRegisterModel;

@Component
public class CustomerRegisterService {

    @Autowired
    CustomerRegisterMapper customerRegisterMapper;

    // 国籍List
    @Transactional(rollbackFor = Exception.class)
    public List<CustomerRegisterModel> searchAllNationalityInfo() {
        try {
            List<CustomerRegisterModel> getAllInfo = customerRegisterMapper.searchAllNationalityInfo();
            // 可以根据需要添加更多的插入逻辑
            return getAllInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // ビザlist
    @Transactional(rollbackFor = Exception.class)
    public List<CustomerRegisterModel> searchAllVisaInfo() {
        try {
            List<CustomerRegisterModel> getAllInfo = customerRegisterMapper.searchAllVisaType();
            // 可以根据需要添加更多的插入逻辑
            return getAllInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 顧客出所list
    @Transactional(rollbackFor = Exception.class)
    public List<CustomerRegisterModel> getAllCustomerBase() {
        try {
            List<CustomerRegisterModel> getAllInfo = customerRegisterMapper.searchAllCustomerBase();
            // 可以根据需要添加更多的插入逻辑
            return getAllInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 最大お客様番号
    @Transactional(rollbackFor = Exception.class)
    public String getMaxNo() {
        try {
            String getMaxInfo = customerRegisterMapper.getMaxCustomerNo();
            return getMaxInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 顧客出所list
    @Transactional(rollbackFor = Exception.class)
    public List<CustomerRegisterModel> getStations() {
        try {
            List<CustomerRegisterModel> getAllInfo = customerRegisterMapper.searchAllStations();
            // 可以根据需要添加更多的插入逻辑
            return getAllInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }



}
