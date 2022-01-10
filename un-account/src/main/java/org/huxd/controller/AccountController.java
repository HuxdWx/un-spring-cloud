package org.huxd.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.huxd.domain.Account;
import org.huxd.service.AccountService;
import org.huxd.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Huxd
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 16:21
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping(value = "/list")
    public Result<?> queryPageList(){
        Page<Account> page = new Page<Account>(1, 10);
        IPage<Account> pageList = accountService.page(page);
        return Result.OK(pageList);
    }
}
