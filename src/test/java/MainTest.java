import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {

    @Test
    public void testGetRandomValueList_listSize_success() {
        //given
        Main.listSize = 100;
        Main.maxValue = 100;
        //when
        Main.getRandomValueList();
        //then
        int max = Collections.max(Main.list);
        assertEquals(Main.listSize, Main.list.size());
    }

    @Test
    public void testGetRandomValueList_maxValue_success() {
        //given
        Main.listSize = 100;
        Main.maxValue = 100;
        //when
        Main.getRandomValueList();
        //then
        int max = Collections.max(Main.list);
        assertEquals(true, Main.maxValue > max);
    }

    @Test
    public void testGetRandomValueListFilteredByValue_success() {
        //given
        Main.listSize = 100;
        Main.maxValue = 100;
        Main.filterValue = 25;
        Filter filter = new Filter(Main.filterValue);
        //when
        Main.getRandomValueList();
        List<Integer> filteredList = filter.filterOut(Main.list);
        //then
        int min = Collections.min(filteredList);
        assertEquals(true, min > Main.filterValue);
    }

}
