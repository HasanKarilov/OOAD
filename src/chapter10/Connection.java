package chapter10;

public class Connection {
    private Station station1, station2;
    private String connectionName;

    public Connection(Station station1, Station station2, String connectionName) {
        this.station1 = station1;
        this.station2 = station2;
        this.connectionName = connectionName;
    }

    public Station getStation1() {
        return station1;
    }

    public Station getStation2() {
        return station2;
    }

    public String getConnectionName() {
        return connectionName;
    }


    public String toString()
    {
        return "[" + station1.getStationName() + ", " + station2.getStationName() + ", " + connectionName + "]";
    }
}
