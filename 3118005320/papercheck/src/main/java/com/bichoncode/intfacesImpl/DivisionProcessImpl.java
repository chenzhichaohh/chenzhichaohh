package com.bichoncode.intfacesImpl;

import com.bichoncode.interfaces.DivisionProcess;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/22
 */
public class DivisionProcessImpl implements DivisionProcess {
    @Override
    public List<String> ikDivideStrategy(String text) {
        StringReader stringReader = new StringReader(text);
        IKSegmenter ikSegmenter = new IKSegmenter(stringReader, true);
        List<String> list = new ArrayList<>();
        Lexeme lex=null;
        while(true){
            try {
                if (!((lex=ikSegmenter.next())!=null)) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("分词出错");
            }
            String lexemeText = lex.getLexemeText();
            list.add(lexemeText);
        }
        return list;
    }
}
