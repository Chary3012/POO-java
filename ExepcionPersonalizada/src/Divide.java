public class Divide {

    int numerador;
    int denominador;
    int resultado;

    public Divide(int numerador, int denominador)
    {
        this.denominador = denominador;
        this.numerador = numerador;
        resultado = 0;
    }


    public void divi() throws ExPersonzalizada{
        if(numerador == 5)
        {
            throw new ExPersonzalizada("No me gusta el número 5");
        }
        else{resultado = numerador / denominador;
        }
    }

    public int getResultado(){
        return resultado;
    }

}
