package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(7.32,6.45,2.22,10));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        int totalBuckets = (int)Math.ceil((area/(areaPerBucket)) - extraBuckets);
        return totalBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        int totalBuckets = (int)Math.ceil(area/(areaPerBucket));
        return totalBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int)Math.ceil(area/areaPerBucket);
    }
}
