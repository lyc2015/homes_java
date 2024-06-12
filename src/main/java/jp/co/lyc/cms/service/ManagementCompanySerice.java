package jp.co.lyc.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.lyc.cms.mapper.ManagementCompanyMapper;
import jp.co.lyc.cms.model.ManagementCompanyModel;

@Component
public class ManagementCompanySerice {

    @Autowired
    ManagementCompanyMapper managementCompanyMapper;

    @Transactional(rollbackFor = Exception.class)
    public boolean registerManagementCompany(ManagementCompanyModel managementCompanyModel) {
        try {
            managementCompanyMapper.registerManagementCompany(managementCompanyModel);
            // 可以根据需要添加更多的插入逻辑
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public String searchMaxManagementCompanyID() {
        try {
           String maxNo = managementCompanyMapper.searchMaxManagementCompanyID();
            // 可以根据需要添加更多的插入逻辑
            return maxNo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
