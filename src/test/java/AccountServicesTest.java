import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountServicesTest {

    @Test
    public void test1(){
        AccountServices manager = new AccountServices();
        manager.addAccount("Tony", "Glover");
        manager.addAccount("Tony", "Tiger");
        manager.addAccount("Tony", "Tony");
        manager.addAccount("Peter", "Glover");
        int result = manager.countInstances("Tony");
        assertEquals(3, result);
    }
}