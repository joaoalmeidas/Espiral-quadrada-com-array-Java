import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class EspiralQuadrado extends JPanel {

	public EspiralQuadrado(){
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g){
	
		super.paintComponent(g);
		
		
		int[] pontoInicial = new int[2];
		pontoInicial[0] = getWidth()/2;
		pontoInicial[1] = getHeight()/2;
		
		int[] pontoFinal = new int[2];
		
		int contador = 0;
		
		g.setColor(Color.RED);
		
		for(int tamanhoLinha = 10; tamanhoLinha <= 1000000; tamanhoLinha += 10){
			
			contador++;
			
			if(contador%2 == 0){
				//cima direita
				
				pontoFinal[0] = pontoInicial[0];
				pontoFinal[1] = pontoInicial[1] - tamanhoLinha;
				
				g.drawLine(pontoInicial[0], pontoInicial[1], pontoFinal[0], pontoFinal[1]);
				
				pontoInicial = pontoFinal.clone();
				pontoFinal[0] += tamanhoLinha;
				
				g.drawLine(pontoInicial[0], pontoInicial[1], pontoFinal[0], pontoFinal[1]);
				
				pontoInicial = pontoFinal.clone();
				
			}else{
				//baixo esquerda
				
				pontoFinal[0] = pontoInicial[0];
				pontoFinal[1] = pontoInicial[1] + tamanhoLinha;
				
				g.drawLine(pontoInicial[0], pontoInicial[1], pontoFinal[0], pontoFinal[1]);
				
				pontoInicial = pontoFinal.clone();
				pontoFinal[0] -= tamanhoLinha;
				
				g.drawLine(pontoInicial[0], pontoInicial[1], pontoFinal[0], pontoFinal[1]);
				
				pontoInicial = pontoFinal.clone();
			}
		
		}
		
		
		
		

	}
	

	
}
