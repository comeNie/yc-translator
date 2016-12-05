package com.ai.yc.translator.dao.mapper.bo;

import java.sql.Timestamp;

public class UsrCertificate {
    private String certificationId;

    private String translatorId;

    private String certificateType;

    private String certificateLevel;

    private String certificateName;

    private String grantingInstitution;

    private String awardedTime;

    private String certificatesDescribe;

    private Timestamp createTime;

    public String getCertificationId() {
        return certificationId;
    }

    public void setCertificationId(String certificationId) {
        this.certificationId = certificationId == null ? null : certificationId.trim();
    }

    public String getTranslatorId() {
        return translatorId;
    }

    public void setTranslatorId(String translatorId) {
        this.translatorId = translatorId == null ? null : translatorId.trim();
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType == null ? null : certificateType.trim();
    }

    public String getCertificateLevel() {
        return certificateLevel;
    }

    public void setCertificateLevel(String certificateLevel) {
        this.certificateLevel = certificateLevel == null ? null : certificateLevel.trim();
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName == null ? null : certificateName.trim();
    }

    public String getGrantingInstitution() {
        return grantingInstitution;
    }

    public void setGrantingInstitution(String grantingInstitution) {
        this.grantingInstitution = grantingInstitution == null ? null : grantingInstitution.trim();
    }

    public String getAwardedTime() {
        return awardedTime;
    }

    public void setAwardedTime(String awardedTime) {
        this.awardedTime = awardedTime == null ? null : awardedTime.trim();
    }

    public String getCertificatesDescribe() {
        return certificatesDescribe;
    }

    public void setCertificatesDescribe(String certificatesDescribe) {
        this.certificatesDescribe = certificatesDescribe == null ? null : certificatesDescribe.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}