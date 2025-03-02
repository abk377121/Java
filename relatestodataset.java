public class relatestodataset {
    public static void main(String[] args) {
        dataset datesat = new dataset();
        datesat.add(10);
        datesat.add(12);
        datesat.add(14);
        datesat.add(16);
        datesat.add(18);
        System.out.println("Average: " + datesat.average());
        System.out.println("Standard Deviation: " + datesat.getstandarddeviation());
        dataset ds1 = new dataset();
        ds1.add(2);
        ds1.add(4);
        ds1.add(6);

        dataset ds2 = new dataset();
        ds2.add(1);
        ds2.add(3);
        ds2.add(5);

        dataset ds3 = new dataset();
        ds3.add(10);
        ds3.add(20);

        System.out.println("Average of all datasets: " + dataset.calculateaverage(new dataset[]{ds1, ds2, ds3}));
    }
}
