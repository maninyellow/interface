/**   
 * @Title: ListBranchResponse.java 
 * @Package com.megaeyes.web.response 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author tangjianyang tangjianyang@megaeyes.com   
 * @date 2012-5-3 下午3:07:22 
 * @version V1.0   
 */
package com.megaeyes.web.response;

import java.util.List;

import com.megaeyes.persistence.ibatis.model.Branch;

/**
 * @ClassName: ListBranchResponse
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author tangjianyang tangjianyang@megaeyes.com
 * @date 2012-5-3 下午3:07:22
 * 
 */
public class ListBranchResponse extends BaseResponse {
	private List<Branch> list;
	private String code;

	public List<Branch> getList() {
		return list;
	}

	public void setList(List<Branch> list) {
		this.list = list;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
