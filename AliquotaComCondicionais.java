
public class AliquotaComCondicionais {
	
	public static void main(String[] args) {
		
        double salario = 100.0;
        
        //Os valores de alíquota exatos foram simplificados
        
        double deducaoBaixa = 142.0;
        double deducaoMedia = 350.0;
        double deducaoAlta = 636.0;
        
        if (salario >= 1900 && salario <= 2800) {
	        	double deducao = salario - deducaoBaixa;
	        	System.out.println("O seu salário original é " + salario);
	        	System.out.println("Com a dedução, ele será " + deducao);
        }
        
        if (salario >= 2800.01 && salario <= 3751.0) {
        	double deducao = salario - deducaoMedia;
        	System.out.println("O seu salário original é " + salario);
        	System.out.println("Com a dedução, ele será " + deducao);
        }
        
        if (salario >= 3751.01 && salario <= 4664.00) {
        	double deducao = salario - deducaoAlta;
        	System.out.println("O seu salario original é " + salario);
        	System.out.println("Com a dedução, ele será " + deducao);
        	
        } else {
        	System.out.println("Caso o seu salário não esteja entre R$1900 e R$4664, essa conta não poderá ser feita.");
        }
        
        
        
    }
}


