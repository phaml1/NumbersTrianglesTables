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
        for (int i = 1; i < tableSize + 1; i++){
            table.append("\n");
            for (int j = 1; j < tableSize + 1; j++){
                table.append(i*j).append(" |");
            }
        }
        return table.toString();
    }
}
