package ejemploMock;

public class CalculadoraMock {
    MultiplicarServicio multiplicarServicio;

    public CalculadoraMock(MultiplicarServicio multiplicarServicio){
        this.multiplicarServicio= multiplicarServicio;
    }
    public CalculadoraMock(){
        multiplicarServicio= new MultiplicarServicio();
    }

    // Desarrollador A
    public int getFactorial(int number){
        int fact=1;
        for (int i = 1; i <=number ; i++) {
            fact=multiplicarServicio.multi(fact,i);
        }
        return fact;
    }
}
