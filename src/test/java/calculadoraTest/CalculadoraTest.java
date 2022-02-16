package calculadoraTest;

import basicCalculator.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class CalculadoraTest {


    @Test
    //@Disabled para que no se ejecute por que la funcionalidad aun no esta implementada o existe bug no solucionado
    public void sumarTest(){
        Calculadora calculadora= new Calculadora();
        int expectResult=15;
        int actualResult=calculadora.suma(7,8);
        //tiene que existir una verificacion
        Assertions.assertEquals(expectResult,actualResult,"ERROR! La suma es incorrecta");

    }
    @Test
    @Timeout(value = 7)
    public void multiTest() throws InterruptedException {
        Calculadora calculadora = new Calculadora();
        int expectedResult=6;
        int actualResult=calculadora.multi(3,2);
        // tiene que existir una verificacion
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la multiplicacion es incorrecta");
    }

    @Test
    public void dividirTest(){
        Calculadora calculadora = new Calculadora();
        Assertions.assertThrows(ArithmeticException.class, ()-> {calculadora.division(8,0);} );
    }
}
