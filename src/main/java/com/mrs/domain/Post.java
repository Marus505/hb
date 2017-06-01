package com.mrs.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by marus505 on 2017. 6. 1..
 */
@Data
public class Post {

    private long    id;
    private String  title;
    private String  content;
    private Date    created_at;
    private Date    updated_at;

}
