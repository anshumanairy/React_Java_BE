package com.quikr.proj.model;
import javax.persistence.*;
import java.util.Date;


//
//Id
//        Title
//        Content(description)
//        city_name
//        category_id
//        city_id
//        state_id
//        state_name
//        status
//        category_name
//        created_time
//        image
//        user_id
@Entity
@Table
public class product {
    @Id
    @Column
    private Long id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private int category_id;
    @Column
    private int city_id;
    @Column
    private int state_id;
    @Column
    private int status;
    @Column
    private String state_name;
    @Column
    private String category_name;
    @Column
    private Date created_time;
    @Column
    private String image;
    @Column
    private String user_id;
}
