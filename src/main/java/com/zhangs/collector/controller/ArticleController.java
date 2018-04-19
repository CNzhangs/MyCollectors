package com.zhangs.collector.controller;

import com.zhangs.collector.entities.Article;
import com.zhangs.collector.repository.ArticleRepo;
import com.zhangs.collector.response.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/article")
public class ArticleController extends BaseController<Article,ArticleRepo>{
    @GetMapping("/get")
    public Result getArticle(long id){
        return Result.success(repo.getOne(id));
    }
    @PutMapping("/put")
    public Result saveArticle(Article article){
        return  Result.success(repo.save(article));
    }
}
