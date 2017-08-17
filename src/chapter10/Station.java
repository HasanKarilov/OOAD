package chapter10;

public class Station {
    private String stationName;

    public Station(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Station otherStation = (Station) o;
        if(this.stationName.equalsIgnoreCase(otherStation.getStationName())){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return stationName.toLowerCase().hashCode();
    }
}
