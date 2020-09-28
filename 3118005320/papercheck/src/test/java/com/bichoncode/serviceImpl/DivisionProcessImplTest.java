package com.bichoncode.serviceImpl;

import com.bichoncode.service.DivisionProcess;
import org.junit.jupiter.api.BeforeAll;
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
    static DivisionProcess divisionProcess;

    @BeforeAll
    static void init() {
        divisionProcess = new DivisionProcessImpl();
        System.out.println(1111);
    }


    @Test
    void  ikDivideStrategyTest() throws IOException {
        List<String> list = divisionProcess.ikDivideStrategy("你好， 吃饭了吗");
        assertNotNull(list);
        System.out.println(list);
    }


}