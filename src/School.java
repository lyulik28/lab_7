/**
 * клас School
 * має поля currentSeason та numberOfStudents
 * також має метод getCurrentSeason
 */
public class School {
    public Season currentSeason;
    public static final int numberOfStudents = 200;

    public String getCurrentSeason(Season type){
        switch(type){
            case WINTER:
                currentSeason = Season.WINTER;
                return "WINTER";
            case SPRING:
                currentSeason = Season.SPRING;
                return "SPRING";
            case SUMMER:
                currentSeason = Season.SUMMER;
                return "SUMMER";
            case AUTUMN:
                currentSeason = Season.AUTUMN;
                return "AUTUMN";
            default:
                return "UNKNOWN";
        }
    }
}
