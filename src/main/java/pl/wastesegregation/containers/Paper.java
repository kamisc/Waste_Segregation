package pl.wastesegregation.containers;

public class Paper {

    public String paperAllowed() {

        return "Należy zbierać: \n"
                + "- opakowania z papieru lub tektury; \n"
                + "- gazety i czasopisma; \n"
                + "- katalogi, prospekty, foldery; \n"
                + "- papier szkolny i biurowy; \n"
                + "- ksiązki i zeszyty; \n"
                + "- torebki papierowe; \n"
                + "- papier pakowy. \n";
    }

    public String paperNotAllowed() {

        return "\nNie wolno wrzucać do tych pojemników następujących odpadów: \n"
                + "- ręczników papierowych i zużytych chusteczek higienicznych; \n"
                + "- papieru zatłuszczonego lub mocno zabrudzonego; \n"
                + "- zatłuszczonych jednorazowych opakowań z papieru i naczyń jednorazowych; \n"
                + "- papieru powlekanego folią i kalki; \n"
                + "- kartonów po mleku i napojach; \n"
                + "- pieluch jednorazowych i podpasek; \n"
                + "- pampersów i podkładów; \n"
                + "- worków po nawozach, cemencie i innych materiałach budowlanych; \n"
                + "- tapet; \n"
                + "- innych odpadów komunalnych (w tym niebezpiecznych). \n";
    }

}
