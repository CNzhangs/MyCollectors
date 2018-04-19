package com.zhangs.collector.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Lob;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Article extends BaseCollector {
    @Lob //对应Blob字段类型
            Serializable body;
    String originUrl;
}
