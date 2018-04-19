package com.zhangs.collector.entities;

import javax.persistence.Entity;
import java.util.ArrayList;
@Entity
public class Film extends BaseCollector {
    ArrayList<String> actress;
    String director;
    float score;
    String releaseTime;
}
