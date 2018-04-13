package com.sm.demo.controller;

import com.github.pagehelper.PageInfo;
import com.sm.demo.domain.LearnResource;
import com.sm.demo.model.LeanQueryLeanListReq;
import com.sm.demo.service.LearnService;
import com.sm.demo.util.AjaxObject;
import com.sm.demo.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/learn")
public class LearnController extends AbstractController {
    @Autowired
    private LearnService learnService;

    /**
     * 查询教程列表
     * @param page
     * @return
     */
    @RequestMapping(value = "/queryLeanList",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public AjaxObject queryLearnList(Page<LeanQueryLeanListReq> page){
        List<LearnResource> learnList=learnService.queryLearnResouceList(page);
        PageInfo<LearnResource> pageInfo =new PageInfo<LearnResource>(learnList);
        return AjaxObject.ok().put("page", pageInfo);
    }
}
