package org.web3j.unitComposeExample;

import org.junit.jupiter.api.Test;
import org.web3j.EVMComposeTest;
import org.web3j.protocol.Web3j;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

@EVMComposeTest(dockerCompose = "src/test/resources/simple4.yml", service ="ethrpc1")
public class GreeterComposeTest {
    @Test
    public void helloWorldTest(Web3j web3j,
                               TransactionManager transactionManager,
                               ContractGasProvider gasProvider) throws Exception {
        String expectedValue = "Hello Blockchain World!";

        Greeter greeter = Greeter.deploy(web3j, transactionManager, gasProvider, expectedValue).send();

        String actualValue = greeter.greet().send();

        assertEquals(expectedValue, actualValue);
    }
}


