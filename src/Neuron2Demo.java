public class Neuron2Demo {
    public static void main(String[] args) {
        double x[][] = {{0,0}, {0,1}, {1,0}, {1,1}};
        int y[] = {0, 1, 1, 1};
        
        // Menentukan ukuran input untuk objek Neuron2
        int inputSize = x[0].length;
        
        // Membuat objek Neuron2 dengan ukuran input yang sesuai
        Neuron2 n = new Neuron2(inputSize);
        
        // Melatih neuron dengan data yang diberikan
        n.Train(x, y, 0.2, 0.1, 1000);

        // Menggunakan neuron yang telah dilatih untuk melakukan prediksi
        System.out.println(n.Output(new double[]{0,0}));
        System.out.println(n.Output(new double[]{0,1}));
        System.out.println(n.Output(new double[]{1,0}));
        System.out.println(n.Output(new double[]{1,1}));
    }
}
