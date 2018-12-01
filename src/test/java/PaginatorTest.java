import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.Arrays;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class PaginatorTest {

    @Test
    @Parameters(method="getString")
    public void paginatorTest(String text, int length, String[] array){
        Paginator pagn = new Paginator(length);
        assertTrue(Arrays.equals(array,pagn.paginate(text)));
    }

    private Object[] getString(){
        return new Object[]{
                new Object[]{"ALAMAKOTA", 4, new String[]{"ALAM","AKOT","A"}},
                new Object[]{"ala ma kota", 2, new String[]{"al","a ","ma"," k", "ot","a"}},
                new Object[]{"ala ", 5, new String[]{"ala "}}
        };
    }
}
