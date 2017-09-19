package com.iot1.sql.goods.dao;

import java.util.List;
import java.util.Map;

import com.iot1.sql.goods.dto.GoodsInfo;

public interface GoodsDAO {
   
   public GoodsInfo selectGoodsInfo(GoodsInfo goods);
   public List<GoodsInfo> goodsList(GoodsInfo goods);
   public int goodsInsert(GoodsInfo goods);
   public int goodsDelete(GoodsInfo goods);
   public int goodsUpdate(GoodsInfo goods);
} 