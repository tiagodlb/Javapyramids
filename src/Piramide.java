public class Piramide {
	private int i = 1;
	String criaCaractere(int i) {
		String x = "" + (i);
		for(int j = 1; j < i; j++) {
			String y = "" + i;
			x += y;
		}
		return x;
	}
	void criaPiramide(int n){
        while( i < n + 1) {
        	System.out.println(criaCaractere(i));
        	i += 1;
        }
    }
}
