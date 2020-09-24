package com.bichoncode.service;

import java.io.IOException;

/**
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/22
 */
public interface PaperCheckProcess {

    /**
     * 余弦算法比较两篇文章的相似性
     * @param article1
     * @param article2
     * @return
     */
    double cosineSimirity(String article1, String article2) throws IOException;

    /**
     * 使用lcs算法计算最长子串的长度，并返回长度
     * @param article1
     * @param article2
     * @return
     */
    double lcs(String article1, String article2) throws IOException;

    /**
     * 综合余弦算法和lcs算法
     * @param article1
     * @param article2
     * @return
     */
    double getSimilarity(String article1, String article2) throws IOException;
}
