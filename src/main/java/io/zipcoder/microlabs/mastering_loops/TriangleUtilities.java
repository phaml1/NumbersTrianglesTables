package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();
        int numStar = 1;
        while(numStar < numberOfRows){
            String thisRow = getRow(numStar);
            sb.append(thisRow).append("\n");
            numStar++;
        }
        return sb.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder stars = new StringBuilder();
        stars.append("*".repeat(Math.max(0, numberOfStars)));
        return stars.toString();
        //do this method first
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
