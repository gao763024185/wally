package com.spb.wally.domain.entity;

import lombok.Data;

/**
 * @description
 * @author: gaobh
 * @date: 2017/12/12 19:15
 * @version: v1.0
 */
@Data
public class BookDO {

    private Long id;

    private String reader;

    private String isbn;

    private String title;

    private String author;

    private String description;

}
