import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class DotComTest {

    @Test
    public void checkYourselfTest() {
        DotCom dot = new DotCom();
        ArrayList<String> locations = new ArrayList<String>();
        locations.add("2");
        locations.add("3");
        locations.add("4");

        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String expected = "Hit!";

        Assert.assertEquals(expected, result);
    }

}
