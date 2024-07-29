import madetech.Sum;
import org.junit.Assert;
import org.junit.Test;

public class TestMadeTech {

    @Test
    public void testAdd2Numbers_ValidInputs_ReturnCorrectSum(){
        Assert.assertEquals(5, Sum.sum(2,3));
    }
}
