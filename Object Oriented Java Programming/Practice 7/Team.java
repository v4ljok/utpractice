import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player, S>{
    private String name;
//    private String teamName;
    private S affiliation;
    private List<T> teamMembers = new ArrayList<>();
//    public Team(String name) {
//        this.name = name;
//    }
    public Team(String name, S affiliation) {
        this.name = name;
        this.affiliation = affiliation;
    }
    public void addTeamMember(T t) {
        if(!teamMembers.contains(t))
            teamMembers.add(t);
    }
//    public void listTeamMembers() {
//        for (T t : teamMembers) {
//            System.out.println(t);
//        }
//    }
    public void listTeamMembers() {
        for(T t : teamMembers) {
            System.out.println(t.name());
            System.out.println((affiliation == null ? "" : "Affil: "+ affiliation));
        }
    }
}
