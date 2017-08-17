package chapter10;


public class TestSubway {
    public static void main(String[] args) {

        Subway subway = new Subway();
        subway.addStation("Mosk");
        subway.addStation("Kiev");
        subway.addStation("Bish");

        subway.addConnection("Kiev", "Mosk", "Russ");
        subway.addConnection("Bish", "Mosk", "Kaganat");

        System.out.println("Stations: ");
        for (Station station: subway.getStations()){
            System.out.println(station.getStationName());
        }
        System.out.println("Connections: ");
        for (Connection connection: subway.getConnections()) {
            System.out.println(connection.getConnectionName() + " " + connection.getStation1().getStationName() + " " + connection.getStation2().getStationName());
        }


    }


}
