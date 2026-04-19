public class Aritmetica {
    int operando1;
    int operando2;
    public Aritmetica(){

    }
    Aritmetica(int op1, int op2){
        operando1 = op1;
        operando2 = op2;
    }
    int suma(){
      return operando1 + operando2;
    };
    int restar(){
      return operando1 - operando2;
    };

    public static void main(String[] args) {
        var objeto1 = new Aritmetica(5,7);
        System.out.println(objeto1.suma());
        System.out.println(objeto1.restar());
        var objeto2 = new Aritmetica();
        objeto2.operando1= 9;
        objeto2.operando2=5;
        System.out.println(objeto2.suma());
    }
}
