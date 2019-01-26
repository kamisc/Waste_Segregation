package pl.wastesegregation.containers;

public class Bio {

    public String bioContainerAllowed() {

        return "Należy zbierać: \n"
                + "- odpadki warzywne i owoce; \n"
                + "- resztki roślin donniczkowych; \n"
                + "- trociny z obróbki i cięcia drewna; \n"
                + "- resztki jedzenia. \n";

    }

    public String bioContainerNotAllowed() {
        return "\nNie wolno wrzucać do tych pojemników następujących odpadów: \n"
                + "- kości zwierząt; \n"
                + "- oleju jadalnego; \n"
                + "- odchodów zwierząt; \n"
                + "- popiołu węgla kamiennego; \n"
                + "- leków; \n"
                + "- drewna impregnowanego; \n"
                + "- płyt wiórowych i pilśniowych MDF; \n"
                + "- ziemi i kamieni; \n"
                + "- innych odpadów komunalnych (w tym niebezpiecznych.\n";
    }

    public String bioContainerMore() {
        return "\nW okresie Świąt Bożego Narodzenia razem z odpadami BIO będą odbierane choinki.";
    }

}
