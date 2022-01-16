package org.huxd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.huxd.domain.Order;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
