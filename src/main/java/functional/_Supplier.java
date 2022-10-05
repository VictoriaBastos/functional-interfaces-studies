package functional;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        // Supplier (Lambda)
        Supplier<List<String>> getSignosLambda = () -> List.of("Áries: do 21 de março a 20 de abril",
                "Touro: de 21 de abril a 20 de maio",
                "Gêmeos: de 21 de maio a 20 de junho",
                "Câncer: de 21 de junho a 22 de julho",
                "Leão: de 23 de julho a 22 de agosto",
                "Virgem: de 23 de agosto a 22 de setembro",
                "Libra: de 23 de setembro a 22 de outubro",
                "Escorpião: de 23 de outubro a 21 de novembro",
                "Sagitário: de 22 de novembro a 21 de dezembro",
                "Capricórnio: de 22 de dezembro a 20 de janeiro",
                "Aquário: de 21 de janeiro a 18 de fevereiro",
                "Peixes: de 19 de fevereiro a 20 de março");

        List<String> signos1 = getSignosLambda.get();
        signos1.forEach(System.out::println);

        // Supplier (Interface)
        Supplier<List<String>> getSignosInterface = new Supplier<List<String>>() {
            @Override
            public List<String> get() {
                return List.of("Áries: do 21 de março a 20 de abril",
                        "Touro: de 21 de abril a 20 de maio",
                        "Gêmeos: de 21 de maio a 20 de junho",
                        "Câncer: de 21 de junho a 22 de julho",
                        "Leão: de 23 de julho a 22 de agosto",
                        "Virgem: de 23 de agosto a 22 de setembro",
                        "Libra: de 23 de setembro a 22 de outubro",
                        "Escorpião: de 23 de outubro a 21 de novembro",
                        "Sagitário: de 22 de novembro a 21 de dezembro",
                        "Capricórnio: de 22 de dezembro a 20 de janeiro",
                        "Aquário: de 21 de janeiro a 18 de fevereiro",
                        "Peixes: de 19 de fevereiro a 20 de março");
            }
        };
        List<String> signos2 = getSignosInterface.get();
        System.out.println("\n"+signos2+"\n");

        // Supplier (Classe)
        Supplier<List<String>> getSignosClasse = new SupplierFunction();
        List<String> signos3 = getSignosClasse.get();

        for (String signo : signos3) {
            System.out.println(signo);
        }
    }

    public static class SupplierFunction implements Supplier<List<String>>{
        @Override
        public List<String> get() {
            return List.of("Áries: do 21 de março a 20 de abril",
                    "Touro: de 21 de abril a 20 de maio",
                    "Gêmeos: de 21 de maio a 20 de junho",
                    "Câncer: de 21 de junho a 22 de julho",
                    "Leão: de 23 de julho a 22 de agosto",
                    "Virgem: de 23 de agosto a 22 de setembro",
                    "Libra: de 23 de setembro a 22 de outubro",
                    "Escorpião: de 23 de outubro a 21 de novembro",
                    "Sagitário: de 22 de novembro a 21 de dezembro",
                    "Capricórnio: de 22 de dezembro a 20 de janeiro",
                    "Aquário: de 21 de janeiro a 18 de fevereiro",
                    "Peixes: de 19 de fevereiro a 20 de março");
        }
    }
}
