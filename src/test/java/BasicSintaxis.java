import org.junit.jupiter.api.*;

public class BasicSintaxis {
    @BeforeAll
    public static void beforeClass(){
        System.out.println("INICIO> Esto se ejecuta solo una vez");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("FINAL >Esto se ejecuta solo una vez");
    }

    @BeforeEach
    public void setUp(){
        System.out.println(" BEFORE > Esto se EJECUTA ANTES de CADA test");
    }
    @AfterEach
    public void cleanUp(){
        System.out.println(" AFTER> Esto se EJECUTA DESPUES de CADA test");
    }
    @Test
    public void verifyThing1(){
        System.out.println("  Esto es un prueba 1");
    }
    @Test
    public void verifyThing2(){
        System.out.println("  Esto es un prueba 2");
    }
}
