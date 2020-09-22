
import com.bichoncode.service.DivisionProcess;
import com.bichoncode.service.FileProcess;
import com.bichoncode.service.PaperCheckProcess;
import com.bichoncode.serviceImpl.DivisionProcessImpl;
import com.bichoncode.serviceImpl.FileProcessImpl;
import com.bichoncode.serviceImpl.PaperCheckProcessImpl;
import org.junit.jupiter.api.Test;


class PaperpassApplicationTests {



    @Test
    void contextLoads() {
        FileProcess fileProcess = new FileProcessImpl();
        String s = fileProcess.txtToString("G:/IDEAcode/study/SEWork/chenzhichaohh/3118005320/papercheck/src/main/resources/orig.txt");
        DivisionProcess divisionProcess = new DivisionProcessImpl();
        String s2 = fileProcess.txtToString("G:/IDEAcode/study/SEWork/chenzhichaohh/3118005320/papercheck/src/main/resources/orig_0.8_add.txt");
        PaperCheckProcess paperCheckProcess = new PaperCheckProcessImpl();
        double v = paperCheckProcess.cosineSimirity(s, s2);

    }

}
