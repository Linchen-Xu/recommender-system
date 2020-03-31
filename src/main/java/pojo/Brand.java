package pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Brand {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librecmall_brand.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librecmall_brand.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librecmall_brand.desc
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librecmall_brand.pic_url
     *
     * @mbggenerated
     */
    private String picUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librecmall_brand.sort_order
     *
     * @mbggenerated
     */
    private Byte sortOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librecmall_brand.floor_price
     *
     * @mbggenerated
     */
    private BigDecimal floorPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librecmall_brand.add_time
     *
     * @mbggenerated
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librecmall_brand.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column librecmall_brand.deleted
     *
     * @mbggenerated
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librecmall_brand.id
     *
     * @return the value of librecmall_brand.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librecmall_brand.id
     *
     * @param id the value for librecmall_brand.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librecmall_brand.name
     *
     * @return the value of librecmall_brand.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librecmall_brand.name
     *
     * @param name the value for librecmall_brand.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librecmall_brand.desc
     *
     * @return the value of librecmall_brand.desc
     *
     * @mbggenerated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librecmall_brand.desc
     *
     * @param desc the value for librecmall_brand.desc
     *
     * @mbggenerated
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librecmall_brand.pic_url
     *
     * @return the value of librecmall_brand.pic_url
     *
     * @mbggenerated
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librecmall_brand.pic_url
     *
     * @param picUrl the value for librecmall_brand.pic_url
     *
     * @mbggenerated
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librecmall_brand.sort_order
     *
     * @return the value of librecmall_brand.sort_order
     *
     * @mbggenerated
     */
    public Byte getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librecmall_brand.sort_order
     *
     * @param sortOrder the value for librecmall_brand.sort_order
     *
     * @mbggenerated
     */
    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librecmall_brand.floor_price
     *
     * @return the value of librecmall_brand.floor_price
     *
     * @mbggenerated
     */
    public BigDecimal getFloorPrice() {
        return floorPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librecmall_brand.floor_price
     *
     * @param floorPrice the value for librecmall_brand.floor_price
     *
     * @mbggenerated
     */
    public void setFloorPrice(BigDecimal floorPrice) {
        this.floorPrice = floorPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librecmall_brand.add_time
     *
     * @return the value of librecmall_brand.add_time
     *
     * @mbggenerated
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librecmall_brand.add_time
     *
     * @param addTime the value for librecmall_brand.add_time
     *
     * @mbggenerated
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librecmall_brand.update_time
     *
     * @return the value of librecmall_brand.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librecmall_brand.update_time
     *
     * @param updateTime the value for librecmall_brand.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column librecmall_brand.deleted
     *
     * @return the value of librecmall_brand.deleted
     *
     * @mbggenerated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column librecmall_brand.deleted
     *
     * @param deleted the value for librecmall_brand.deleted
     *
     * @mbggenerated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}