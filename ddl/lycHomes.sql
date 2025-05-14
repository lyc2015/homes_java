USE lycHomes;

DROP TABLE IF EXISTS T001EmployeeDetail;
CREATE TABLE T001EmployeeDetail (
    employeeNo VARCHAR(6) NOT NULL COMMENT '社員番号',
    employeeLastName VARCHAR(8) NOT NULL COMMENT '社員氏',
    employeeFirstName VARCHAR(8) NOT NULL COMMENT '社員名',
    password VARCHAR(32) NOT NULL COMMENT 'パスワード',
    authorityCode INT NOT NULL COMMENT '権限コード',
    genderStatus VARCHAR(1) COMMENT '性別ステータス',
    birthday VARCHAR(10) COMMENT '誕生日',
    japaneseCalendar VARCHAR(10) COMMENT '和暦',
    alphabetName VARCHAR(20) COMMENT 'アルファベット',
    furigana VARCHAR(65) COMMENT 'カタカナ',
    nationalityCode INT COMMENT '国籍コード(国)',
    intoCompanyYearAndMonth VARCHAR(8) COMMENT '入社年月',
    employeeFormCode INT COMMENT '社員形式',
    retirementResonClassification VARCHAR(1) COMMENT '退職区分',
    retirementYearAndMonth VARCHAR(8) COMMENT '退職年月',
    comeToJapanYearAndMonth VARCHAR(6) COMMENT '来日年月',
    graduationUniversity VARCHAR(20) COMMENT '卒業学校',
    graduationYearAndMonth VARCHAR(6) COMMENT '卒業年月',
    residenceCode INT COMMENT '在留資格',
    companyMail VARCHAR(30) COMMENT '社内メールアドレス',
    phoneNo VARCHAR(11) COMMENT '電話番号',
    employmentInsuranceStatus VARCHAR(1) COMMENT '雇用保険加入',
    socialInsuranceStatus VARCHAR(1) COMMENT '社会保険加入',
    yearsOfExperience VARCHAR(10) COMMENT '経験年数',
    retirementResonClassificationCode INT COMMENT '退職区分コード',
    departmentCode INT COMMENT '部署コード',
    homesAgentCode INT COMMENT '仲介区分',
    picInfo BLOB COMMENT '写真情報',
    socialInsuranceNo VARCHAR(13) COMMENT '社会保険番号',
    employmentInsuranceNo VARCHAR(13) COMMENT '雇用保険番号',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (employeeNo)
) COMMENT = '従業員明細情報を格納するテーブル';

-- Insert initial data
INSERT INTO T001EmployeeDetail (
    employeeNo, employeeLastName, employeeFirstName, password, authorityCode, genderStatus, birthday,
    japaneseCalendar, alphabetName, furigana, nationalityCode, intoCompanyYearAndMonth, employeeFormCode,
    retirementResonClassification, retirementYearAndMonth, comeToJapanYearAndMonth, graduationUniversity,
    graduationYearAndMonth, residenceCode, companyMail, phoneNo, employmentInsuranceStatus, socialInsuranceStatus,
    yearsOfExperience, retirementResonClassificationCode, departmentCode, homesAgentCode, picInfo,
    socialInsuranceNo, employmentInsuranceNo, updateTime, createTime, updateUser
)
VALUES
    ('LYH001', '斉藤', '真一', '123abcue83jh123poi986djhye48k32', 0, '0', '19850302', '昭和60年3月2日',
     'sayitowusinniti', 'サイトウシンイチ', 1, '20170601', 0, '1', '20190701', '201709', '遼寧省技術大学',
     '201607', 0, NULL, NULL, NULL, NULL, '3年3月', NULL, 0, NULL, NULL, NULL, NULL,
     '2018-09-21 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('LYH002', '佐藤', '英名', '123abcue83jh123poi986djhye48k32', 1, '1', NULL, NULL, NULL, NULL, NULL,
     NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL,
     NULL, NULL, '2018-09-21 17:15:00', '2018-09-20 17:15:00', 'LYC002'),
    ('LYH003', '田中', '一朗', '123abcue83jh123poi986djhye48k32', 1, '0', NULL, NULL, NULL, NULL, NULL,
     NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,
     NULL, NULL, NULL, '2018-09-21 17:15:00', '2018-09-20 17:15:00', 'LYC003'),
    ('LYH004', '池田', '健二', '123abcue83jh123poi986djhye48k32', 0, '1', NULL, NULL, NULL, NULL, NULL,
     NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,
     NULL, NULL, NULL, '2018-09-21 17:15:00', '2018-09-20 17:15:00', 'LYC004');

DROP TABLE IF EXISTS T002customerInfo;
CREATE TABLE T002customerInfo (
    customerNo VARCHAR(6) NOT NULL COMMENT 'お客様番号',
    customerLastName VARCHAR(8) NOT NULL COMMENT 'お客様氏',
    customerFirstName VARCHAR(8) NOT NULL COMMENT 'お客様名',
    genderStatus VARCHAR(1) COMMENT '性別ステータス',
    birthday VARCHAR(10) COMMENT '誕生日',
    japaneseCalendar VARCHAR(10) COMMENT '和暦',
    alphabetName VARCHAR(20) COMMENT 'アルファベット',
    furigana VARCHAR(65) COMMENT 'カタカナ',
    nationalityCode INT COMMENT '国籍コード(国)',
    residenceCode INT COMMENT '在留資格',
    mail VARCHAR(30) COMMENT 'メールアドレス',
    phoneNo VARCHAR(11) COMMENT '電話番号',
    customerBase VARCHAR(2) COMMENT '顧客出所コード',
    postcode VARCHAR(7) COMMENT '郵便番号',
    firstHalfAddress VARCHAR(50) COMMENT '住所前半',
    lastHalfAddress VARCHAR(50) COMMENT '住所後半',
    stationCode VARCHAR(4) COMMENT '最寄駅',
    remark VARCHAR(50) COMMENT '備考',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (customerNo)
) COMMENT = 'お客様情報を格納するテーブル';

-- Insert initial data
INSERT INTO T002customerInfo (
    customerNo, customerLastName, customerFirstName, genderStatus, birthday, japaneseCalendar, alphabetName,
    furigana, nationalityCode, residenceCode, mail, phoneNo, customerBase, postcode, firstHalfAddress,
    lastHalfAddress, stationCode, remark, updateTime, createTime, updateUser
)
VALUES
    ('C0001', '斉藤', '真一', '0', '19850302', '昭和60年3月2日', 'sayitowusinniti', 'サイトウシンイチ', 1, 0,
     NULL, NULL, NULL, '2310023', '神奈川県横浜市中区', '1-2-5 4102', '0', NULL, '2018-09-21 17:15:00',
     '2018-09-20 17:15:00', 'LYC001'),
    ('002', '佐藤', '英名', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0392406',
     '青森県上北郡上北町', '11-34-2 809', '0', NULL, '2018-09-21 17:15:00', '2018-09-20 17:15:00', 'LYC002'),
    ('003', '田中', '一朗', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1460082',
     '東京都大田区池上', '4-6-12 102', '0', NULL, '2018-09-21 17:15:00', '2018-09-20 17:15:00', 'LYC003'),
    ('004', '池田', '健二', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1460082',
     '東京都大田区池上', '4-6-12 102', '0', NULL, '2018-09-21 17:15:00', '2018-09-20 17:15:00', 'LYC004');

DROP TABLE IF EXISTS T003salesInfo;
CREATE TABLE T003salesInfo (
    contractID VARCHAR(6) NOT NULL COMMENT '契約ID',
    customerNo VARCHAR(6) NOT NULL COMMENT 'お客様番号',
    contractDate VARCHAR(10) COMMENT '契約日',
    realEstateName VARCHAR(50) COMMENT '物件名',
    realEstatePostCode VARCHAR(7) COMMENT '物件郵便',
    realEstateAddress VARCHAR(50) COMMENT '物件住所',
    rent VARCHAR(6) COMMENT '家賃',
    realEstateManagementCompanyCode VARCHAR(1) COMMENT '管理会社コード',
    InstitutionId VARCHAR(4) COMMENT '機構（紹介人）ID',
    Introducer VARCHAR(10) COMMENT '紹介人',
    IntroducerFee VARCHAR(6) COMMENT '紹介費',
    commissionAdCode INT COMMENT '手数料(AD)',
    bankSales VARCHAR(6) COMMENT '銀行売上',
    asScheduledDate VARCHAR(10) COMMENT 'AD予定日',
    applicationAmount VARCHAR(6) COMMENT '申込金',
    remark VARCHAR(50) COMMENT '備考',
    employeeNo VARCHAR(6) COMMENT '営業担当コード',
    contactInfo VARCHAR(11) COMMENT '連絡先',
    currentPostal VARCHAR(7) COMMENT '現郵便',
    currentAddress VARCHAR(50) COMMENT '現住所',
    visa VARCHAR(20) COMMENT 'ビザ',
    updateDate DATETIME COMMENT '更新日',
    createDate DATETIME COMMENT '作成日',
    PRIMARY KEY (contractID)
) COMMENT = '売上情報を格納するテーブル';

-- Insert initial data
INSERT INTO T003salesInfo (
    contractID, customerNo, contractDate, realEstateName, realEstatePostCode, realEstateAddress, rent,
    realEstateManagementCompanyCode, InstitutionId, Introducer, IntroducerFee, commissionAdCode, bankSales,
    asScheduledDate, applicationAmount, remark, employeeNo, contactInfo, currentPostal, currentAddress, visa,
    updateDate, createDate
)
VALUES
    ('000001', 'lyc001', '2024/6/4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,
     NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

DROP TABLE IF EXISTS T004InstitutionInfo;
CREATE TABLE T004InstitutionInfo (
    institutionNo VARCHAR(5) NOT NULL COMMENT '機構番号',
    institutionName VARCHAR(50) NOT NULL COMMENT '機構名',
    institutionAbbreviation VARCHAR(20) COMMENT '機構略称',
    representative VARCHAR(20) COMMENT '代表取締役',
    establishmentDate VARCHAR(8) COMMENT '設立年月日',
    businessStartDate VARCHAR(8) COMMENT '取引開始日',
    companyNatureCode INT COMMENT '会社性質コード',
    url VARCHAR(50) COMMENT 'URL',
    purchasingManagers VARCHAR(20) COMMENT '購買営業担当',
    purchasingManagersMail VARCHAR(50) COMMENT 'メール',
    paymentsiteCode VARCHAR(2) COMMENT '支払サイトコード',
    capitalStock VARCHAR(7) COMMENT '資本金',
    basicContract VARCHAR(1) COMMENT '基本契約',
    commonMail VARCHAR(50) COMMENT '共通メール',
    remark VARCHAR(50) COMMENT '備考',
    cashBackRate VARCHAR(5) COMMENT 'キャッシュバック比率',
    updateTime DATETIME COMMENT '更新日付',
    createTime DATETIME COMMENT '作成日付',
    updateUser VARCHAR(10) COMMENT '更新者',
    PRIMARY KEY (institutionNo)
) COMMENT = '機構情報を格納するテーブル';

-- Insert initial data
INSERT INTO T004InstitutionInfo (
    institutionNo, institutionName, institutionAbbreviation, representative, establishmentDate,
    businessStartDate, companyNatureCode, url, purchasingManagers, purchasingManagersMail,
    paymentsiteCode, capitalStock, basicContract, commonMail, remark, cashBackRate,
    updateTime, createTime, updateUser
)
VALUES
    ('M0001', 'ベース株式会社', 'base', '中山　毛石', '20160701',
     '20170305', 0, 'www.123.co.jp', NULL, NULL,
     '0', NULL, NULL, NULL, 'AAAAAAA', '%30',
     '2018-09-20 17:15', '2018-09-20 17:15', 'LYC001');

DROP TABLE IF EXISTS T005ManagementCompanyInfo;
CREATE TABLE T005ManagementCompanyInfo (
    managementCompanyID VARCHAR(5) NOT NULL COMMENT '管理会社ID',
    managementCompanyName VARCHAR(20) NOT NULL COMMENT '管理会社名',
    postCode VARCHAR(7) COMMENT '郵便番号',
    address VARCHAR(50) COMMENT 'アドレス',
    phoneNo VARCHAR(11) COMMENT '電話番号',
    mail VARCHAR(25) COMMENT 'メール',
    homePageURL VARCHAR(50) COMMENT 'ホームページURL',
    remark VARCHAR(50) COMMENT '備考',
    updateTime DATETIME COMMENT '更新日付',
    createTime DATETIME COMMENT '作成日付',
    updateUser VARCHAR(10) COMMENT '更新者',
    PRIMARY KEY (managementCompanyID, managementCompanyName)
) COMMENT = '管理会社情報を格納するテーブル';

-- Insert initial data
INSERT INTO T005ManagementCompanyInfo (
    managementCompanyID, managementCompanyName, postCode, address, phoneNo,
    mail, homePageURL, remark, updateTime, createTime, updateUser
)
VALUES
    ('M0001', '野村不動産パートナーズ', '1630562', '東京都新宿区西新宿1丁目26番2号　新宿野村ビル21階', '333450611',
     NULL, 'https://www.nomura-pt.co.jp/', 'AAAAAAA', '2018-09-20 17:15', '2018-09-20 17:15', 'LYC001');

DROP TABLE IF EXISTS T006WagesInfo;
CREATE TABLE T006WagesInfo (
    employeeNo VARCHAR(6) NOT NULL COMMENT '社員番号',
    reflectYearAndMonth VARCHAR(6) NOT NULL COMMENT '反映年月',
    socialInsuranceFlag BOOLEAN COMMENT '社会保険フラグ',
    salary VARCHAR(7) COMMENT '給料',
    waitingCost VARCHAR(6) COMMENT '待機費用',
    welfarePensionAmount VARCHAR(6) COMMENT '厚生年金料',
    healthInsuranceAmount VARCHAR(6) COMMENT '健康保険料',
    insuranceFeeAmount VARCHAR(6) COMMENT '保険料総額',
    fristTimeBonusAmount VARCHAR(7) COMMENT '一回目ボーナス金額',
    secondTimeBonusAmount VARCHAR(7) COMMENT '二回目ボーナス金額',
    bonusFlag BOOLEAN COMMENT 'ボーナスフラグ',
    bonusNo BOOLEAN COMMENT 'ボーナス回数',
    fristBonusMonth VARCHAR(6) COMMENT 'ボーナ一回目支払月',
    secondBonusMonth VARCHAR(6) COMMENT 'ボーナ二回目支払月',
    monthOfCompanyPay VARCHAR(5) COMMENT '月に会社負担額',
    nextRaiseMonth VARCHAR(6) COMMENT '次回昇給月',
    totalAmount VARCHAR(7) COMMENT '総額',
    remark VARCHAR(50) COMMENT '備考',
    employeeStatus VARCHAR(1) COMMENT '社員形式コード',
    workingConditionStatus VARCHAR(1) COMMENT '稼働ステータス',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (employeeNo, reflectYearAndMonth)
) COMMENT = '給料情報を格納するテーブル';

-- Insert initial data
INSERT INTO T006WagesInfo (
    employeeNo, reflectYearAndMonth, socialInsuranceFlag, salary, waitingCost,
    welfarePensionAmount, healthInsuranceAmount, insuranceFeeAmount, fristTimeBonusAmount, secondTimeBonusAmount,
    bonusFlag, bonusNo, fristBonusMonth, secondBonusMonth, monthOfCompanyPay,
    nextRaiseMonth, totalAmount, remark, employeeStatus, workingConditionStatus,
    updateTime, createTime, updateUser
)
VALUES
    ('001', '201705', 0, '0', '100000',
     NULL, NULL, NULL, '200000', '200000',
     0, 0, '202007', '202007', '10000',
     '202007', '200000', 'なし', '0', '0',
     '2018-09-20 17:15', '2018-09-20 17:15', 'LYC001'),
    ('002', '201705', 1, '1', '50000',
     NULL, NULL, NULL, '200000', '200000',
     1, 1, '202006', '202006', '15000',
     '202006', NULL, NULL, NULL, NULL,
     '2018-09-20 17:15', '2018-09-20 17:15', 'LYC002');

DROP TABLE IF EXISTS T007ExpensesInfo;
CREATE TABLE T007ExpensesInfo (
    employeeNo VARCHAR(6) NOT NULL COMMENT '社員番号',
    expensesreflectYearAndMonth VARCHAR(6) NOT NULL COMMENT '反映年月',
    transportationExpenses VARCHAR(5) COMMENT '交通費',
    otherAllowanceName VARCHAR(20) COMMENT '他の手当名称',
    otherAllowanceAmount VARCHAR(6) COMMENT '他の手当',
    leaderAllowanceAmount VARCHAR(6) COMMENT 'リーダー手当',
    totalExpenses VARCHAR(6) COMMENT '諸費用総額',
    introductionAllowance VARCHAR(6) COMMENT '紹介費',
    remark VARCHAR(50) COMMENT '備考',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (employeeNo, expensesreflectYearAndMonth)
) COMMENT = '諸費用情報を格納するテーブル';

-- Insert initial data
INSERT INTO T007ExpensesInfo (
    employeeNo, expensesreflectYearAndMonth, transportationExpenses, otherAllowanceName, otherAllowanceAmount,
    leaderAllowanceAmount, totalExpenses, introductionAllowance, remark, updateTime,
    createTime, updateUser
)
VALUES
    ('001', '201705', '20000', 'リーダー', '10000',
     '20000', '34000', '10000', NULL, '2018-09-20 17:15',
     '2018-09-20 17:15', 'LYC001'),
    ('002', '201705', '30000', NULL, NULL,
     NULL, NULL, NULL, NULL, '2018-09-20 17:15',
     '2018-09-20 17:15', 'LYC002');

DROP TABLE IF EXISTS T008CostInfo;
CREATE TABLE T008CostInfo (
    employeeNo VARCHAR(6) NOT NULL COMMENT '社員番号',
    yearMonth VARCHAR(6) NOT NULL COMMENT '年月',
    happendDate VARCHAR(8) NOT NULL COMMENT '発生日付',
    costClassificationCode INT NOT NULL COMMENT '区分',
    regularStatus INT COMMENT '定期区分',
    dueDate VARCHAR(8) COMMENT '終了日付',
    detailedNameOrLine VARCHAR(20) COMMENT '詳細名称と線路',
    stationCode VARCHAR(4) COMMENT '場所',
    transportationCode INT COMMENT '交通手段コード',
    originCode VARCHAR(4) COMMENT '出発地',
    destinationCode VARCHAR(4) COMMENT '目的地',
    cost VARCHAR(10) COMMENT '金額',
    remark VARCHAR(20) COMMENT '備考',
    roundCode INT COMMENT '片往',
    costFile BLOB COMMENT '添付ファイル',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (employeeNo, yearMonth, happendDate, costClassificationCode)
) COMMENT = '費用登録情報を格納するテーブル';

-- Insert initial data
INSERT INTO T008CostInfo (
    employeeNo, yearMonth, happendDate, costClassificationCode, regularStatus,
    dueDate, detailedNameOrLine, stationCode, transportationCode, originCode,
    destinationCode, cost, remark, roundCode, costFile,
    updateTime, createTime, updateUser
)
VALUES
    ('001', '201705', '20170501', 1, 1,
     '20170531', '詳細名称', 'ST01', 1, 'OR01',
     'DS01', '1000', '備考', 1, NULL,
     '2018-09-20 17:15', '2018-09-20 17:15', 'LYC001');

DROP TABLE IF EXISTS T009CustomerSendMailStorageList;
CREATE TABLE T009CustomerSendMailStorageList (
    StorageListName VARCHAR(20) NOT NULL COMMENT '格納リスト名',
    transmissionClassificationCode INT NOT NULL COMMENT '送信区分コード',
    mainChargeList VARCHAR(50) COMMENT 'メイン担当者リスト',
    customerList VARCHAR(500) COMMENT 'お客様番号リスト',
    NoChargeList VARCHAR(50) COMMENT '対象社員番号リスト',
    CandidateInChargeList VARCHAR(500) COMMENT '候補者リスト',
    sentReportStatus INT COMMENT '送信済ステータス',
    NumberOfTransmissionsPerMonth INT COMMENT '月送信回数',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (StorageListName, transmissionClassificationCode)
) COMMENT = 'お客様送信格納リスト情報を格納するテーブル';

-- Insert initial data
INSERT INTO T009CustomerSendMailStorageList (
    StorageListName, transmissionClassificationCode, mainChargeList, customerList, NoChargeList,
    CandidateInChargeList, sentReportStatus, NumberOfTransmissionsPerMonth, updateTime, createTime,
    updateUser
)
VALUES
    ('ddd', '1', NULL, NULL, NULL,
     NULL, NULL, NULL, '2018-09-20 17:15', '2018-09-20 17:15', 'LYC001'),
    ('sss', '1', NULL, NULL, NULL,
     NULL, NULL, NULL, '2018-09-20 17:15', '2018-09-20 17:15', 'LYC002');

DROP TABLE IF EXISTS T010AccountInfo;
CREATE TABLE T010AccountInfo (
    employeeOrCustomerNo VARCHAR(6) NOT NULL COMMENT '番号',
    accountBelongsStatus VARCHAR(1) NOT NULL COMMENT 'ステータス',
    bankCode INT NOT NULL COMMENT '銀行コード',
    bankBranchCode VARCHAR(3) COMMENT '支店コード',
    accountTypeStatus VARCHAR(1) COMMENT '口座種類ステータス',
    accountNo VARCHAR(7) COMMENT '口座番号',
    accountName VARCHAR(20) COMMENT '口座名義人',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (employeeOrCustomerNo, accountBelongsStatus, bankCode)
) COMMENT = '口座情報を格納するテーブル';

-- Insert initial data
INSERT INTO T010AccountInfo (
    employeeOrCustomerNo, accountBelongsStatus, bankCode, bankBranchCode, accountTypeStatus,
    accountNo, accountName, updateTime, createTime, updateUser
)
VALUES
    ('lyc001', '1', 1, '053', '0', '0029029', 'インブンゴウ', '2018-09-21 17:15', '2018-09-20 17:15', 'LYC001'),
    ('001', '0', 2, '013', '0', '124775', 'リュウブンタク', '2018-09-21 17:15', '2018-09-20 17:15', 'LYC001'),
    ('002', '1', 3, '021', '0', '1234598', 'インブンゴウ', '2018-09-21 17:15', '2018-09-20 17:15', 'LYC001'),
    ('lyc004', '0', 4, '019', '1', '3423233', 'リュウブンタク', '2018-09-21 17:15', '2018-09-20 17:15', 'LYC002');


DROP TABLE IF EXISTS M001NationalityMaster;
CREATE TABLE M001NationalityMaster (
    nationalityCode INT NOT NULL AUTO_INCREMENT COMMENT 'コード',
    nationalityName VARCHAR(20) NOT NULL COMMENT '名称',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (nationalityCode)
) COMMENT = '国籍マスター情報を格納するテーブル';

-- Insert initial data
INSERT INTO M001NationalityMaster (nationalityName, updateTime, createTime, updateUser)
VALUES
    ('中国', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('インド', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('中国(台湾)', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('日本', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('他の国', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001');

DROP TABLE IF EXISTS M002EmployeeFormMaster;
CREATE TABLE M002EmployeeFormMaster (
    employeeFormCode INT NOT NULL AUTO_INCREMENT COMMENT '社員形式コード',
    employeeFormName VARCHAR(20) NOT NULL COMMENT '名称',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (employeeFormCode)
) COMMENT = '社員形式マスター情報を格納するテーブル';

-- Insert initial data
INSERT INTO M002EmployeeFormMaster (employeeFormName, updateTime, createTime, updateUser)
VALUES
    ('正社員', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('契約社員', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001');

DROP TABLE IF EXISTS M003AuthorityMaster;
CREATE TABLE M003AuthorityMaster (
    authorityCode INT NOT NULL AUTO_INCREMENT COMMENT 'コード',
    authorityName VARCHAR(20) NOT NULL COMMENT '名称',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (authorityCode)
) COMMENT = '権限マスター情報を格納するテーブル';

-- Insert initial data
INSERT INTO M003AuthorityMaster (authorityName, updateTime, createTime, updateUser)
VALUES
    ('社員', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('管理者', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001');

DROP TABLE IF EXISTS M004DepartmentMaster;
CREATE TABLE M004DepartmentMaster (
    departmentCode INT NOT NULL AUTO_INCREMENT COMMENT 'コード',
    departmentName VARCHAR(20) NOT NULL COMMENT '名称',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (departmentCode)
) COMMENT = '部署マスター情報を格納するテーブル';

-- Insert initial data
INSERT INTO M004DepartmentMaster (departmentName, updateTime, createTime, updateUser)
VALUES
    ('総務部', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('管理部', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('第一部', '2018-09-21 17:15:00', '2018-09-21 17:15:00', 'LYC002'),
    ('第二部', '2018-09-22 17:15:00', '2018-09-22 17:15:00', 'LYC003'),
    ('第三部', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001');

DROP TABLE IF EXISTS M005RetirementResonClassificationMasterMaster;
CREATE TABLE M005RetirementResonClassificationMasterMaster (
    retirementResonClassificationCode INT NOT NULL AUTO_INCREMENT COMMENT 'コード',
    retirementResonClassificationName VARCHAR(20) NOT NULL COMMENT '名称',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (retirementResonClassificationCode)
) COMMENT = '退職理由区分マスター情報を格納するテーブル';

-- Insert initial data
INSERT INTO M005RetirementResonClassificationMasterMaster (retirementResonClassificationName, updateTime, createTime, updateUser)
VALUES
    ('帰国', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('転職', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('出向', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('派遣', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001');

DROP TABLE IF EXISTS M006HomesAgentCodeMaster;
CREATE TABLE M006HomesAgentCodeMaster (
    homesAgentCode INT NOT NULL AUTO_INCREMENT COMMENT 'コード',
    homesAgentName VARCHAR(20) NOT NULL COMMENT '名称',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (homesAgentCode)
) COMMENT = '仲介区分マスター情報を格納するテーブル';

-- Insert initial data
INSERT INTO M006HomesAgentCodeMaster (homesAgentName, updateTime, createTime, updateUser)
VALUES
    ('販売', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('賃貸', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('両方', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001');

DROP TABLE IF EXISTS M007CustomerBaseMaster;
CREATE TABLE M007CustomerBaseMaster (
    customerBaseCode INT NOT NULL AUTO_INCREMENT COMMENT 'コード',
    customerBaseName VARCHAR(20) NOT NULL COMMENT '名称',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (customerBaseCode)
) COMMENT = '顧客出所区分マスター情報を格納するテーブル';

-- Insert initial data
INSERT INTO M007CustomerBaseMaster (customerBaseName, updateTime, createTime, updateUser)
VALUES
    ('機構', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('本社紹介', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('過去お客様紹介', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('媒介の経由', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001');

DROP TABLE IF EXISTS M008StationMaster;
CREATE TABLE M008StationMaster (
    stationCode INT NOT NULL AUTO_INCREMENT COMMENT '現場役割コード',
    stationName VARCHAR(20) NOT NULL COMMENT '現場役割名称',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (stationCode)
) COMMENT = '駅マスター情報を格納するテーブル';

-- Insert initial data
INSERT INTO M008StationMaster (stationName, updateTime, createTime, updateUser)
VALUES
    ('秋葉原', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('大島', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('品川', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001');

DROP TABLE IF EXISTS M009PaymentSiteMaster;
CREATE TABLE M009PaymentSiteMaster (
    paymentSiteCode INT NOT NULL AUTO_INCREMENT COMMENT 'コード',
    paymentSiteName VARCHAR(20) NOT NULL COMMENT '名称',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (paymentSiteCode)
) COMMENT = '支払サイトマスター情報を格納するテーブル';

-- Insert initial data
INSERT INTO M009PaymentSiteMaster (paymentSiteName, updateTime, createTime, updateUser)
VALUES
    ('30日', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('45日', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('60日', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('他', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001');

DROP TABLE IF EXISTS M010ResidenceMaster;
CREATE TABLE M010ResidenceMaster (
    residenceCode INT NOT NULL AUTO_INCREMENT COMMENT 'コード',
    visaName VARCHAR(20) NOT NULL COMMENT '名称',
    updateTime DATETIME NOT NULL COMMENT '更新日付',
    createTime DATETIME NOT NULL COMMENT '作成日付',
    updateUser VARCHAR(10) NOT NULL COMMENT '更新者',
    PRIMARY KEY (residenceCode)
) COMMENT = '在留資格マスター情報を格納するテーブル';

-- Insert initial data
INSERT INTO M010ResidenceMaster (visaName, updateTime, createTime, updateUser)
VALUES
    ('人文技術1年', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('人文技術3年', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('人文技術5年', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('高度人材', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('定住', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('永住権', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('日本籍', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('家族', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('留学', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001'),
    ('他の形', '2018-09-20 17:15:00', '2018-09-20 17:15:00', 'LYC001');