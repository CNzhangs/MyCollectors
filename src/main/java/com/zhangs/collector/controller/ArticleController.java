package com.zhangs.collector.controller;

import com.zhangs.collector.entities.Article;
import com.zhangs.collector.repository.ArticleRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/article")
public class ArticleController extends BaseController<Article,ArticleRepo>{
    @GetMapping("/get")
    public Article getArticle(long id){
        return new Article();
    }
    @PutMapping("/put")
    public Article putArticle(Article article){
        return  article;
    }
}
