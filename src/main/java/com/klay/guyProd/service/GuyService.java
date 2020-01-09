package com.klay.guyProd.service;

import com.klay.guyProd.entity.Guy;

import java.util.List;

public interface GuyService {
      public  void  saveGuy(Guy guy);

      public List<Guy> findAll();

      public void addTow();

      public Guy findById(String id);

      public Guy findByName(String name);

      public void saveGuyMybatis(Guy guy);

      public String getPort();
}
