package com.sm.demo.service.impl;

import com.sm.demo.util.Page;
import com.github.pagehelper.PageHelper;
import com.sm.demo.dao.LearnResourceMapper;
import com.sm.demo.domain.LearnResource;
import com.sm.demo.model.LeanQueryLeanListReq;
import com.sm.demo.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LearnServiceImpl extends BaseService<LearnResource> implements LearnService {

    @Autowired
    private LearnResourceMapper learnResourceMapper;

    @Override
    public void deleteBatch(Long[] ids) {
        Arrays.stream(ids).forEach(id->learnResourceMapper.deleteByPrimaryKey(id));
    }

    @Override
    public List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page) {
        PageHelper.startPage(page.getPage(), page.getRows());
        return learnResourceMapper.queryLearnResouceList(page.getCondition());
    }
}
