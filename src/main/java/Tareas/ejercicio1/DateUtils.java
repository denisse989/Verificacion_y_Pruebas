package Tareas.ejercicio1;

public class DateUtils {
    public String nextDate(int dia, String mes, int gestion){
        boolean esBisiesto;
        int cantidadDiasMes;
        int numeroMes;
        numeroMes=numeroMes(mes);
        //Verifica el año si es correcto y si es bisiesto o no
        if(gestion<1582){return "gestion incorrecta";
        }else esBisiesto= (gestion % 4 == 0) && ((gestion % 100 != 0) || (gestion % 400 == 0));

    //Verifica si el mes es correcto
        if(numeroMes==0){return "mes incorrecto";
        }
        //Calcula el numero de dias del mes
        else if(numeroMes == 1||numeroMes == 3||numeroMes == 5||numeroMes == 7||numeroMes == 8||
                numeroMes == 10||numeroMes == 12){
            cantidadDiasMes=31;
        }else if(numeroMes==2){
            if(esBisiesto){
                cantidadDiasMes=29;
            }else{
                cantidadDiasMes=28;
            }
        }else {
            cantidadDiasMes = 30;
        }
        //Verifica si el dia es correcto
        if((dia<=0||dia>=32)||(!esBisiesto && dia==29 && numeroMes==2) ) {
            return "dia incorrecto";
        }
        //Calcula el dia siguiente y si corresponde cambiar de mes
        else if(dia<cantidadDiasMes){
                dia+=1;
        }else {
            dia=1;
            if(numeroMes==12){
                mes="enero";
                gestion+=1;
            }else{
                mes=letrasMes(numeroMes+1);
            }
         }

        return dia+" "+mes+" "+gestion;
    }

    private String letrasMes(int numeroMes) {
        String mesLetras;
        switch (numeroMes){
            case 1:
                mesLetras="enero";
                break;
            case 2:
                mesLetras="febrero";
                break;
            case 3:
                mesLetras="marzo";
                break;
            case 4:
                mesLetras="abril";
                break;
            case 5:
                mesLetras="mayo";
                break;
            case 6:
                mesLetras="junio";
                break;
            case 7:
                mesLetras="julio";
                break;
            case 8:
                mesLetras="agosto";
                break;
            case 9:
                mesLetras="septiembre";
                break;
            case 10:
                mesLetras="octubre";
                break;
            case 11:
                mesLetras="noviembre";
                break;
            case 12:
                mesLetras="diciembre";
                break;
            default:
                mesLetras="Mes incorrecto";
                break;
        }
        return mesLetras;
    }

    public int numeroMes(String mes){
        int numeroMes;
        switch (mes){
            case "enero":
                numeroMes=1;
                break;
            case "febrero":
                numeroMes=2;
                break;
            case "marzo":
                numeroMes=3;
                break;
            case "abril":
                numeroMes=4;
                break;
            case "mayo":
                numeroMes=5;
                break;
            case "junio":
                numeroMes=6;
                break;
            case "julio":
                numeroMes=7;
                break;
            case "agosto":
                numeroMes=8;
                break;
            case "septiembre":
                numeroMes=9;
                break;
            case "octubre":
                numeroMes=10;
                break;
            case "noviembre":
                numeroMes=11;
                break;
            case "diciembre":
                numeroMes=12;
                break;
            default:
                numeroMes=0;
                break;
        }
        return numeroMes;
    }
}
