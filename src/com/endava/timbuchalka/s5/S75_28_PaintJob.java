package com.endava.timbuchalka.s5;

public class S75_28_PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int buckets = -1;
        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {
            buckets = (int) Math.round(width * height / areaPerBucket);
            buckets = buckets > extraBuckets ? buckets - extraBuckets : 0;
        }
        return buckets;
    }
}
