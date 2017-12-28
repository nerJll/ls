package com.aixu.bean;

import java.util.Date;

/**
 * 瀹㈡埛澶勭悊
 * @date 2017骞�12鏈�17鏃�-涓婂崍8:42:25
 * @since 1.0.0
 * @aixu-lawsuit
 */
public class AixuCustomDo implements java.io.Serializable{

	private static final long serialVersionUID = -2687712245346928076L;

	private String id;

    private String type;

    private String customReduce;

    private Integer customMount;

    private String judgeReduce;

    private Integer judgeMount;

    private Date planDate;

    private String oqcJudge;

    private String oqcResult;

    private String handleState;

    private String baseId;

    private Date createTime;

    private String resOne;

    private String resTwo;

    private String resThree;

    private String resFour;

    private String resFive;

    private String resSix;

    private String resSeven;

    private String resEight;

    private String resNine;

    private String resTen;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCustomReduce() {
        return customReduce;
    }

    public void setCustomReduce(String customReduce) {
        this.customReduce = customReduce == null ? null : customReduce.trim();
    }

    public Integer getCustomMount() {
        return customMount;
    }

    public void setCustomMount(Integer customMount) {
        this.customMount = customMount;
    }

    public String getJudgeReduce() {
        return judgeReduce;
    }

    public void setJudgeReduce(String judgeReduce) {
        this.judgeReduce = judgeReduce == null ? null : judgeReduce.trim();
    }

    public Integer getJudgeMount() {
        return judgeMount;
    }

    public void setJudgeMount(Integer judgeMount) {
        this.judgeMount = judgeMount;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public String getOqcJudge() {
        return oqcJudge;
    }

    public void setOqcJudge(String oqcJudge) {
        this.oqcJudge = oqcJudge == null ? null : oqcJudge.trim();
    }

    public String getOqcResult() {
        return oqcResult;
    }

    public void setOqcResult(String oqcResult) {
        this.oqcResult = oqcResult == null ? null : oqcResult.trim();
    }

    public String getHandleState() {
        return handleState;
    }

    public void setHandleState(String handleState) {
        this.handleState = handleState == null ? null : handleState.trim();
    }

    public String getBaseId() {
        return baseId;
    }

    public void setBaseId(String baseId) {
        this.baseId = baseId == null ? null : baseId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getResFour() {
        return resFour;
    }

    public void setResFour(String resFour) {
        this.resFour = resFour == null ? null : resFour.trim();
    }

    public String getResFive() {
        return resFive;
    }

    public void setResFive(String resFive) {
        this.resFive = resFive == null ? null : resFive.trim();
    }

    public String getResSix() {
        return resSix;
    }

    public void setResSix(String resSix) {
        this.resSix = resSix == null ? null : resSix.trim();
    }

    public String getResSeven() {
        return resSeven;
    }

    public void setResSeven(String resSeven) {
        this.resSeven = resSeven == null ? null : resSeven.trim();
    }

    public String getResEight() {
        return resEight;
    }

    public void setResEight(String resEight) {
        this.resEight = resEight == null ? null : resEight.trim();
    }

    public String getResNine() {
        return resNine;
    }

    public void setResNine(String resNine) {
        this.resNine = resNine == null ? null : resNine.trim();
    }

    public String getResTen() {
        return resTen;
    }

    public void setResTen(String resTen) {
        this.resTen = resTen == null ? null : resTen.trim();
    }

	@Override
	public String toString() {
		return "AixuCustomDo [id=" + id + ", type=" + type + ", customReduce=" + customReduce + ", customMount="
				+ customMount + ", judgeReduce=" + judgeReduce + ", judgeMount=" + judgeMount + ", planDate=" + planDate
				+ ", oqcJudge=" + oqcJudge + ", oqcResult=" + oqcResult + ", handleState=" + handleState + ", baseId="
				+ baseId + ", createTime=" + createTime + ", resOne=" + resOne + ", resTwo=" + resTwo + ", resThree="
				+ resThree + ", resFour=" + resFour + ", resFive=" + resFive + ", resSix=" + resSix + ", resSeven="
				+ resSeven + ", resEight=" + resEight + ", resNine=" + resNine + ", resTen=" + resTen + "]";
	}
}