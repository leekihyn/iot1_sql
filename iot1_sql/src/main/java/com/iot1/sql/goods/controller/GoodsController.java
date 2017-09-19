package com.iot1.sql.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iot1.sql.goods.dto.GoodsInfo;
import com.iot1.sql.goods.service.GoodsService;

@Controller
public class GoodsController {
   
   @Autowired
   private GoodsService gs;
   
   
   @RequestMapping(value="/goods/list", method=RequestMethod.POST)
   public @ResponseBody List<GoodsInfo> goodsList(GoodsInfo goods) {
      
      return gs.goodsList(goods);
   }

   @RequestMapping(value="/goods/create", method=RequestMethod.POST)
   public @ResponseBody List<GoodsInfo> saveGoodsInfoList(@RequestBody GoodsInfo[] goodsList) { 
      
      int result = 0;
      for (final GoodsInfo gi : goodsList){
         result = gs.goodsInsert(gi);
      }
      
      return gs.goodsList(null);
   }
   @RequestMapping(value="/goods/delete", method=RequestMethod.POST)
   public @ResponseBody List<GoodsInfo> goodsDelete(@RequestBody GoodsInfo[] goodsList) { 
      
      int result = 0;
      for (final GoodsInfo gi : goodsList){
         result = gs.goodsDelete(gi);
      }
      
      return gs.goodsList(null); 
   }
   @RequestMapping(value="/goods/update", method=RequestMethod.POST)
   public @ResponseBody List<GoodsInfo> goodsUpdate(@RequestBody GoodsInfo[] goodsList) { 
      
      int result = 0;
      for (final GoodsInfo gi : goodsList){
         result = gs.goodsUpdate(gi);
      }
      
      return gs.goodsList(null);
   }
}