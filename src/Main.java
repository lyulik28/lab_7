public class Main {
    /**
     * "Точка входу в програму"
     * свтворюэ об'єкт school
     * @param args
     */
    public static void main(String[] args) {
        School school = new School();
        school.getCurrentSeason(Season.AUTUMN);
        System.out.println(school.currentSeason+" "+school.numberOfStudents);
    }
}