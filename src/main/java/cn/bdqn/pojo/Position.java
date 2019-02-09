package cn.bdqn.pojo;

/**
 * 角色实体类
 */
public class Position {
    private Integer id;//部门编号
    private String name_cn;//部门中文名称
    private String name_en;//部门英文名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_cn() {
        return name_cn;
    }

    public void setName_cn(String name_cn) {
        this.name_cn = name_cn;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }
}
