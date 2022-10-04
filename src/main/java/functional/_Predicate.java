package functional;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        Map<String, LocalDateTime> groupInfo = getGroupInfo();

        // Predicate (Lambda)
        Predicate<LocalDateTime> isGenerationZ = date -> date.isAfter(LocalDateTime.of(1995,1,1, 0, 0))
                && date.isBefore(LocalDateTime.of(2010,1,1,0,0));
        print(groupInfo, isGenerationZ);

        // Predicate (Interface)
        Predicate<LocalDateTime> isGenerationZInterface = new Predicate<LocalDateTime>() {
            @Override
            public boolean test(LocalDateTime date) {
                return date.isAfter(LocalDateTime.of(1995,1,1, 0, 0))
                        && date.isBefore(LocalDateTime.of(2010,1,1,0,0));
            }
        };
        print(groupInfo, isGenerationZInterface);

        // Predicate (Classe)
        Predicate<LocalDateTime> isGenerationZClasse = new PredicateFunction();
        print(groupInfo, isGenerationZClasse);

    }

    public static class PredicateFunction implements Predicate<LocalDateTime>{
        @Override
        public boolean test(LocalDateTime date) {
            return date.isAfter(LocalDateTime.of(1995,1,1, 0, 0))
                    && date.isBefore(LocalDateTime.of(2010,1,1,0,0));
        }
    }

    public static Map<String, LocalDateTime> getGroupInfo() {
        return Map.of("Sogolon", LocalDateTime.of(1992, 8, 1, 6, 5),
                "Iuri", LocalDateTime.of(1999, 6, 22, 8, 23),
                "Matheus", LocalDateTime.of(1991, 9, 19, 4, 59),
                "Tomas", LocalDateTime.of(1999, 8, 30, 7, 2),
                "Victoria", LocalDateTime.of(1993, 8, 30, 2, 34));
    }

    public static void print(Map<String, LocalDateTime> groupMap , Predicate<LocalDateTime> predicate){
        for (Map.Entry<String, LocalDateTime> entry : groupMap.entrySet()) {
            System.out.println("Integrante: " + entry.getKey() + ". Data de Nascimento: " + entry.getValue() + ". Is Geracao Z: " + predicate.test(entry.getValue()));
        }
        System.out.println("");
    }

}

