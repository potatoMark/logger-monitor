package com.numi.io.common.entities;


import javax.persistence.*;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 
 */
@Entity
@Table(name = "otd_phase_node_tp_component")
public class OtdPhaseNodeTpComponent implements Serializable {

    /** otd阶段代码 */

    @Column(name = "cyclephase_code")
    String cyclephasecode;

    /** otd节点代码 */
    @Column(name = "cyclenode_code")
    String cyclenodecode;

    /** 节点类型 */
    @Column(name = "cyclephasenode_type")
    String cyclephasenodetype;

    /** tp编码 */
    @Id
    @Column(name = "tp_code")
    String tpcode;

    /** 
     * Returns the cyclephasecode.
     * 
     * @return the cyclephasecode
     */
    public String getCyclephasecode() {
        return cyclephasecode;
    }

    /** 
     * Sets the cyclephasecode.
     * 
     * @param cyclephasecode the cyclephasecode
     */
    public void setCyclephasecode(String cyclephasecode) {
        this.cyclephasecode = cyclephasecode;
    }

    /** 
     * Returns the cyclenodecode.
     * 
     * @return the cyclenodecode
     */
    public String getCyclenodecode() {
        return cyclenodecode;
    }

    /** 
     * Sets the cyclenodecode.
     * 
     * @param cyclenodecode the cyclenodecode
     */
    public void setCyclenodecode(String cyclenodecode) {
        this.cyclenodecode = cyclenodecode;
    }

    /** 
     * Returns the cyclephasenodetype.
     * 
     * @return the cyclephasenodetype
     */
    public String getCyclephasenodetype() {
        return cyclephasenodetype;
    }

    /** 
     * Sets the cyclephasenodetype.
     * 
     * @param cyclephasenodetype the cyclephasenodetype
     */
    public void setCyclephasenodetype(String cyclephasenodetype) {
        this.cyclephasenodetype = cyclephasenodetype;
    }

    /** 
     * Returns the tpcode.
     * 
     * @return the tpcode
     */
    public String getTpcode() {
        return tpcode;
    }

    /** 
     * Sets the tpcode.
     * 
     * @param tpcode the tpcode
     */
    public void setTpcode(String tpcode) {
        this.tpcode = tpcode;
    }
}