package cn.bdqn.pojo;

import java.util.Date;

/**
 * 报销单审核结果实体类
 */
public class Result {
    private Integer id;//审核编号
    private Integer claim_id;//报销单外键编号
    private Date check_time;//审核时间
    private Integer checker_sn;//审核员工编号
    private String result;//审核结果
    private String comm;//审核意见

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClaim_id() {
        return claim_id;
    }

    public void setClaim_id(Integer claim_id) {
        this.claim_id = claim_id;
    }

    public Date getCheck_time() {
        return check_time;
    }

    public void setCheck_time(Date check_time) {
        this.check_time = check_time;
    }

    public Integer getChecker_sn() {
        return checker_sn;
    }

    public void setChecker_sn(Integer checker_sn) {
        this.checker_sn = checker_sn;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }
}
