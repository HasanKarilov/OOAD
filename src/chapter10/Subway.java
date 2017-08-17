package chapter10;

import java.util.ArrayList;
import java.util.List;

public class Subway {
    private List<Station> stations;
    private List<Connection> connections;

    public Subway() {
        this.stations = new ArrayList<Station>();
        this.connections = new ArrayList<Connection>();
    }

    public void addStation(String stationName){
        if(!hasStation(stationName)) {
            this.stations.add(new Station(stationName));
        }
    }


    public boolean hasStation(String stationName){
        if(stations.contains(new Station(stationName))){
            return true;
        }
        return false;

    }

    // tak kak stansiya dvuhstoronneya
    public void addConnection(String stationName1, String stationName2, String connectionName){
        if(hasStation(stationName1) && hasStation(stationName2)){
            connections.add(new Connection(new Station(stationName1),
                    new Station(stationName2), connectionName));
            connections.add(new Connection(new Station(stationName2),
                    new Station(stationName1), connectionName));
        }

    }

    public List<Connection> getConnections() {
        return connections;
    }

    public List<Station> getStations() {
        return stations;
    }
}
