package com.emopicture.service;

import java.util.List;

import com.emopicture.domain.Criteria;

public interface BoardService<V, K> {

   
   public List<V> listAll() throws Exception;

   public void create(V vo)throws Exception;
   
   public V read(K key)throws Exception;
   
   public void delete(K key)throws Exception;
   
   public void update(V vo)throws Exception;
    
   public List<V> listpage(int page) throws Exception;
   
   public void viewcnt(K key)throws Exception;

   public int totalcount() throws Exception;

   public List<V> search(Criteria cri) throws Exception;
   
   
   public void attyn(K key)throws Exception;
   public void regist(V vo)throws Exception;
  
   
}