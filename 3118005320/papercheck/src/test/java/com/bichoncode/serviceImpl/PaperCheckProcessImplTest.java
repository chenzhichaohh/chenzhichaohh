package com.bichoncode.serviceImpl;

import com.bichoncode.service.DivisionProcess;
import com.bichoncode.service.FileProcess;
import com.bichoncode.service.PaperCheckProcess;
import org.junit.jupiter.api.Test;
import java.io.IOException;

/**
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/24
 */
class PaperCheckProcessImplTest {



    @Test
    void testCosAdd() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        String s = fileProcess.txtToString("F:test/orig.txt");
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        String s2 = fileProcess.txtToString("F:test/orig_0.8_add.txt");
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        double simirity = paperCheckProcess.cosineSimirity(s, s2);
        System.out.println("相似度为：" + simirity);

    }

    @Test
    void testCosDel() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        String s = fileProcess.txtToString("F:test/orig.txt");
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        String s2 = fileProcess.txtToString("F:test/orig_0.8_del.txt");
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        double simirity = paperCheckProcess.cosineSimirity(s, s2);
        System.out.println("相似度为：" + simirity);

    }

    @Test
    void testLcsAdd() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        String s = fileProcess.txtToString("F:test/orig.txt");
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        String s2 = fileProcess.txtToString("F:test/orig_0.8_add.txt");
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        double simirity = paperCheckProcess.lcs(s, s2);
        System.out.println("相似度为：" + simirity);
    }

    @Test
    void testlcsDel() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        String s = fileProcess.txtToString("F:test/orig.txt");
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        String s2 = fileProcess.txtToString("F:test/orig_0.8_del.txt");
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        double simirity = paperCheckProcess.lcs(s, s2);
        System.out.println("相似度为：" + simirity);
    }

    @Test
    void testlcsDel1() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        String s = fileProcess.txtToString("F:test/orig.txt");
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        String s2 = fileProcess.txtToString("F:test/orig_0.8_dis_1.txt");
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        double simirity = paperCheckProcess.lcs(s, s2);
        System.out.println("相似度为：" + simirity);
    }

    @Test
    void testLcsDis() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        String s = fileProcess.txtToString("F:test/orig.txt");
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        String s2 = fileProcess.txtToString("F:test/orig_0.8_dis_15.txt");
        double simirity = paperCheckProcess.lcs(s, s2);
        System.out.println("相似度为：" + simirity);

    }

    @Test
    void testSimilarity() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        String s = fileProcess.txtToString("F:test/orig.txt");
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        String s2 = fileProcess.txtToString("F:test/orig_0.8_add.txt");
        double simirity = paperCheckProcess.getSimilarity(s, s2);
        System.out.println("相似度为：" + simirity);
    }

    @Test
    void testSimilarityDel() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        String s = fileProcess.txtToString("F:test/orig.txt");
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        String s2 = fileProcess.txtToString("F:test/orig_0.8_del.txt");
        double simirity = paperCheckProcess.getSimilarity(s, s2);
        System.out.println("相似度为：" + simirity);
    }

    @Test
    void testSimilarityDis1() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        String s = fileProcess.txtToString("F:test/orig.txt");
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        String s2 = fileProcess.txtToString("F:test/orig_0.8_dis_1.txt");
        double simirity = paperCheckProcess.getSimilarity(s, s2);
        System.out.println("相似度为：" + simirity);

    }

    @Test
    void testSimilarityDis10() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        String s = fileProcess.txtToString("F:test/orig.txt");
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        String s2 = fileProcess.txtToString("F:test/orig_0.8_dis_10.txt");
        double simirity = paperCheckProcess.getSimilarity(s, s2);
        System.out.println("相似度为：" + simirity);

    }

    @Test
    void testSimilarityDis15() throws IOException {
        FileProcess fileProcess = new FileProcessImpl();
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        String s = fileProcess.txtToString("F:test/orig.txt");
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        String s2 = fileProcess.txtToString("F:test/orig_0.8_dis_15.txt");
        double simirity = paperCheckProcess.getSimilarity(s, s2);
        System.out.println("相似度为：" + simirity);
    }


}