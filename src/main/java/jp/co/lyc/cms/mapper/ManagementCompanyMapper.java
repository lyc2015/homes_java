package jp.co.lyc.cms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import jp.co.lyc.cms.model.ManagementCompanyModel;

@Mapper
public interface ManagementCompanyMapper {
    // 管理会社を登録
    public void registerManagementCompany(ManagementCompanyModel managementCompanyModel);

    // 管理会社最大IDを取得
    public String searchMaxManagementCompanyID();

    // すべての管理会社IDと会社名を取得
    public List<ManagementCompanyModel> searchAllManagementCompanyInfo();

    // 管理会社IDで、会社情報を取得
    public List<ManagementCompanyModel> getManagementCompanyInfoByID(ManagementCompanyModel managementCompanyModel);

    //管理会社情報更新
    public int updateManagementCompanyInfo(ManagementCompanyModel managementCompanyModel);

}
