package com.bichoncode.service;

import java.io.IOException;
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
     * 将原文本分词，分词之存储在集合中
     * @param text
     * @return
     */
    List<String> ikDivideStrategy(String text) throws IOException;
}
