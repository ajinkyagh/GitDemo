import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunitClass {

    @Test
    public void setup(){
        String str="Hello";
        assertEquals("Hello",str);
    }
}
