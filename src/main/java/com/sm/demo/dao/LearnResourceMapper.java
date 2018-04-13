package com.sm.demo.dao;

import com.sm.demo.domain.LearnResource;
import com.sm.demo.model.LeanQueryLeanListReq;
import com.sm.demo.util.MyMapper;
import com.sm.demo.util.Page;

import java.util.List;
import java.util.Map;

public interface LearnResourceMapper extends MyMapper<LearnResource> {
    List<LearnResource> queryLearnResouceList(Map<String,Object> map);
}