package com.numi.io.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "delivery_logisticscycle")
public class DeliveryLogisticscycle implements Serializable {

    /** id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    /** 制品编码 */
    @Column(name = "entity_code")
    String entityCode;

    /** 订单编码 */
    @Column(name = "order_code")
    String orderCode;

    /** 路线编码 */
    @Column(name = "route_code")
    String routeCode;

    /** 路段代码 */
    @Column(name = "section_code")
    String sectionCode;

    /** 路线起点 */
    @Column(name = "logisticscycle_starttp")
    String logisticscycleStarttp;

    /** 实际开始时间 */
    @Column(name = "logisticscycle_actstarttime")
    LocalDateTime logisticscycleActstarttime;

    /** 路线终点 */
    @Column(name = "logisticscycle_endtp")
    String logisticscycleEndtp;

    /** 实际结束时间 */
    @Column(name = "logisticscycle_actendtime")
    LocalDateTime logisticscycleActendtime;

    /** 实际物流周期 */
    @Column(name = "logisticscycle_cycle")
    BigDecimal logisticscycleCycle;

    /** 物流停留基准时间 */
    @Column(name = "logisticscycle_staystandtime")
    BigDecimal logisticscycleStaystandtime;

    /** 实际停留时间 */
    @Column(name = "logisticscycle_staytime")
    BigDecimal logisticscycleStaytime;

    /** 创建时间 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 创建者 */
    @Column(name = "create_user")
    String createUser;

    /** 更新时间 */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 更新者 */
    @Column(name = "update_user")
    String updateUser;

    /** 
     * Returns the id.
     * 
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /** 
     * Sets the id.
     * 
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

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
     * Returns the orderCode.
     * 
     * @return the orderCode
     */
    public String getOrderCode() {
        return orderCode;
    }

    /** 
     * Sets the orderCode.
     * 
     * @param orderCode the orderCode
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    /** 
     * Returns the routeCode.
     * 
     * @return the routeCode
     */
    public String getRouteCode() {
        return routeCode;
    }

    /** 
     * Sets the routeCode.
     * 
     * @param routeCode the routeCode
     */
    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    /** 
     * Returns the sectionCode.
     * 
     * @return the sectionCode
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /** 
     * Sets the sectionCode.
     * 
     * @param sectionCode the sectionCode
     */
    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    /** 
     * Returns the logisticscycleStarttp.
     * 
     * @return the logisticscycleStarttp
     */
    public String getLogisticscycleStarttp() {
        return logisticscycleStarttp;
    }

    /** 
     * Sets the logisticscycleStarttp.
     * 
     * @param logisticscycleStarttp the logisticscycleStarttp
     */
    public void setLogisticscycleStarttp(String logisticscycleStarttp) {
        this.logisticscycleStarttp = logisticscycleStarttp;
    }

    /** 
     * Returns the logisticscycleActstarttime.
     * 
     * @return the logisticscycleActstarttime
     */
    public LocalDateTime getLogisticscycleActstarttime() {
        return logisticscycleActstarttime;
    }

    /** 
     * Sets the logisticscycleActstarttime.
     * 
     * @param logisticscycleActstarttime the logisticscycleActstarttime
     */
    public void setLogisticscycleActstarttime(LocalDateTime logisticscycleActstarttime) {
        this.logisticscycleActstarttime = logisticscycleActstarttime;
    }

    /** 
     * Returns the logisticscycleEndtp.
     * 
     * @return the logisticscycleEndtp
     */
    public String getLogisticscycleEndtp() {
        return logisticscycleEndtp;
    }

    /** 
     * Sets the logisticscycleEndtp.
     * 
     * @param logisticscycleEndtp the logisticscycleEndtp
     */
    public void setLogisticscycleEndtp(String logisticscycleEndtp) {
        this.logisticscycleEndtp = logisticscycleEndtp;
    }

    /** 
     * Returns the logisticscycleActendtime.
     * 
     * @return the logisticscycleActendtime
     */
    public LocalDateTime getLogisticscycleActendtime() {
        return logisticscycleActendtime;
    }

    /** 
     * Sets the logisticscycleActendtime.
     * 
     * @param logisticscycleActendtime the logisticscycleActendtime
     */
    public void setLogisticscycleActendtime(LocalDateTime logisticscycleActendtime) {
        this.logisticscycleActendtime = logisticscycleActendtime;
    }

    /** 
     * Returns the logisticscycleCycle.
     * 
     * @return the logisticscycleCycle
     */
    public BigDecimal getLogisticscycleCycle() {
        return logisticscycleCycle;
    }

    /** 
     * Sets the logisticscycleCycle.
     * 
     * @param logisticscycleCycle the logisticscycleCycle
     */
    public void setLogisticscycleCycle(BigDecimal logisticscycleCycle) {
        this.logisticscycleCycle = logisticscycleCycle;
    }

    /** 
     * Returns the logisticscycleStaystandtime.
     * 
     * @return the logisticscycleStaystandtime
     */
    public BigDecimal getLogisticscycleStaystandtime() {
        return logisticscycleStaystandtime;
    }

    /** 
     * Sets the logisticscycleStaystandtime.
     * 
     * @param logisticscycleStaystandtime the logisticscycleStaystandtime
     */
    public void setLogisticscycleStaystandtime(BigDecimal logisticscycleStaystandtime) {
        this.logisticscycleStaystandtime = logisticscycleStaystandtime;
    }

    /** 
     * Returns the logisticscycleStaytime.
     * 
     * @return the logisticscycleStaytime
     */
    public BigDecimal getLogisticscycleStaytime() {
        return logisticscycleStaytime;
    }

    /** 
     * Sets the logisticscycleStaytime.
     * 
     * @param logisticscycleStaytime the logisticscycleStaytime
     */
    public void setLogisticscycleStaytime(BigDecimal logisticscycleStaytime) {
        this.logisticscycleStaytime = logisticscycleStaytime;
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

    /** 
     * Returns the createUser.
     * 
     * @return the createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    /** 
     * Sets the createUser.
     * 
     * @param createUser the createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /** 
     * Returns the updateDate.
     * 
     * @return the updateDate
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    /** 
     * Sets the updateDate.
     * 
     * @param updateDate the updateDate
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    /** 
     * Returns the updateUser.
     * 
     * @return the updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /** 
     * Sets the updateUser.
     * 
     * @param updateUser the updateUser
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
}