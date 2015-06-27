package jdbc;

import java.util.Date;

/**
 * 简单的患者对象
 */
public class Person {
    private String name;
    private String registerNo;      //住院号，门诊号
    private int sex;                //性别
    private int height;             //身高 cm
    private int weight;             //体重
    private String career;          //职业
    private Integer age;            //年龄
    private String nation;          //民族
    private String ethnic;          //种族
    private String race;            //人种
    private Date birthDay;          //出生日期
    private Date operateDate;       //手术日期
    private String identityNo;      //身份证号
    private String medicareNo;      //医保卡号
    private String cellPhone;       //手机号码
    private String homePhone;       //家庭电话
    private String address;         //家庭住址
    private String postCode;        //邮编
    private String email;           //电子邮件
    private String qq;              //qq号
    private String wechat;          //微信号
    private Date hospitalizedDate;  //住院时间
    private Date dischargeDate;     //出院时间
    private String marriage;        //婚姻状况
    private String educational;     //文化程度
    private String complaint;       //主诉
    private String diagnosis;       //诊断
    private String instruction;     //医嘱
    private String summary;         //出院小结
    private Date createTime;        //创建时间
    private Date modifyTime;        //修改时间

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getMedicareNo() {
        return medicareNo;
    }

    public void setMedicareNo(String medicareNo) {
        this.medicareNo = medicareNo;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public Date getHospitalizedDate() {
        return hospitalizedDate;
    }

    public void setHospitalizedDate(Date hospitalizedDate) {
        this.hospitalizedDate = hospitalizedDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getEducational() {
        return educational;
    }

    public void setEducational(String educational) {
        this.educational = educational;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "registerNo='" + registerNo + '\'' +
                ", sex=" + sex +
                ", height=" + height +
                ", weight=" + weight +
                ", career='" + career + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                ", ethnic='" + ethnic + '\'' +
                ", race='" + race + '\'' +
                ", birthDay=" + birthDay +
                ", operateDate=" + operateDate +
                ", identityNo='" + identityNo + '\'' +
                ", medicareNo='" + medicareNo + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", address='" + address + '\'' +
                ", postCode='" + postCode + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", hospitalizedDate=" + hospitalizedDate +
                ", dischargeDate=" + dischargeDate +
                ", marriage='" + marriage + '\'' +
                ", educational='" + educational + '\'' +
                ", complaint='" + complaint + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", instruction='" + instruction + '\'' +
                ", summary='" + summary + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                '}';
    }
}
