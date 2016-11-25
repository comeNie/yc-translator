package com.ai.yc.translator.dao.mapper.bo;

public class SysSequences {
    private String sequenceName;

    private Integer jvmStepBy;

    private Integer incrementBy;

    private Integer startBy;

    private Integer lastNumber;

    public String getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName == null ? null : sequenceName.trim();
    }

    public Integer getJvmStepBy() {
        return jvmStepBy;
    }

    public void setJvmStepBy(Integer jvmStepBy) {
        this.jvmStepBy = jvmStepBy;
    }

    public Integer getIncrementBy() {
        return incrementBy;
    }

    public void setIncrementBy(Integer incrementBy) {
        this.incrementBy = incrementBy;
    }

    public Integer getStartBy() {
        return startBy;
    }

    public void setStartBy(Integer startBy) {
        this.startBy = startBy;
    }

    public Integer getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(Integer lastNumber) {
        this.lastNumber = lastNumber;
    }
}