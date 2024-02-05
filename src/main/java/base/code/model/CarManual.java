package base.code.model;

public class CarManual {
  private int seats;
  private Engine engine;
  private String tripComputer;
  private String gps;

  public Engine getEngine() {
    return engine;
  }

  public int getSeats() {
    return seats;
  }

  public String getGps() {
    return gps;
  }

  public String getTripComputer() {
    return tripComputer;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public void setGps(String gps) {
    this.gps = gps;
  }

  public void setTripComputer(String tripComputer) {
    this.tripComputer = tripComputer;
  }

  @Override
  public String toString() {
    return "builder.CarManual{" +
        "seats=" + seats +
        ", engine=" + engine +
        ", tripComputer='" + tripComputer + '\'' +
        ", gps='" + gps + '\'' +
        '}';
  }
}
