package hu.nive.ujratervezes.softwaredevcompany;

public abstract class Worker {
    private int experience;
    private boolean isBored;
     public void doWork(boolean isBoring){
         if(!isBoring){
             experience += 2;
         }else {
             experience += 1;
         }
     };

    public Worker(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isBored() {
        return isBored;
    }

    public void setBored(boolean bored) {
        isBored = bored;
    }
}
