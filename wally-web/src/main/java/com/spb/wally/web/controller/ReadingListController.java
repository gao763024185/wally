package com.spb.wally.web.controller;

import com.spb.wally.domain.entity.BookDO;
import com.spb.wally.service.ReadingListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @description 读书列表相关的controller类
 * @author: gaobh
 * @date: 2017/12/12 19:57
 * @version: v1.0
 */
@Controller
@RequestMapping("/readingList")
public class ReadingListController {

    private ReadingListService readingListService;

    /**
     * 用构造函数来注入
     * @param readingListService
     */
    @Autowired
    private ReadingListController(ReadingListService readingListService){
        this.readingListService = readingListService;
    }

    /**
     * 根据读者姓名获取读书列表
     *
     * @param reader
     * @param model
     * @return
     */
    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model) {

        List<BookDO> readingList = readingListService.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }
}
