package homeWork14StreamApi.homeWork;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Appl {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Apple","Phone",LocalDate.of(2022,12,23),222),
                new Product("Apple","Phone",LocalDate.of(2021,11,12),700),
                new Product("Apple","Phone",LocalDate.of(2023,11,12),700),
                new Product("Apple","Phone", LocalDate.of(2023,7,24),1222),
                new Product("SONY","TV",LocalDate.of(2023,11,12),3500),
                new Product("Apple","Phone", LocalDate.of(2011,7,24),1222),
                new Product("SONY","TV",LocalDate.of(2019,11,12),5000),
                new Product("Apple","Phone", LocalDate.of(2019,7,24),1222),
                new Product("LG","TV",LocalDate.of(2018,11,12),4600),
                new Product("Apple","Phone", LocalDate.of(2015,7,24),1222),
                new Product("LG","TV",LocalDate.of(2017,11,12),1400),
                new Product("Apple","Phone", LocalDate.of(2015,7,24),3100),
                new Product("LG","TV",LocalDate.of(2023,11,12),7000),
                new Product("Apple","Phone", LocalDate.of(2020,7,24),1222),
                new Product("LG","TV",LocalDate.of(2017,11,12),700),
                new Product("Apple","Phone", LocalDate.of(2023,7,24),900),
                new Product("xiaomi","Phone",LocalDate.of(2022,11,12),700),
                new Product("xiaomi","Phone",LocalDate.of(2021,12,12),4000),
                new Product("xiaomi","Phone",LocalDate.of(2020,9,12),700),
                new Product("xiaomi","Phone",LocalDate.of(2022,7,12),700)
                );

                         List<Product> filtredList = products.stream()
                        .filter(x ->x.getManufacture().equals(x.getManufacture()))
                        .filter(x ->x.getPrice()>3000)
                        .filter(x->x.getDateOfManufacture()
                                .isBefore(LocalDate.now()
                                .minusYears(1)))
                                 .sorted(Comparator.comparing(Product::getPrice))
                                 .collect(Collectors.toList());
            System.out.println("sorted list :");
            filtredList.forEach(System.out::println);




    }

}
