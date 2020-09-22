package com.bichoncode.intfacesImpl;

import com.bichoncode.interfaces.FileProcess;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;

/**
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/22
 */
public class FileProcessImpl implements FileProcess {
    @Override
    public String txtToString(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File( fileName);
        try {
            // 使用BufferedReader类来读取文件
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while ((s = br.readLine()) != null) {
                // 一次读一行
                stringBuilder.append(System.lineSeparator() + s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("文件读取出错，请确认输入的路径和文件名是否正确，以及文件类型是否正确！！");
        }

        return stringBuilder.toString();

    }
}
