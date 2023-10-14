import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArrayTasksTest {

    @Test
    public void testSortAndDisplayReturn() {
        ArrayTasks arrayTasks = new ArrayTasks();
        int[] arr = {3, 1, 2};
        int[] expectedSorted = {1, 2, 3};
        int[] actualSorted = arrayTasks.sortAndDisplayReturn(arr);
        assertEquals(Arrays.toString(expectedSorted), Arrays.toString(actualSorted));
    }
}
