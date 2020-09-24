package com.bichoncode.serviceImpl;

import com.bichoncode.service.DivisionProcess;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author BichonCode
 * @mail chenzhichaohh@163.com
 * @create 2020/09/24
 */
class DivisionProcessImplTest {
    @Test
    void  ikDivideStrategyTest() throws IOException {
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        List<String> list = divisionProcess.ikDivideStrategy("你好， 吃饭了吗");
        System.out.println(list);
    }
}