package cn.bdqn.pojo;

import java.util.Date;

/**
 * 报销单记录表
 */
public class Voucher {
    private Integer id;//编号
    private String next_deal_sn;//详细信息外键
    private Integer create_sn;//创建员工编号
    private Date create_time;//创建日期
    private String event;//报销事由
    private String total_account;//报销金额
    private String status;//报销单处理状态
    private Date modify_time;//处理时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNext_deal_sn() {
        return next_deal_sn;
    }

    public void setNext_deal_sn(String next_deal_sn) {
        this.next_deal_sn = next_deal_sn;
    }

    public Integer getCreate_sn() {
        return create_sn;
    }

    public void setCreate_sn(Integer create_sn) {
        this.create_sn = create_sn;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getTotal_account() {
        return total_account;
    }

    public void setTotal_account(String total_account) {
        this.total_account = total_account;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }
}
