package com.bichoncode.service;

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
    double cosineSimirity(String article1, String article2);

    double lcs(String article1, String article2);

    double getSimilarity(String article1, String article2);
}
