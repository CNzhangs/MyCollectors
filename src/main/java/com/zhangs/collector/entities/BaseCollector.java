package com.zhangs.collector.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass

public abstract class BaseCollector extends BaseEntity {
    Long authorId;
    String title;
    Type type;
    String createTime;
    String url;
    @Column(name = "`desc`")
    String desc;
    Integer likeCount;
    Integer unlikeCount;
}
