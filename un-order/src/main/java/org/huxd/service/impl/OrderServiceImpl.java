package org.huxd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.huxd.domain.Order;
import org.huxd.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import org.huxd.service.OrderService;

/**
 * @author Huxd
 * @version 1.0
 * @description: TODO
 * @date 2022/1/10 14:01
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
}
