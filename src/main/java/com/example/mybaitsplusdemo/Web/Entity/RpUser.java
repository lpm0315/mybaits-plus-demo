package com.example.mybaitsplusdemo.Web.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liupm
 * @since 2022-02-21
 */
@TableName("RP_USER")
public class RpUser implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId("ID")
    private String id;

    @TableField("NAME")
    private String name;

    @TableField("PASSWORD")
    private String password;

    @TableField("LOGINNAME")
    private String loginname;

    @TableField("USERGROUPS")
    private String usergroups;

    @TableField("STATUS")
    private Integer status;

    @TableField("ZSJGDM")
    private String zsjgdm;

    @TableField("DYQSD")
    private String dyqsd;

    @TableField("USERGROUPS2")
    private String usergroups2;

    @TableField("AUTOINDEX")
    private String autoindex;

    @TableField("DISTRICTID")
    private String districtid;

    @TableField("CODE")
    private String code;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getUsergroups() {
        return usergroups;
    }

    public void setUsergroups(String usergroups) {
        this.usergroups = usergroups;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getZsjgdm() {
        return zsjgdm;
    }

    public void setZsjgdm(String zsjgdm) {
        this.zsjgdm = zsjgdm;
    }

    public String getDyqsd() {
        return dyqsd;
    }

    public void setDyqsd(String dyqsd) {
        this.dyqsd = dyqsd;
    }

    public String getUsergroups2() {
        return usergroups2;
    }

    public void setUsergroups2(String usergroups2) {
        this.usergroups2 = usergroups2;
    }

    public String getAutoindex() {
        return autoindex;
    }

    public void setAutoindex(String autoindex) {
        this.autoindex = autoindex;
    }

    public String getDistrictid() {
        return districtid;
    }

    public void setDistrictid(String districtid) {
        this.districtid = districtid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "RpUser{" +
        "id=" + id +
        ", name=" + name +
        ", password=" + password +
        ", loginname=" + loginname +
        ", usergroups=" + usergroups +
        ", status=" + status +
        ", zsjgdm=" + zsjgdm +
        ", dyqsd=" + dyqsd +
        ", usergroups2=" + usergroups2 +
        ", autoindex=" + autoindex +
        ", districtid=" + districtid +
        ", code=" + code +
        "}";
    }
}
