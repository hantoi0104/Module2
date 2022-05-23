import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class NextDayCalculatorTest {
    @Test
    @DisplayName("Testing 1-1-2018")

    public void testNextDay() {
        int ngay = 1;
        int thang = 1;
        int nam = 2018;
        String expect = "2-1-2018";
        String result = NextDayCalculator.findNextDay(ngay, thang, nam);
        assertEquals(expect, result);
    }


}