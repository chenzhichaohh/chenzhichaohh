package com.bichoncode.serviceImpl;


import com.bichoncode.service.DivisionProcess;
import com.bichoncode.service.PaperCheckProcess;
import java.util.*;

/**
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/22
 */
public class PaperCheckProcessImpl implements PaperCheckProcess {

    @Override
    public double cosineSimirity(String article1, String article2) {
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        List<String> articleList1 = divisionProcess.ikDivideStrategy(article1);
        List<String> articleList2 = divisionProcess.ikDivideStrategy(article2);
        // 将两个集合合并，并且去重
        List<String> mergeList = this.mergeList(articleList1, articleList2);

        // 将合并后的集合的每个元素存进map中，目的是为了给每个元素标号
        // key是list的集合元素，value是序号
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < mergeList.size(); i++) {
            map.put(mergeList.get(i), i);
        }
        int size = mergeList.size();

        // 将分词后的两篇文章分别编码
        List<Integer> articleList1Code = new ArrayList<>();
        List<Integer> articleList2Code = new ArrayList<>();
        for (String str : articleList1) {
            // 判断map是否含有那个分词
            boolean contains = map.keySet().contains(str);
            if (contains) {
                // 如果在map中含有那个分词，取出分词对应的序号进行编码
                Integer integer = map.get(str);
                articleList1Code.add(integer);
            }
        }
        for (String str : articleList2) {
            // 判断map是否含有那个分词
            boolean contains = map.keySet().contains(str);
            if (contains) {
                // 如果在map中含有那个分词，取出分词对应的序号进行编码
                Integer integer = map.get(str);
                articleList2Code.add(integer);
            }
        }

        // 两篇文章词汇出现的频率向量
        int[] listCodeHFreq1 =  new int[size];
        int[] listCodeHFreq2 =  new int[size];

        for (int num : articleList1Code) {
            listCodeHFreq1[num] ++;
        }

        for (int num : articleList2Code) {
            listCodeHFreq2[num] ++;
        }

        double result = this.calculateCos(listCodeHFreq1, listCodeHFreq2);
        return result;
    }

    /**
     * 合并两个集合，并去掉重复部分
     * @return
     */
    private List<String> mergeList(List<String> list1, List<String> list2) {
        List<String> list = new ArrayList();
        // 将两个集合添加进心机和list中（含有重复部分）
        list.addAll(list1);
        list.addAll(list2);
        // 将list集合转化成set集合，目的是去重
        Set<String> set = new HashSet<>(list);
        // 经set重新转化会list（不包含重复的元素）
        List<String> mergeList = new ArrayList<>(set);
        return mergeList;
    }

    /**
     * 传入两个向量，应用余弦定理计算
     * @param vect1
     * @param vect2
     * @return
     */
    private double calculateCos(int[] vect1, int[] vect2) {
        int size = vect1.length;
        // 余弦算法的分子，点乘积
        double dotProduct = 0;
        for (int i = 0; i < size; i++) {
            dotProduct += vect1[i] * vect2[i];
        }

        // vect1向量1的平方和
        double sunOfSquares1 = 0;
        // vect2向量2的平方和
        double sunOfSquares2 = 0;
        for (int i = 0; i < size; i++) {
            sunOfSquares1 += Math.pow(vect1[i], 2) ;
        }

        for (int i = 0; i < size; i++) {
            sunOfSquares2 += Math.pow(vect2[i], 2) ;
        }
        // 初始结果
        double initresult = dotProduct / (Math.sqrt(sunOfSquares1) * Math.sqrt(sunOfSquares2));
        System.out.println(initresult);
        // 保留两位小数的结果
        double result = Double.parseDouble(String.format("%.2f", initresult));
        System.out.println(result);
        return result;
    }
}
