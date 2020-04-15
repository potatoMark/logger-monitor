package com.numi.io.common.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * VIEW
 */
@Entity
@Table(name = "otd_phaserankview")
public class OtdPhaserankview implements Serializable {

    /** 制品编码 */
    @Id
    @Column(name = "entity_code")
    String entityCode;

    /** otd阶段代码 */
    @Column(name = "cyclephase_code")
    String cyclephaseCode;

    /** rank代码 */
    @Column(name = "rank_code")
    String rankCode;

    /** otd阶段周期时间 */
    @Column(name = "cycleact_cycletime")
    BigDecimal cycleactCycletime;

    /**  */
    @Column(name = "flag")
    Integer flag;

    /** 创建时间 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 
     * Returns the entityCode.
     * 
     * @return the entityCode
     */
    public String getEntityCode() {
        return entityCode;
    }

    /** 
     * Sets the entityCode.
     * 
     * @param entityCode the entityCode
     */
    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode;
    }

    /** 
     * Returns the cyclephaseCode.
     * 
     * @return the cyclephaseCode
     */
    public String getCyclephaseCode() {
        return cyclephaseCode;
    }

    /** 
     * Sets the cyclephaseCode.
     * 
     * @param cyclephaseCode the cyclephaseCode
     */
    public void setCyclephaseCode(String cyclephaseCode) {
        this.cyclephaseCode = cyclephaseCode;
    }

    /** 
     * Returns the rankCode.
     * 
     * @return the rankCode
     */
    public String getRankCode() {
        return rankCode;
    }

    /** 
     * Sets the rankCode.
     * 
     * @param rankCode the rankCode
     */
    public void setRankCode(String rankCode) {
        this.rankCode = rankCode;
    }

    /** 
     * Returns the cycleactCycletime.
     * 
     * @return the cycleactCycletime
     */
    public BigDecimal getCycleactCycletime() {
        return cycleactCycletime;
    }

    /** 
     * Sets the cycleactCycletime.
     * 
     * @param cycleactCycletime the cycleactCycletime
     */
    public void setCycleactCycletime(BigDecimal cycleactCycletime) {
        this.cycleactCycletime = cycleactCycletime;
    }

    /** 
     * Returns the flag.
     * 
     * @return the flag
     */
    public Integer getFlag() {
        return flag;
    }

    /** 
     * Sets the flag.
     * 
     * @param flag the flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /** 
     * Returns the createDate.
     * 
     * @return the createDate
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /** 
     * Sets the createDate.
     * 
     * @param createDate the createDate
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}