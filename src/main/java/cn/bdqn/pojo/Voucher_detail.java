package cn.bdqn.pojo;

/**
 * 报销单详细信息表
 */
public class Voucher_detail {
    private Integer id;//报销单编号
    private Integer main_id;//报销单外键
    private String item;//报销项目
    private Double account;//报销费用
    private String dec;//报销事由

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMain_id() {
        return main_id;
    }

    public void setMain_id(Integer main_id) {
        this.main_id = main_id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }
}
