package com.quikr.proj.model;
import javax.persistence.*;
import java.util.Date;


//    Id Title
//    Content
//    cityName
//    stateName
//    Status
//    adStyle
//    adActionType
//    ad_locality
//    createdTime
//    categoryName
//    imageDetails
//    image_count
//    metaCategoryName
//    user_name
//    user_mobile


@Entity
@Table(name = "products")
public class Products{
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="content")
    private String Content;
    @Column(name="cityname")
    private String  cityName;
    @Column(name="statename")
    private String stateName;
    @Column(name="status")
    private Boolean Status;
    @Column(name="adstyle")
    private Integer adStyle;
    @Column(name="adactiontype")
    private Integer adActionType;
    @Column(name="adlocality")
    private String ad_locality;
    @Column(name="createtime")
    private String  createTime;
    @Column(name="categoryname")
    private String categoryName;
    @Column(name="imagedetails")
    private String imageDetails;
    @Column(name="imagecount")
    private Integer image_count;
    @Column(name="metacategoryname")
    private String metaCategoryName;
    @Column(name="username")
    private String user_name;
    @Column(name="usermobile")
    private String user_mobile;


    public Products() {
    }


//auto generated
    public Products(Integer id, String content, String cityName, String stateName, Boolean status, Integer adStyle, Integer adActionType, String ad_locality, String createTime, String categoryName, String imageDetails, Integer image_count, String metaCategoryName, String user_name, String user_mobile) {
        this.id = id;
        Content = content;
        this.cityName = cityName;
        this.stateName = stateName;
        Status = status;
        this.adStyle = adStyle;
        this.adActionType = adActionType;
        this.ad_locality = ad_locality;
        this.createTime = createTime;
        this.categoryName = categoryName;
        this.imageDetails = imageDetails;
        this.image_count = image_count;
        this.metaCategoryName = metaCategoryName;
        this.user_name = user_name;
        this.user_mobile = user_mobile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    public Integer getAdStyle() {
        return adStyle;
    }

    public void setAdStyle(Integer adStyle) {
        this.adStyle = adStyle;
    }

    public Integer getAdActionType() {
        return adActionType;
    }

    public void setAdActionType(Integer adActionType) {
        this.adActionType = adActionType;
    }

    public String getAd_locality() {
        return ad_locality;
    }

    public void setAd_locality(String ad_locality) {
        this.ad_locality = ad_locality;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getImageDetails() {
        return imageDetails;
    }

    public void setImageDetails(String imageDetails) {
        this.imageDetails = imageDetails;
    }

    public Integer getImage_count() {
        return image_count;
    }

    public void setImage_count(Integer image_count) {
        this.image_count = image_count;
    }

    public String getMetaCategoryName() {
        return metaCategoryName;
    }

    public void setMetaCategoryName(String metaCategoryName) {
        this.metaCategoryName = metaCategoryName;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_mobile() {
        return user_mobile;
    }

    public void setUser_mobile(String user_mobile) {
        this.user_mobile = user_mobile;
    }
}


///testing testing

//@Entity
//@Table(name = "products")
//public
//class Products {
//    @Id
//    @Column(name = "id")
//    private Integer id;
//    @Column(name = "content")
//    private String Content;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getContent() {
//        return Content;
//    }
//
//    public void setContent(String content) {
//        Content = content;
//    }
//}