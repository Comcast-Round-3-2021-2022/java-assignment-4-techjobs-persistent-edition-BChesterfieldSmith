package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @NotBlank(message = "Name required")
    @Size( min = 3, max = 150, message = "Name must be between 3 and 150 characters")
    String description;
    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();


    public Skill () {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}