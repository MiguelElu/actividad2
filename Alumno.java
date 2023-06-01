public class alumno {
    private String nombre;
    private int[] calif;

public double promedio(){
    int i = 0;
    int sum = 0;
    for (int i = 0;  i < 5;i++) {
        sum =calif[i] + sum;
    }
    double prom = sum /5;
    return prom;
}

}
