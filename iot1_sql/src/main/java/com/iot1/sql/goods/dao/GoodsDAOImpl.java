package com.iot1.sql.goods.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.iot1.sql.goods.dto.GoodsInfo;

@Repository
public class GoodsDAOImpl extends SqlSessionDaoSupport implements GoodsDAO{

   @Override  
   public GoodsInfo selectGoodsInfo(GoodsInfo goods) {
      return this.getSqlSession().selectOne("goods.SELECT_GOODS",goods);
   }
   
   @Override
   public List<GoodsInfo> goodsList(GoodsInfo goods) { 
      return this.getSqlSession().selectList("goods.SELECT_GOODS",goods);
   }

   @Override
   public int goodsInsert(GoodsInfo goods) {
      return this.getSqlSession().insert("goods.INSERT_GOODS",goods);

   }

   @Override
   public int goodsDelete(GoodsInfo goods) { 
      return this.getSqlSession().delete("goods.DELETE_GOODS",goods);

   }

   @Override
   public int goodsUpdate(GoodsInfo goods) {
      return this.getSqlSession().update("goods.UPDATE_GOODS",goods);

   }

}