package com.aixu.bean;

/**
 * 损坏情况实体类
 * @date 2017年12月13日-下午2:16:39
 * @since 1.0.0
 * @generatorSqlmapCustom
 */
public class AixuBadReason implements java.io.Serializable{
	
	private static final long serialVersionUID = -2475029771194407850L;

	private Integer id;

    private String desc; // 损坏描述

    private Integer parentid; // 父ID

    private String resOne;

    private String resTwo;

    private String resThree;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getResOne() {
        return resOne;
    }

    public void setResOne(String resOne) {
        this.resOne = resOne == null ? null : resOne.trim();
    }

    public String getResTwo() {
        return resTwo;
    }

    public void setResTwo(String resTwo) {
        this.resTwo = resTwo == null ? null : resTwo.trim();
    }

    public String getResThree() {
        return resThree;
    }

    public void setResThree(String resThree) {
        this.resThree = resThree == null ? null : resThree.trim();
    }

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\",\"desc\":\"" + desc + "\",\"parentid\":\"" + parentid + "\",\"resOne\":\""
				+ resOne + "\",\"resTwo\":\"" + resTwo + "\",\"resThree\":\"" + resThree + "\"}";
	}

	public AixuBadReason(Integer id, String desc, Integer parentid, String resOne, String resTwo, String resThree) {
		this.id = id;
		this.desc = desc;
		this.parentid = parentid;
		this.resOne = resOne;
		this.resTwo = resTwo;
		this.resThree = resThree;
	}

	public AixuBadReason() {
	}
    
}