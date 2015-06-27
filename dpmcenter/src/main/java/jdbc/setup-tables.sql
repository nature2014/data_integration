DROP TABLE IF EXISTS person;
CREATE TABLE IF NOT EXISTS person (
  id               INT NOT NULL PRIMARY KEY,
  name             VARCHAR(100),
  registerNo       VARCHAR(100),
  sex              TINYINT(1),
  height           INT,
  weight           INT,
  career           VARCHAR(20),
  age              INT,
  nation           VARCHAR(20),
  ethnic           VARCHAR(20),
  race             VARCHAR(20),
  birthDay         DATETIME,
  operateDate      DATETIME,
  identityNo       VARCHAR(20),
  medicareNo       VARCHAR(20),
  cellPhone        VARCHAR(20),
  homePhone        VARCHAR(20),
  address          VARCHAR(100),
  postCode         VARCHAR(20),
  email            VARCHAR(20),
  qq               VARCHAR(20),
  wechat           VARCHAR(20),
  hospitalizedDate DATETIME,
  dischargeDate    DATETIME,
  marriage         VARCHAR(20),
  educational      VARCHAR(20),
  complaint        VARCHAR(1000),
  diagnosis        VARCHAR(1000),
  instruction      VARCHAR(1000),
  summary          VARCHAR(1000),
  createTime       DATETIME,
  modifyTime       DATETIME
);

INSERT INTO person (name, registerNo, sex, height, weight, age, cellPhone, identityNo, birthday, operateDate, hospitalizedDate, dischargeDate, createTime, modifyTime, qq, email)
VALUES
  ('李某某', '2014-11-09', 1, 170, 150, 31, '18651806651', '34088119850323341X', '1985-03-23', '2014-11-09', '2014-11-08', '2014-11-11', '2014-11-08',
   '2014-11-08',
   '116352437',
   '116352437@qq.com');