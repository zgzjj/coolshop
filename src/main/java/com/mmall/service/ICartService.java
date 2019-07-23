package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.vo.CartVo;

public interface ICartService {
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);

    ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);

    ServerResponse<CartVo> delete(Integer userId,String productIds);

    ServerResponse<CartVo> List(Integer userId);

    ServerResponse<CartVo> selectOrUnselect(Integer userId,Integer checked,Integer productId);

    ServerResponse<Integer> getCartProductCount(Integer userId);
}
