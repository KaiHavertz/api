/**
  * Copyright 2020 bejson.com 
  */
package com.api.doman.songs;
import java.util.List;

/**
 * Auto-generated: 2020-10-07 0:0:36
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class JsonRootBean {

    private int total;
    private int total_num;
    private String keyword;
    private int cur_num;
    private List<Song_data_list> song_data_list;
    private int cur_page;
    public void setTotal(int total) {
         this.total = total;
     }
     public int getTotal() {
         return total;
     }

    public void setTotal_num(int total_num) {
         this.total_num = total_num;
     }
     public int getTotal_num() {
         return total_num;
     }

    public void setKeyword(String keyword) {
         this.keyword = keyword;
     }
     public String getKeyword() {
         return keyword;
     }

    public void setCur_num(int cur_num) {
         this.cur_num = cur_num;
     }
     public int getCur_num() {
         return cur_num;
     }

    public void setSong_data_list(List<Song_data_list> song_data_list) {
         this.song_data_list = song_data_list;
     }
     public List<Song_data_list> getSong_data_list() {
         return song_data_list;
     }

    public void setCur_page(int cur_page) {
         this.cur_page = cur_page;
     }
     public int getCur_page() {
         return cur_page;
     }

}