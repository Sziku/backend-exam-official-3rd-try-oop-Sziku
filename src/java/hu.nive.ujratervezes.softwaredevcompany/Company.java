package hu.nive.ujratervezes.softwaredevcompany;

import java.util.List;

public class Company {
    private List<Worker> workerList;

    public Company(List<Worker> workerList) {
        this.workerList = workerList;
    }

    public int companyExperience(){
        int sumExp = 0;
        for(Worker worker : workerList){
            sumExp += worker.getExperience();
        }

        return sumExp;
    }
}
