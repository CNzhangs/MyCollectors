package com.zhangs.collector.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Type extends BaseEntity {

    public  enum CollectorType {
        ARTICLE,
        FILM,
        SONG
    }
    int mainType;
    int childType;
    @Enumerated(EnumType.STRING)
    CollectorType typeStr;
}
