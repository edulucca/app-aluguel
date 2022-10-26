package br.edu.infnet.alugueis.modelo;

import br.edu.infnet.alugueis.modelo.JdbcUtil;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class JdbcUtilTest {
    @Test
    public void test(){
        try {
            JdbcUtil.obterConexao();
            Assert.assertTrue(true);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
