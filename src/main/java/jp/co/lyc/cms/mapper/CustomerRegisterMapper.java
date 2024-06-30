package jp.co.lyc.cms.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import jp.co.lyc.cms.model.CustomerRegisterModel;

@Mapper
public interface CustomerRegisterMapper {

    // すべての国籍を取得
    public List<CustomerRegisterModel> searchAllNationalityInfo();

    // すべてのビザタイプを取得
    public List<CustomerRegisterModel> searchAllVisaType();

    // すべての顧客出所を取得
    public List<CustomerRegisterModel> searchAllCustomerBase();

    // すべてのstationを取得
    public List<CustomerRegisterModel> searchAllStations();

    // 最大お客様番号を取得
    public String getMaxCustomerNo();

}
