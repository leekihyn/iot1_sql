package com.iot1.sql.goods.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iot1.sql.goods.dao.GoodsDAO;
import com.iot1.sql.goods.dto.GoodsInfo;
@Repository
public class GoodsServiceImpl implements GoodsService {
   
   @Autowired 
   private GoodsDAO goodsDao;
   
   @Override
   public List<GoodsInfo> goodsList(GoodsInfo goods) {
         
      return goodsDao.goodsList(goods);
   }

   @Override
   public GoodsInfo selectGoodsInfo(GoodsInfo goods) {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public int goodsInsert(GoodsInfo goods) {
      return goodsDao.goodsInsert(goods);
   }

   @Override
   public int goodsDelete(GoodsInfo goods) {
      return goodsDao.goodsDelete(goods);
   }

   @Override
   public int goodsUpdate(GoodsInfo goods) {
      return goodsDao.goodsUpdate(goods);
   }
   
}