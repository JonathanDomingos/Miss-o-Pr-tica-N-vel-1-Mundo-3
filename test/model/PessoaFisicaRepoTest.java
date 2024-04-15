/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Windows 10
 */
public class PessoaFisicaRepoTest {
    
    public PessoaFisicaRepoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of obterTodos method, of class PessoaFisicaRepo.
     */
    @Test
    public void testObterTodos() {
        System.out.println("obterTodos");
        PessoaFisicaRepo instance = new PessoaFisicaRepo();
        Iterable<PessoaFisica> expResult = null;
        Iterable<PessoaFisica> result = instance.obterTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recuperar method, of class PessoaFisicaRepo.
     */
    @Test
    public void testRecuperar() {
        System.out.println("recuperar");
        String pessoasFisicasdat = "";
        PessoaFisicaRepo instance = new PessoaFisicaRepo();
        instance.recuperar(pessoasFisicasdat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inserir method, of class PessoaFisicaRepo.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        PessoaFisica pf1 = null;
        PessoaFisicaRepo instance = new PessoaFisicaRepo();
        instance.inserir(pf1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persistir method, of class PessoaFisicaRepo.
     */
    @Test
    public void testPersistir() {
        System.out.println("persistir");
        String pessoasFisicasdat = "";
        PessoaFisicaRepo instance = new PessoaFisicaRepo();
        instance.persistir(pessoasFisicasdat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exibirTodos method, of class PessoaFisicaRepo.
     */
    @Test
    public void testExibirTodos() {
        System.out.println("exibirTodos");
        PessoaFisicaRepo instance = new PessoaFisicaRepo();
        instance.exibirTodos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
