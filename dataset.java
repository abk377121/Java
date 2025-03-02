import javax.xml.crypto.Data;

@SuppressWarnings("unused")
public class dataset {
    private double[] data;
    private int datasize;
    private double sum;

    public dataset(){
        data = new double[100];
        datasize = 0;
        sum = 0;
    }

    public void add(double x){
        data[datasize] = x;
        datasize++;
        sum += x;
    }

    public double average(){
        return (datasize == 0) ? 0 : sum/datasize;
    }

    public double getstandarddeviation(){
        double mean = average();
        double sumofsquares = 0.0;
        for(int i = 0; i < datasize; i++){
            double diff = data[i] - mean;
            sumofsquares += diff * diff;
        }
        return Math.sqrt(sumofsquares/(datasize-1));
    }
    public static double calculateaverage(dataset[] datasets){
        double total = 0.0;
        for(dataset ds : datasets){
            total += ds.average();
        }
        return total/datasets.length;
    }
    @Override
    public String toString(){
        return "Dataset[Size=" + datasize + ", Average=" + average() + "]";
    }
}
