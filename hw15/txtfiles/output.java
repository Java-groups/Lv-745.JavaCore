private class Car {
       private String type;
       private  int yearProduction;
       private int engineCapacity;

       private String getType() {
              return type;
       }

       private void setType(String type) {
              this.type = type;
       }

       private int getYearProduction() {
              return yearProduction;
       }

       private void setYearProduction(int yearProduction) {
              this.yearProduction = yearProduction;
       }

       private int getEngineCapacity() {
              return engineCapacity;
       }

       private void setEngineCapacity(int engineCapacity) {
              this.engineCapacity = engineCapacity;
       }

       private Car(){}
       private Car(String type, int yearProduction, int engineCapacity) {
              setType(type);
              setYearProduction(yearProduction);
              setEngineCapacity(engineCapacity);
       }

       @Override
       private String toString() {
              return "Car{" +
                      "type='" + type + '\'' +
                      ", yearProduction=" + yearProduction +
                      ", engineCapacity=" + engineCapacity +
                      '}';
       }
}
