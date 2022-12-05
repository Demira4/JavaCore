package Lesson1v1;
public class Team {
    String teamName;
    Competitor[] teamMembers = new Competitor[4];


    public Team(String teamName, Competitor[] teamMembers){
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName(){
        return teamName;
    }

    public Competitor[] getMembers(){
        return teamMembers;
    }

    public void showResults(){
        for(Competitor c: teamMembers){
            c.showResult();
        }
    }
    public void getTeamInfo(){
        for (Competitor c: teamMembers)
            c.lineUp();
    }

    public void showMembersFinishedCourse(){
        for(Competitor c: teamMembers){
            if(c.isOnDistance())
                c.showResult();
        }
    }
}