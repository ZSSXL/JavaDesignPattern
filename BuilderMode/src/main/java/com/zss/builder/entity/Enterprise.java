package com.zss.builder.entity;

/**
 * @author zhoushs@dist.com.cn
 * @date 2020/11/18 10:42
 * @desc 企业实体
 */
@SuppressWarnings("unused")
public class Enterprise {

    /**
     * 企业Id
     */
    private String enterpriseId;

    /**
     * 企业名称
     */
    private String enterpriseName;

    /**
     * 企业地址
     */
    private String address;

    /**
     * 企业电话
     */
    private String number;

    /**
     * 企业邮箱
     */
    private String email;

    /**
     * 企业官网
     */
    private String website;

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "enterpriseId='" + enterpriseId + '\'' +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                '}';
    }

    // ================================== 模仿lombok的builder ================================== //

    public static Enterprise.EnterpriseBuilder builder() {
        return new Enterprise.EnterpriseBuilder();
    }

    public static class EnterpriseBuilder {

        private final Enterprise enterprise = new Enterprise();

        public EnterpriseBuilder() {
        }

        public Enterprise.EnterpriseBuilder enterpriseId(String enterpriseId) {
            enterprise.setEnterpriseId(enterpriseId);
            return this;
        }

        public Enterprise.EnterpriseBuilder enterpriseName(String enterpriseName) {
            enterprise.setEnterpriseName(enterpriseName);
            return this;
        }

        public Enterprise.EnterpriseBuilder address(String address) {
            enterprise.setAddress(address);
            return this;
        }

        public Enterprise.EnterpriseBuilder number(String number) {
            enterprise.setNumber(number);
            return this;
        }

        public Enterprise.EnterpriseBuilder email(String email) {
            enterprise.setEmail(email);
            return this;
        }

        public Enterprise.EnterpriseBuilder website(String website) {
            enterprise.setWebsite(website);
            return this;
        }

        public Enterprise build() {
            return enterprise;
        }
    }
}
