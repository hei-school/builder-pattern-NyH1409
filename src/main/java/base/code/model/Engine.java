package base.code.model;

public class Engine {
  private String name;

  public Engine(String name){
    this.name = name;
  }

  @Override
  public String toString() {
    return "builder.Engine{" +
        "name='" + name + '\'' +
        '}';
  }
}
