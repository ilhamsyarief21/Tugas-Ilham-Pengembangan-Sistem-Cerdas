import java.util.Random;

public class NeuronDemo1 {
    public static void main(String[] args) {
        double x[] = {1, 4, -0.33};
        double w[] = new double[x.length]; 
        Random random = new Random();
        for (int i = 0; i < w.length; i++) {
            w[i] = random.nextDouble(); 
        }
        Neuron1 n = new Neuron1(x, w);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(n.Output());
    }
}
