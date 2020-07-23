package backend;

import java.util.Iterator;

public enum DesignPatterns {

    ADAPTER("Adapter",Categories.ENTKOPPLUNGSMUSTER),
    BEOBACHTER("Beobachter",Categories.ENTKOPPLUNGSMUSTER),
    BRUECKE("Brücke",Categories.ENTKOPPLUNGSMUSTER),
    ITERATOR("Iterator",Categories.ENTKOPPLUNGSMUSTER),
    STELLVERTRETER("Stellvertreter",Categories.ENTKOPPLUNGSMUSTER),
    VERMITTLER("Vermittler",Categories.ENTKOPPLUNGSMUSTER),
    DEKORIERER("Dekorierer",Categories.VARIANTENMUSTER),
    STRATEGIE("Strategie",Categories.VARIANTENMUSTER),
    SCHABLONENMETHODE("Schablonenmethode",Categories.VARIANTENMUSTER),
    FABRIKMETHODE("Fabrikmethode",Categories.VARIANTENMUSTER),
    ABSTRAKE_FABRIK("Abstracte Fabrik (Nestle)",Categories.VARIANTENMUSTER),
    BESUCHER("Besucher",Categories.VARIANTENMUSTER),
    KOMPOSITUM("Kompositum",Categories.VARIANTENMUSTER),
    EINZELSTUECK("Einzekstück",Categories.ZUSTANDSHANDHABUNGSMUSTER),
    FLIEGENGEWICHT("Fliegengewicht",Categories.ZUSTANDSHANDHABUNGSMUSTER),
    MEMENTO("Memento",Categories.ZUSTANDSHANDHABUNGSMUSTER),
    PROTOTYP("Prototyp",Categories.ZUSTANDSHANDHABUNGSMUSTER),
    ZUSTAND("Zustand",Categories.ZUSTANDSHANDHABUNGSMUSTER),
    BEQUEMLICHKEITSKLASSE("Bequemlichkeits-klasse",Categories.BEQUEMLICHKEITSMUSTER),
    BEQUEMLICHKEITSMETHODE("Bequemlichkeits-methode",Categories.BEQUEMLICHKEITSMUSTER),
    FASSADE("Fassade",Categories.BEQUEMLICHKEITSMUSTER),
    NULLOBJEKT("Nullobjekt",Categories.BEQUEMLICHKEITSMUSTER),
    MASTERWORKER("Master/Worker",Categories.STEUERUNGSMUSTER),
    BEFEHL("Befehl",Categories.STEUERUNGSMUSTER);

    public Categories category;
    private String name;

    public String getName() {
        return name;
    }

    DesignPatterns(String name, Categories category) {
        this.name = name;
        this.category = category;
    }

}
