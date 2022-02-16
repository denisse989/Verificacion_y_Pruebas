package tareaTest.ejercicio1Test;

import Tareas.ejercicio1.DateUtils;
import basicCalculator.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DateUtilsTest {
    @ParameterizedTest
    @CsvSource({//Todos loa años probar 28 febrero
                //Calculo año bisiesto
                "28,febrero,1899,1 marzo 1899",
                "28,febrero,1900,1 marzo 1900",
                "28,febrero,1901,1 marzo 1901",
                "28,febrero,1959,1 marzo 1959",
                "28,febrero,1960,29 febrero 1960",//año bisiesto
                "28,febrero,1961,1 marzo 1961",
                "28,febrero,2019,1 marzo 2019",
                "28,febrero,2020,29 febrero 2020",//año bisiesto
                "28,febrero,2021,1 marzo 2021",
                //Todos los años probar 31 diciembre
                //Cambios de año
                "31,diciembre,1899,1 enero 1900",
                "31,diciembre,1900,1 enero 1901",
                "31,diciembre,1901,1 enero 1902",
                "31,diciembre,1959,1 enero 1960",
                "31,diciembre,1960,1 enero 1961",
                "31,diciembre,1961,1 enero 1962",
                "31,diciembre,2019,1 enero 2020",
                "31,diciembre,2020,1 enero 2021",
                "31,diciembre,2021,1 enero 2022",
                //Los años 1900 y 2020 probar 30 junio, 31 julio, 31 agosto, 30 septiembre
                //Cambios de mes
                "30,junio,1900,1 julio 1900",
                "31,julio,1900,1 agosto 1900",
                "31,agosto,1900,1 septiembre 1900",
                "30,septiembre,1900,1 octubre 1900",
                "30,junio,2020,1 julio 2020",
                "31,julio,2020,1 agosto 2020",
                "31,agosto,2020,1 septiembre 2020",
                "30,septiembre,2020,1 octubre 2020",
                //Los años 1900,2020 probar 13 marzo, 14 junio, 15 septiembre, 16 noviembre
                //Cambios de dia
                "13,marzo,1900,14 marzo 1900",
                "14,junio,1900,15 junio 1900",
                "15,septiembre,1900,16 septiembre 1900",
                "16,noviembre,1900,17 noviembre 1900",
                "13,marzo,2020,14 marzo 2020",
                "14,junio,2020,15 junio 2020",
                "15,septiembre,2020,16 septiembre 2020",
                "16,noviembre,2020,17 noviembre 2020",
                //PROBAR DATOS INCORRECTOS
                //Años no bisiestos probar 29 febrero dia incorrecto
                "29,febrero,1899,dia incorrecto",
                "29,febrero,1900,dia incorrecto",
                "29,febrero,1901,dia incorrecto",
                "29,febrero,1959,dia incorrecto",
                "29,febrero,1961,dia incorrecto",
                "29,febrero,2019,dia incorrecto",
                "29,febrero,2021,dia incorrecto",
                //probar el año 1581,1580
                "28,febrero,1580,gestion incorrecta",
                "31,diciembre,1580,gestion incorrecta",
                "28,febrero,1581,gestion incorrecta",
                "31,diciembre,1581,gestion incorrecta",
                //1960 probar mes abril,julio mal escrito
                "1,avril,1960,mes incorrecto",
                "31,avril,1960,mes incorrecto",
                "1,gulio,1960,mes incorrecto",
                "31,gulio,1960,mes incorrecto",
                //Probar dia -1 y 32
                "-1,febrero,1900,dia incorrecto",
                "32,diciembre,1900,dia incorrecto",
                "32,febrero,2020,dia incorrecto",
                "-1,diciembre,2020,dia incorrecto",



    })
    public void nextDateTest(int dia,String mes,int gestion, String expectedResult){
        DateUtils dateUtils=new DateUtils();
        String actualResult=dateUtils.nextDate(dia, mes, gestion);
        Assertions.assertEquals(expectedResult,actualResult,"ingresar nuevos datos");
    }
}
