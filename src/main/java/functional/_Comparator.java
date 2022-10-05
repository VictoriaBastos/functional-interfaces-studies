package functional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class _Comparator {
    public static void main(String[] args) {

        // Comparator (Lambda)
        List<LocalDateTime> groupinfo = getGroupInfo();

        Comparator<LocalDateTime> comparatorLambda = (date1, date2) -> date1.compareTo(date2);
        Collections.sort(groupinfo,comparatorLambda);
        System.out.println(groupinfo);

        // Comparator (Interface)
        List<LocalDateTime> groupinfo2 = getGroupInfo();

        Comparator<LocalDateTime> comparatorInterface = new Comparator<LocalDateTime>() {
            @Override
            public int compare(LocalDateTime date1, LocalDateTime date2) {
                return date1.compareTo(date2);
            }
        };
        Collections.sort(groupinfo2, comparatorInterface);
        System.out.println(groupinfo2);

        // Comparator (Classe)
        List<LocalDateTime> groupinfo3 = getGroupInfo();

        Comparator<LocalDateTime> comparatorClasse = new ComparatorFunction();
        Collections.sort(groupinfo3,comparatorClasse);
        groupinfo.forEach(data -> System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))));


    }

    public static class ComparatorFunction implements Comparator<LocalDateTime> {

        @Override
        public int compare(LocalDateTime date1, LocalDateTime date2) {
            return date1.compareTo(date2);
        }
    }

    public static List<LocalDateTime> getGroupInfo() {
        return Arrays.asList(LocalDateTime.of(1992, 8, 1, 6, 5),
                LocalDateTime.of(1999, 6, 22, 8, 23),
                LocalDateTime.of(1991, 9, 19, 4, 59),
                LocalDateTime.of(1999, 8, 30, 7, 2),
                LocalDateTime.of(1993, 8, 30, 2, 34));
    }
}
