package functional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        LocalDateTime dataHoje = LocalDateTime.now();

        // Consumer (Lambda)
        Consumer<LocalDateTime> formatarDataFunctional = data -> System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        formatarDataFunctional.accept(dataHoje);

        // Consumer (Interface)
        Consumer<LocalDateTime> formatarDataInterface = new Consumer<LocalDateTime>() {
            @Override
            public void accept(LocalDateTime localDateTime) {
                System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
            }
        };
        formatarDataInterface.accept(dataHoje);

        // Consumer (Classe)
        Consumer<LocalDateTime> formatarDataClasse = new ConsumerFunction();
        formatarDataClasse.accept(dataHoje);
    }

    public static class ConsumerFunction implements Consumer<LocalDateTime>{
        @Override
        public void accept(LocalDateTime localDateTime) {
            System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        }
    }
}

