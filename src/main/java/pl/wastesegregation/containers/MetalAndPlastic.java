package pl.wastesegregation.containers;

public class MetalAndPlastic {

    public String metalAndPlasticAllowed() {

        return "Należy zbierać: \n"
                + "- plastikowe butelki po napojach; \n"
                + "- opakowania po chemii gospodarczej, kosmetykach (np. po szamponach, proszkach, płynach do naczyń, itp); \n"
                + "- opakowania po produktach spożywczych; \n"
                + "- plastikowe zakrętki; \n"
                + "- plastikowe toerbki, worki, reklamówki i inne folie; \n"
                + "- plastikowe koszyczki po owocach i innych produktach; \n"
                + "- styropian opakowaniowy; \n"
                + "- puszki po napojach, sokach; \n"
                + "- puszki z blachy stalowej po żywności (konserwy); \n"
                + "- złom żelazny i metale kolorowe; \n"
                + "- metalowe kapsle z butelek, zakrętki słoików i innych pojemników; \n"
                + "- folię aluminiową; \n"
                + "- kartoniki po mleku i napojach - wielomateriałowe odpady opakowaniowe. \n";
    }

    public String metalAndPlasticNotAllowed() {

        return "\nNie wolno wrzucać do tych pojemników następujących odpadów: \n"
                + "- butelek i pojemników z zawartością; \n"
                + "- strzykawek, wenflonów i innych artykułów medycznych; \n"
                + "- odpadów budowlanych i rozbiórkowych; \n"
                + "- nieopróżnionych opakowań po lekach, farbach, lakierach i olejach; \n"
                + "- zużytych baterii i akumulatorów; \n"
                + "- zużytego sprzętu elektrycznego i elektronicznego; \n"
                + "- części samochodowych; \n"
                + "- innych odpadów komunalnych (w tym niebezpiecznych). \n";
    }

    public String metalAndPlasticContainerMore() {
        return "\nZaleca się zgnieść tworzywa sztyczne przed wrzuceniem do pojemnika.";
    }

}
