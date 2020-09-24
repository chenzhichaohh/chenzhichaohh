package com.bichoncode;

import com.bichoncode.Exception.CustomException;
import com.bichoncode.service.DivisionProcess;
import com.bichoncode.service.FileProcess;
import com.bichoncode.service.PaperCheckProcess;
import com.bichoncode.serviceImpl.DivisionProcessImpl;
import com.bichoncode.serviceImpl.FileProcessImpl;
import com.bichoncode.serviceImpl.PaperCheckProcessImpl;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/22
 */
public class Main {
    public static void main(String[] args) throws IOException {
        long l1 = System.currentTimeMillis();

        // ����У��
        int argsLength = args.length;
        if (argsLength != 3) {
            System.out.println("������������ȷ�Ĳ���");
            throw new CustomException("���������쳣");
        }

        FileProcess fileProcess = new FileProcessImpl();
        String s1 = fileProcess.txtToString(args[0]);
        String s2 = fileProcess.txtToString(args[1]);
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        double similarity = paperCheckProcess.getSimilarity(s1, s2);
        fileProcess.writeToDisk(args[2], Double.toString(similarity));
        long l2 = System.currentTimeMillis();

        System.out.println("一共用时：" + (l2 - l1) / 1000.0 + "秒");

    }
}
