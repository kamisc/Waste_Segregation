package pl.wastesegregation.containers;

public class Glass {

    public String glassContainerAllowed() {

        return "Należy zbierać: \n"
                + "- butelki i słoiki szklane po napojach i żywności; \n"
                + "- butelki po napojach alkoholowych; \n"
                + "- szklane opakowania po kosmetykach. \n";

    }

    public String glassContainerNotAllowed() {

        return "\nNie wolno wrzucać do tych pojemników następujących odpadów: \n"
                + "- szkła stołowego - żaroodpornego; \n"
                + "- ceramiki, doniczek; \n"
                + "- zniczy z zawartością wosku; \n"
                + "- żarówek i świetlówek; \n"
                + "- szkła kryształowego; \n"
                + "- reflektorów; \n"
                + "- nieopróżnionych opakowań po lekach, olejach, rozpuszczalnikach; \n"
                + "- termometrów i strzykawek; \n"
                + "- monitorów i lamp telewizyjnych; \n"
                + "- szyb okiennych i zbrojonych; \n"
                + "- szyb samochodowych; \n"
                + "- luster i witraży; \n"
                + "- fajansu i porcelany; \n"
                + "- innych odpadów komunalnych (w tym niebezpiecznych.\n";
    }

    public String glassContainerMore() {
        return "\nZaleca się wrzucać opakowania opróżnione z produktu, bez zakrętek, starać się nie tłuc szkła.";
    }

}
