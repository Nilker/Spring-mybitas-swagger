package com.sm.demo.service;


import com.sm.demo.domain.LearnResource;
import com.sm.demo.model.LeanQueryLeanListReq;
import com.sm.demo.util.Page;

import java.util.List;

public interface LearnService extends IService<LearnResource> {
    public List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page);
    public void deleteBatch(Long[] ids);
}
