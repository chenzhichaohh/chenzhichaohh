package com.bichoncode.serviceImpl;

import com.bichoncode.service.FileProcess;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/24
 */
class FileProcessImplTest {


    @Test
    void testFileRead() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        String s = fileProcess.txtToString("F:test/orig.txt");
        System.out.println(s);
    }

    @Test
    void testWriteToDisk() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        fileProcess.writeToDisk("D:aaa.txt", "0.85");
    }
}