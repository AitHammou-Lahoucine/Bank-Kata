package org.bankkata;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class AccountTest {

    @Test
    public void testRunBankOperations() {
        Account mockAccount = Mockito.mock(Account.class);

        Main.runBankOperations(mockAccount);

        verify(mockAccount).deposit(1000);
        verify(mockAccount).deposit(2000);
        verify(mockAccount).withdraw(500);
        verify(mockAccount).printStatement();
    }
}
