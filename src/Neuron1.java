public class Neuron1 {
    final double x[], w[]; // Pisahkan deklarasi x[] dan w[] dengan tanda koma
    Neuron1(double x[], double w[]) {
        this.x = x;
        this.w = w;
    }
    public double Output() {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i] * w[i];
        }
        return Math.tanh(sum);
    }
}
