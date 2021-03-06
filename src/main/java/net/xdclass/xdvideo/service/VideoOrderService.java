package net.xdclass.xdvideo.service;

import net.xdclass.xdvideo.domain.Video;
import net.xdclass.xdvideo.domain.VideoOrder;
import net.xdclass.xdvideo.dto.VideoOrderDto;

/**
 * For:订单交易service类
 *
 * @Author: gemini
 * @Date: 2020/4/17 14:06
 * 有内鬼，中止交易
 */
public interface VideoOrderService {

    String save(VideoOrderDto videoOrderDto) throws Exception;

    /**
     * 根据商户号查找订单
     * @param outTradeNo
     * @return
     */
    VideoOrder findByOutTradeNo(String outTradeNo);

    /**
     * 微信回调之后更新订单的一些相关字段
     * @param videoOrder
     * @return
     */
    Integer updateVideoOrderByOutTradeNo(VideoOrder videoOrder);


}
