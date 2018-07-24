import javax.swing.JFrame;

public class EspiralQuadradoTest {

	public static void main(String[] args) {
		
		EspiralQuadrado panel = new EspiralQuadrado();
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(panel);
		aplicacao.setSize(400, 250);
		aplicacao.setVisible(true);

	}

}
