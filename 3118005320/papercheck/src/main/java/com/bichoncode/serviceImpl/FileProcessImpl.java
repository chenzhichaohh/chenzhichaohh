package com.bichoncode.serviceImpl;

import com.bichoncode.service.FileProcess;

import java.io.*;

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
        if (!file.exists()) {
            System.out.println("请输入正确的路径和文件名，" + fileName + "不存在");
        }
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

    @Override
    public void writeToDisk(String fileName, String content) {
        //fileName = "D:aaa.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            fileOutputStream.write(content.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("结果为:" + content + "已经写入" + fileName);

    }
}
