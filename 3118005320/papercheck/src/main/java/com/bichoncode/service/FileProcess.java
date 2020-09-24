package com.bichoncode.service;

import java.io.IOException;

/**
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/22
 */
public interface FileProcess {

    /**
     * 输入txt文件的绝对路经（包括文件名）
     * 返回String类型
     * @param fileName
     * @return
     */
    String txtToString(String fileName);

    void writeToDisk(String fileName, String content) throws IOException;

}
