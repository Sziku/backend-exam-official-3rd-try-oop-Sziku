package hu.nive.ujratervezes.softwaredevcompany;

public class Manager extends Worker{
    public Manager(int experience) {
        super(experience);
    }

    public void motivateWorker(Worker worker){
        this.setExperience(this.getExperience() + 1);
        worker.setBored(false);
    }
}
