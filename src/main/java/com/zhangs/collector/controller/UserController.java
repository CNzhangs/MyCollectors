package com.zhangs.collector.controller;

import com.zhangs.collector.common.LogUtils;
import com.zhangs.collector.entities.User;
import com.zhangs.collector.repository.UserRepo;
import com.zhangs.collector.response.Result;
import com.zhangs.collector.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController()
@RequestMapping("/user")
public class UserController extends BaseController<User, UserRepo> {
    @Autowired
    UserServiceImpl userService;

    @PostMapping("/{id}")
    public Result updateUser(@PathVariable("id") Long id, @Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return Result.fail(bindingResult.getFieldError().getDefaultMessage());
        }
        user.setId(id);
        userService.update(user);
        return Result.success(repo.save(user));
    }

    @GetMapping("/{id}")
    public Result get(@PathVariable("id") long id) {
        if (!repo.existsById(id)){
            return Result.fail("用户不存在");
        }
        return Result.success(repo.getOne(id));
    }

    @PutMapping("/")
    public Result save(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return Result.fail(bindingResult.getFieldError().getDefaultMessage());
        }
        userService.register(user);
        return Result.success(repo.save(user));
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Long id){

        if (!repo.existsById(id)){
            LogUtils.e("user doesn't exist.");
            return Result.fail("用户不存在");
        }
        User user = repo.getOne(id);
        userService.delete(user);
        repo.delete(user);
        return Result.success(user);
    }
}
