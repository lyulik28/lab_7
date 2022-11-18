/**
 * Перерахування із конструктором
 */
public enum Season {
    WINTER("WINTER"),
    SPRING("SPRING"),
    SUMMER("SUMMER"),
    AUTUMN("AUTUMN");
    private String seasonName;

    Season(String seasonName){
        this.seasonName=seasonName;
    }
}
