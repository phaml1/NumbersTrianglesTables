package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= tableSize; i++){
            for (int j = 1; j <= tableSize; j++){
                table.append(String.format("%3d |", i*j));
                }
            table.append("\n");
        }
        return table.toString();
    }
}
