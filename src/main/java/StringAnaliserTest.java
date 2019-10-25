import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class StringAnaliserTest {

    @Test
    public void shouldFindNumbersOfInstance(){

        StringAnaliser dupaTest = new StringAnaliser();

        Assert.assertTrue(dupaTest.findInstances("dupadupadupadupa", "dupa") == 4 );
        List<String> lista = Arrays.asList("jeden", "dwa","trzy");
    }
}
