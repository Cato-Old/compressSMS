import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PaginatorTest {
    private Paginator pagin;

    @Before
    public void setUp(){
        pagin = new Paginator(160);
    }

    @Test
    public void paginateTest(){
        assertEquals(2,pagin.paginate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").length);
    }
}
