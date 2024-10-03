package original;

import org.junit.Test;

import static org.junit.Assert.*;

public class PraktikumTest {
    @Test
    public void rightNameTest() {
        String example = "Тимоти Шаламе";
        Account account = new Account(example);
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void withoutWhitespaceInStringTest() {
        String example = "ТимотиШаламе";
        Account account = new Account(example);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void withMultipleWhitespacesInStringTest() {
        String example = "Тимоти  Шаламе";
        Account account = new Account(example);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void withWhitespaceAtTheBeginningTest() {
        String example = " Тимоти Шаламе";
        Account account = new Account(example);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void withWhitespaceAtTheEndTest() {
        String example = "Тимоти Шаламе ";
        Account account = new Account(example);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void withWhitespaceAtTheBeginningAndAtTheEndTest() {
        String example = " Тимоти Шаламе ";
        Account account = new Account(example);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void lengthLongerThanNineteenTest() {
        String example = "Тимотииии Шаламеееее";
        Account account = new Account(example);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void lengthShorterThanThreeTest() {
        String example = "Т ";
        Account account = new Account(example);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void lengthEqualToThreeTest() {
        String example = "Т Ш";
        Account account = new Account(example);
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void lengthEqualToNineteenTest() {
        String example = "Тимотииии Шаламееее";
        Account account = new Account(example);
        assertTrue(account.checkNameToEmboss());
    }
}