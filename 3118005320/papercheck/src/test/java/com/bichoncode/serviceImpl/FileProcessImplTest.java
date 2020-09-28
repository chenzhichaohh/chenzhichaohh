package com.bichoncode.serviceImpl;

import com.bichoncode.service.FileProcess;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/24
 */
class FileProcessImplTest {
    static FileProcess fileProcess;

    @BeforeAll
    static void init(){
        fileProcess = new FileProcessImpl();
    }


    @Test
    void testFileRead() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        System.out.println(s);
        assertNotEquals(null, s);
        assertNotEquals("", s);
    }

    @Test
    void testWriteToDisk() throws IOException {
        fileProcess.writeToDisk("D:aaa.txt", "0.85");
    }
}