package com.lovo.statisticanalysis.service;

import java.util.List;

import com.lovo.statisticanalysis.entity.JournalEntity;



public interface JournalService {
	
	


	  /**
     * 分页
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<JournalEntity> showjournalListPage(int pageNum,int pageSize);
	
    
    /**
     * 返回总条数
     * @return
     */
	int getAllPage(int pageSize);

	
}
