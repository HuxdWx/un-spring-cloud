package org.huxd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.huxd.domain.Account;
import org.huxd.mapper.AccountMapper;
import org.huxd.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @author Huxd
 * @version 1.0
 * @description: TODO
 * @date 2022/1/10 14:01
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {
}
