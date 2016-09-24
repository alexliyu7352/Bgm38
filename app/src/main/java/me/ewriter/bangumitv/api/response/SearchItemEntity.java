package me.ewriter.bangumitv.api.response;

/**
 * Created by Zubin on 2016/9/22.
 * 搜索条目的实体
 */

public class SearchItemEntity {

    /** 链接地址*/
    private String linkUrl;
    /** icon 地址*/
    private String imageUrl;
    /** 自行拼接的 cover 封面图片地址，可能无效*/
    private String coverImageUrl;
    /** 中文名 */
    private String normalName;
    /** 日文名 */
    private String smallName;
    /** 年代等介绍 */
    private String info;
    /** 平均分，不一定有 */
    private String rateNumber;
    /** 评分人数，不一定有 */
    private String rateTotal;

    /** 排名， 不一定有*/
    private String rank;

    /** 返回的数据类型，是漫画还是游戏*/
    private String type;

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public String getNormalName() {
        return normalName;
    }

    public void setNormalName(String normalName) {
        this.normalName = normalName;
    }

    public String getSmallName() {
        return smallName;
    }

    public void setSmallName(String smallName) {
        this.smallName = smallName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getRateNumber() {
        return rateNumber;
    }

    public void setRateNumber(String rateNumber) {
        this.rateNumber = rateNumber;
    }

    public String getRateTotal() {
        return rateTotal;
    }

    public void setRateTotal(String rateTotal) {
        this.rateTotal = rateTotal;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
