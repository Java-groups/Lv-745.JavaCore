
public class Car {
       private String type;
       private  int yearProduction;
       private int engineCapacity;

       public String getType() {
              return type;
       }

       public void setType(String type) {
              this.type = type;
       }

       public int getYearProduction() {
              return yearProduction;
       }

       public void setYearProduction(int yearProduction) {
              this.yearProduction = yearProduction;
       }

       public int getEngineCapacity() {
              return engineCapacity;
       }

       public void setEngineCapacity(int engineCapacity) {
              this.engineCapacity = engineCapacity;
       }

       public Car(){}
       public Car(String type, int yearProduction, int engineCapacity) {
              setType(type);
              setYearProduction(yearProduction);
              setEngineCapacity(engineCapacity);
       }

       @Override
       public String toString() {
              return "Car{" +
                      "type='" + type + '\'' +
                      ", yearProduction=" + yearProduction +
                      ", engineCapacity=" + engineCapacity +
                      '}';
       }
}
