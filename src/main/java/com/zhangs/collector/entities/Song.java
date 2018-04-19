package com.zhangs.collector.entities;

import javax.persistence.Entity;

@Entity
public class Song extends BaseCollector {
    String singer;
    String songWriter;
    String Composer;
    String mvUrl;
    String originUrl;
}
