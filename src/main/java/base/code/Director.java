package base.code;

import base.code.builder.Builder;
import base.code.model.Engine;

public class Director {
  void makeSUV(Builder builder){
    builder.setEngine(new Engine("SUV"));
  };
  void makeSportsCar(Builder builder){
    builder.setEngine(new Engine("Sports"));
  };
}
