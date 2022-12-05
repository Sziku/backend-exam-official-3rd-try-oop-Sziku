package hu.nive.ujratervezes.softwaredevcompany;

public abstract class Worker {
    private int experience;
    private boolean isBored;
    abstract void doWork(boolean isBoring);

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
