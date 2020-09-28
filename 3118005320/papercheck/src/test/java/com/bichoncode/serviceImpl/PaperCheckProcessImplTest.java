package com.bichoncode.serviceImpl;

import com.bichoncode.service.DivisionProcess;
import com.bichoncode.service.FileProcess;
import com.bichoncode.service.PaperCheckProcess;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/24
 */
class PaperCheckProcessImplTest {

    static FileProcess fileProcess;
    static DivisionProcess divisionProcess;
    static PaperCheckProcess paperCheckProcess;

    @BeforeAll
    static void init() {
        fileProcess = new FileProcessImpl();
        divisionProcess = new DivisionProcessImpl();
        paperCheckProcess = new PaperCheckProcessImpl();
    }

    @Test
    @Timeout(5)
    void testAll() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        String s1 = fileProcess.txtToString("F:test/orig_0.8_add.txt");
        String s2 = fileProcess.txtToString("F:test/orig_0.8_del.txt");
        String s3 = fileProcess.txtToString("F:test/orig_0.8_dis_1.txt");
        String s4 = fileProcess.txtToString("F:test/orig_0.8_dis_10.txt");
        String s5 = fileProcess.txtToString("F:test/orig_0.8_dis_15.txt");
        double simirity1 = paperCheckProcess.getSimilarity(s, s1);
        double simirity2 = paperCheckProcess.getSimilarity(s, s2);
        double simirity3 = paperCheckProcess.getSimilarity(s, s3);
        double simirity4 = paperCheckProcess.getSimilarity(s, s4);
        double simirity5 = paperCheckProcess.getSimilarity(s, s5);
        System.out.println("文章1相似度为:" + simirity1);
        System.out.println("文章2相似度为:" + simirity2);
        System.out.println("文章3相似度为:" + simirity3);
        System.out.println("文章4相似度为:" + simirity4);
        System.out.println("文章5相似度为:" + simirity5);
    }



    @Test
    void testCosAdd() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        String s2 = fileProcess.txtToString("F:test/orig_0.8_add.txt");
        double simirity = paperCheckProcess.cosineSimirity(s, s2);
        assertNotEquals(simirity, 1);
        assertNotEquals(simirity, 0);
        System.out.println("相似度为：" + simirity);
    }

    @Test
    void testCosDel() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        String s2 = fileProcess.txtToString("F:test/orig_0.8_del.txt");
        double simirity = paperCheckProcess.cosineSimirity(s, s2);
        assertNotEquals(simirity, 1);
        assertNotEquals(simirity, 0);
        System.out.println("相似度为：" + simirity);

    }

    @Test
    void testLcsAdd() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        String s2 = fileProcess.txtToString("F:test/orig_0.8_add.txt");
        double simirity = paperCheckProcess.lcs(s, s2);
        assertNotEquals(simirity, 1);
        assertNotEquals(simirity, 0);
        System.out.println("相似度为：" + simirity);
    }

    @Test
    void testlcsDel() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        String s2 = fileProcess.txtToString("F:test/orig_0.8_del.txt");
        double simirity = paperCheckProcess.lcs(s, s2);
        assertNotEquals(simirity, 1);
        assertNotEquals(simirity, 0);
        System.out.println("相似度为：" + simirity);
    }

    @Test
    void testlcsDel1() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        String s2 = fileProcess.txtToString("F:test/orig_0.8_dis_1.txt");
        double simirity = paperCheckProcess.lcs(s, s2);
        assertNotEquals(simirity, 1);
        assertNotEquals(simirity, 0);
        System.out.println("相似度为：" + simirity);
    }

    @Test
    void testLcsDis() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        String s2 = fileProcess.txtToString("F:test/orig_0.8_dis_15.txt");
        double simirity = paperCheckProcess.lcs(s, s2);
        assertNotEquals(simirity, 1);
        assertNotEquals(simirity, 0);
        System.out.println("相似度为：" + simirity);

    }

    @Test
    void testSimilarity() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        String s2 = fileProcess.txtToString("F:test/orig_0.8_add.txt");
        double simirity = paperCheckProcess.getSimilarity(s, s2);
        assertNotEquals(simirity, 1);
        assertNotEquals(simirity, 0);
        System.out.println("相似度为：" + simirity);
    }

    @Test
    void testSimilarityDel() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        String s2 = fileProcess.txtToString("F:test/orig_0.8_del.txt");
        double simirity = paperCheckProcess.getSimilarity(s, s2);
        assertNotEquals(simirity, 1);
        assertNotEquals(simirity, 0);
        System.out.println("相似度为：" + simirity);
    }

    @Test
    void testSimilarityDis1() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        String s2 = fileProcess.txtToString("F:test/orig_0.8_dis_1.txt");
        double simirity = paperCheckProcess.getSimilarity(s, s2);
        assertNotEquals(simirity, 1);
        assertNotEquals(simirity, 0);
        System.out.println("相似度为：" + simirity);
    }

    @Test
    void testSimilarityDis10() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        String s2 = fileProcess.txtToString("F:test/orig_0.8_dis_10.txt");
        double simirity = paperCheckProcess.getSimilarity(s, s2);
        assertNotEquals(simirity, 1);
        assertNotEquals(simirity, 0);
        System.out.println("相似度为：" + simirity);

    }

    @Test
    void testSimilarityDis15() throws IOException {
        String s = fileProcess.txtToString("F:test/orig.txt");
        String s2 = fileProcess.txtToString("F:test/orig_0.8_dis_15.txt");
        double simirity = paperCheckProcess.getSimilarity(s, s2);
        assertNotEquals(simirity, 1);
        assertNotEquals(simirity, 0);
        System.out.println("相似度为：" + simirity);
    }


}