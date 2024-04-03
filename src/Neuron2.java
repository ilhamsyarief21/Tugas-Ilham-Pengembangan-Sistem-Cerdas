import java.util.Random;

public class Neuron2 {
    double w[];
    double treshold;

    public Neuron2(int inputSize) {
        w = new double[inputSize]; // Inisialisasi array w dengan ukuran inputSize
    }

    public int Output(double x[]) {
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i] * w[i];
        }
        if (sum > treshold) {
            return 1;
        } else {
            return 0;
        }
    }

    public void Train(double[][] x, int[] y, double threshold, double learnrate, int epoch) {
        this.treshold = threshold;
        int N = x[0].length;
        Random r = new Random();

        for (int i = 0; i < w.length; i++) {
            w[i] = r.nextDouble();
        }
        for (int i = 0; i < epoch; i++) {
            int totalError = 0;
            for (int j = 0; j < y.length; j++) {
                int output = Output(x[j]);
                int error = y[j] - output;
                totalError += error;
                for (int k = 0; k < N; k++) {
                    double delta = learnrate * x[j][k] * error;
                    w[k] += delta;
                }
            }
            if (totalError == 0) {
                break;
            }
        }
    }
}
