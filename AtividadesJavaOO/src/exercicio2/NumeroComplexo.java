package exercicio2;

public class NumeroComplexo extends NumeroReal {

	float b;
	
	public NumeroComplexo(float a, float b) {
		super(a);
		this.b = b;
	}
	
	public NumeroComplexo soma(NumeroComplexo n){
		//Essa atribui��o � feita para evitar StackOverflow pela chamada recursiva de soma sobre a pr�pria classe
		NumeroReal aux = new NumeroReal(this.a).soma(n);
		return new NumeroComplexo(aux.a, (this.b + n.b));
	}
	
	public String toString(){
		return new StringBuilder().append(this.a).append("+").append(this.b).append("i").toString();
	}
	
	public static void main(String[] args) {
		
		NumeroComplexo num1 = new NumeroComplexo(5.675f, 8.953f), num2 = new NumeroComplexo(4.115f, 5.322f);
		NumeroComplexo resultado;
		
		resultado = num1.soma(num2);
		
		System.out.println(num1.toString() + " + " + num2.toString() + " = " + resultado.toString());
		
	}

}
