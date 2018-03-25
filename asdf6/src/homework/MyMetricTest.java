class MyMetric {
    private static double distance;
    public static double kilToMile(double d){
        distance = d / 1.6093;
        return distance;
    }
    public static void miletoKilo(double d){
        distance = d *1.6093;
    }
}
public class MyMetricTest{
    public static void main (String [] args){
        double d = MyMetric.kiloToMile(1);
        System.out.println(d);
    }
}
