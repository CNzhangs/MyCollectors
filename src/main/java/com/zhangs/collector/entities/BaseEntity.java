package com.zhangs.collector.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.lang.Nullable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue()
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
