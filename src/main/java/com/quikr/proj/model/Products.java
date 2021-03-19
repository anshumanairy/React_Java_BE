package com.quikr.proj.model;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


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


//@Entity
//@Table(name = "products")
//public class Products<Private> {
//    @Id
//    @Column(name="id")
//    private Integer id;
//    @Column(name="title")
//    private String title;
//    @Column(name="content")
//    private String Content;
//    @Column(name="cityname")
//    private String  cityName;
//    @Column(name="statename")
//    private String stateName;
//    @Column(name="status")
//    private Boolean Status;
//    @Column(name="adstyle")
//    private String adStyle;
//    @Column(name="adactiontype")
//    private Integer adActionType;
//    @Column(name="adlocality")
//    private String ad_locality;
//    @Column(name="createtime")
//    private String  createTime;
//    @Column(name="categoryname")
//    private String categoryName;
//    @Column(name="imagedetails")
//    private List<String> imageDetails;
//    @Column(name="imagecount")
//    private Integer image_count;
//    @Column(name=images)
//    private List<String> images;
//    @Column(name="metacategoryname")
//    private String metaCategoryName;
//    @Column(name="username")
//    private String user_name;
//    @Column(name="usermobile")
//    private String user_mobile;
//    @Column(name="attributes")
//    private List<String>  attributes;
//
//
//
//
//}

//Image_url
//        Id  number
//        Price  number
//        Title string
//
//        Location
//        Verified bool

@Entity
@Table(name = "products")
public class Products{
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "price")
    private Integer price;
    @Column(name = "title")
    private String title;
    @Column(name = "location")
    private String location;
    @Column(name = "verified")
    private Boolean verified;

    public Products(Integer id, Integer price, String title, String location, Boolean verified) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.location = location;
        this.verified = verified;
    }

    public Products() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
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