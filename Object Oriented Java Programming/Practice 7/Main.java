public class Main {
    public static void main(String[] Args) {
//        Team<FootballPlayer> psg = new Team<>("PSG");
//        var fPlayer1 = new FootballPlayer("Ronaldo Cristiano", "Defender");
//        var fPlayer2 = new FootballPlayer("Lionel Messi", "Midfielder");
//        var fPlayer3 = new FootballPlayer("Kylian Mbappé", "Forward");
//
//        Team<HockeyPlayer> bostonBruins = new Team<>("Boston Bruins");
//        var hPlayer1 = new HockeyPlayer("Alex Ovechkin", "Center");
//        var hPlayer2 = new HockeyPlayer("Sidney Crosby", "Right Wing");
//        var hPlayer3 = new HockeyPlayer("Connor McDavid", "Left Defense");
//
//        psg.addTeamMember(fPlayer1);
//        psg.addTeamMember(fPlayer2);
//        psg.addTeamMember(fPlayer3);
//
//        bostonBruins.addTeamMember(hPlayer1);
//        bostonBruins.addTeamMember(hPlayer2);
//        bostonBruins.addTeamMember(hPlayer3);
//
//        psg.listTeamMembers();
//        bostonBruins.listTeamMembers();
        var philly = new Affiliation("city", "Philadelphia", "US");
        Team<VolleyballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm", philly);
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();
    }
}
