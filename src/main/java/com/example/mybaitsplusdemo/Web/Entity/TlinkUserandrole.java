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
@TableName("TLINK_USERANDROLE")
public class TlinkUserandrole implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户ID
     */
    @TableId("USERID")
    private String userid;

    /**
     * 角色ID
     */
    @TableField("ROLEID")
    private String roleid;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "TlinkUserandrole{" +
        "userid=" + userid +
        ", roleid=" + roleid +
        "}";
    }
}
