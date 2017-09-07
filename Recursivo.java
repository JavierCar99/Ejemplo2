package com.progra1.recursividad;

import javax.swing.JOptionPane;

public class Recursivo {


	public int factorial(int n){

		if(n <= 1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}

	}


	public int factorialIter(int n){

		int resultado = 1;
		for(int i = 1; i <= n; i++){
			resultado *= i;
		}
		return resultado;
	}


	public int fibonnaci(int n){
		if(n == 1 || n == 2) {
			return 1;
		}else{
			return fibonnaci(n-1)+fibonnaci(n-2);
		}		
	}


	public int fibonnaciIter(int n){
		int x = 0;
		int y = 1;
		for(int i = 2; i < n; i++){			
			int tmp = y;
			y += x;
			x = tmp;			
		}
		return y;		
	}


	public static void main(String[] args){

		String mensaje = "Digite una opcion\n";
		mensaje += "1. Fibonnaci Recursivo\n";
		mensaje += "2. Fibonnaci Iterativo\n";
		mensaje += "3. Factorial Recursivo\n";
		mensaje += "4. Factorial Iterativo\n";
		mensaje += "0. Salir\n";

		boolean salir = false;

		do {
			try {
				String valStr = JOptionPane.showInputDialog(mensaje);
				int valor = Integer.parseInt(valStr);
							
				
				Recursivo recur = new Recursivo();
				
				switch(valor){
					case 0:
						salir = true;
						break;
					case 1:
						String numStr = JOptionPane.showInputDialog("Que valor de la serie desea");
						int num = Integer.parseInt(numStr);
						int res = recur.fibonnaci(num);
						JOptionPane.showMessageDialog(null, "El valor es " + res);
						break;
					case 2:
						String numStr2 = JOptionPane.showInputDialog("Que valor de la serie desea");
						int num2 = Integer.parseInt(numStr2);
						int res2 = recur.fibonnaciIter(num2);
						JOptionPane.showMessageDialog(null, "El valor es " + res2);
						break;
					case 3:
						String numStr3 = JOptionPane.showInputDialog("Digite el valor a calcular");
						int num3 = Integer.parseInt(numStr3);
						int res3 = recur.factorial(num3);
						JOptionPane.showMessageDialog(null, "El valor es " + res3);
						break;
					case 4:
						String numStr4 = JOptionPane.showInputDialog("Digite el valor a calcular");
						int num4 = Integer.parseInt(numStr4);
						int res4 = recur.factorial(num4);
						JOptionPane.showMessageDialog(null, "El valor es " + res4);
						break;
					default:
						JOptionPane.showMessageDialog(null, valor + " no es una opcion valida.");
						break;
				}
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null,"Su opcion no pudo ser procesada, intente de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} while(!salir);



		/*
		Recursivo recur = new Recursivo();
		int valor = recur.fibonnaciIter(8);
		System.out.println("Fibo 8 = " + valor);
		 */	
	}
}