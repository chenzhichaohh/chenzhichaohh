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
            System.out.println("文件读取出错，请确认输入的路径和文件名是否正确，以及文件类型是否正确！！");
        }
        return stringBuilder.toString();

    }

    @Override
    public void writeToDisk(String fileName, String content) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("请输入正确的生成文件的路径和名称，并保证文件目录存在");
                e.printStackTrace();
            }
        }
        FileOutputStream fileOutputStream = null;
        fileOutputStream = new FileOutputStream(fileName);
        fileOutputStream.write(content.getBytes());
        System.out.println("相似度为:" + content + "  已经写入" + fileName);
    }
}
