package com.bichoncode.service;

import java.util.List;

/**
 * 分词处理器
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/22
 */
public interface DivisionProcess {
    /**
     * 使用ik分词器分词
     * 将原文本分词，转化成集合
     * @param text
     * @return
     */
    List<String> ikDivideStrategy(String text);
}
