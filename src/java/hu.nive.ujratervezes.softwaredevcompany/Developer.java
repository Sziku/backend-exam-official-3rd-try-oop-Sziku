package hu.nive.ujratervezes.softwaredevcompany;

public class Developer extends Worker{
    public Developer(int experience) {
        super(experience);
    }



    public void doPairProgramming(Developer otherDeveloper){
        this.setExperience(this.getExperience() +1);
        otherDeveloper.setExperience(otherDeveloper.getExperience() + 1);
    }
}
