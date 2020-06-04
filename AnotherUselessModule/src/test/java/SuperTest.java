import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class SuperTest {

    @Test
    public void TestMethod(){
        SuperClass s = new SuperClass();
        assertThat(s.superMethod(), containsString("super"));
    }
}
