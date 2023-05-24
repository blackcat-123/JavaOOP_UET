import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        assertEquals(5, Week4.max2Int(3, 5));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(2, Week4.max2Int(1, 2));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(-1, Week4.max2Int(-1, -2));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(9, Week4.max2Int(8, 9));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(100, Week4.max2Int(99, 100));
    }

    @Test
    public void testMinArray1() {
        int arr[] = {1, 2, 3};
        assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray2() {
        int arr[] = {2, 3, 4};
        assertEquals(2, Week4.minArray(arr));
    }

    @Test
    public void testMinArray3() {
        int arr[] = {100, 200, 300};
        assertEquals(100, Week4.minArray(arr));
    }

    @Test
    public void testMinArray4() {
        int arr[] = {-100, -1, 0, 1, 2, 3};
        assertEquals(-100, Week4.minArray(arr));
    }

    @Test
    public void testMinArray5() {
        int arr[] = {9, 9, 9, 9, 9};
        assertEquals(9, Week4.minArray(arr));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Bình thường", Week4.calculateBMI(55, 1.73));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Thiếu cân", Week4.calculateBMI(40, 1.73));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Bình thường", Week4.calculateBMI(59, 1.66));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Thừa cân", Week4.calculateBMI(74, 1.74));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Béo phì", Week4.calculateBMI(81, 1.67));
    }
}
