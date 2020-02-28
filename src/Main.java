public class Main {
    public static void main(String[] args) {
        BPTrend calcTrend = new BPTrend();
        System.out.println("Reading data...");
        calcTrend.readData("files/Environmental_Data_Deep_Moor_2012.txt");
        calcTrend.readData("files/Environmental_Data_Deep_Moor_2013.txt");
        calcTrend.readData("files/Environmental_Data_Deep_Moor_2014.txt");
        calcTrend.readData("files/Environmental_Data_Deep_Moor_2015.txt");
        System.out.println("Done!");

        //Total dataSets analyzed
        System.out.println("Total number of weather data entries: "
                + calcTrend.collectedData.size());

        String from = "";
        String to   = "";

        System.out.println("Test Case #1:");

        from = "2012/01/01 00:30:00";
        to = "2012/01/01 02:30:00";

        System.out.println( calcTrend.doCalc( from, to ) );

        System.out.println("Test Case #2:");

        from = "2013/03/15 10:30:00";
        to = "2013/03/17 02:30:00";

        System.out.println( calcTrend.doCalc( from, to ) );

        System.out.println("Test Case #3:");

        from = "2014/06/21 10:00:00";
        to = "2014/06/25 23:59:59";

        System.out.println( calcTrend.doCalc( from, to ) );
    }
}
