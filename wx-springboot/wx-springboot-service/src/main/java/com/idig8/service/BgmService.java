package com.idig8.service;

import java.util.List;

import com.idig8.pojo.Bgm;

public interface BgmService {

	/**
	 * 获取所有的Bgm列表
	 * @return
	 */
	public List<Bgm> queryBgmList();
	
	/**
	 * 通过bgmId获取Bgm对象
	 * @param Id
	 * @return
	 */
	public Bgm queryBgmById(String Id);
}
	
	
