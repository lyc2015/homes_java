package jp.co.lyc.cms.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import jp.co.lyc.cms.model.ManagementCompanyModel;

@Mapper
public interface ManagementCompanyMapper {

    // 管理会社を登録
    public void registerManagementCompany(ManagementCompanyModel managementCompanyModel);

    // 管理会社最大IDを取得
    public String searchMaxManagementCompanyID();

}
