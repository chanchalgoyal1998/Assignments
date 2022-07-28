package com.springorm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class BillItemDao {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public int getSellingItemById(int itemId)
    {
    	String sql="select count(itemid)+qty as qty from billitem where itemid='"+itemId+"'";
    	Integer sellingItemById=jdbcTemplate.queryForObject(sql,Integer.class);
    	if(sellingItemById==null)
    		return 0;
    	else
    	return sellingItemById;
    }
}
