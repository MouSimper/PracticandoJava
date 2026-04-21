package aritmetica_aplicacion;

public class Aritmetica {
    private int operando1;
    private int operando2;
    public Aritmetica(){

    }
    public Aritmetica(int op1, int op2){
        this.operando1 = op1;
        this.operando2 = op2;
    }
    public int suma(){
      return this.operando1 + this.operando2;
    };
    public int restar(){
      return this.operando1 - this.operando2;
    };

    public int getOperando1(){
        return this.operando1;
    }
    public int getOperando2(){
        return this.operando2;
    }
    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }
    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }



}
