package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Scholar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long scholarId;
    private String scholarName;
    private String lastName;
    private String email;

    public Scholar() {

    }
    protected Scholar(Builder scholar) {
        this.scholarId = scholar.scholarId;
        this.scholarName = scholar.scholarName;
        this.lastName = scholar.lastName;
        this.email = scholar.email;
    }


    public long getScholarId() {
        return scholarId;
    }

    public String getScholarName() {
        return scholarName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Scholar{" +
                "scholarId=" + scholarId +
                ", scholarName='" + scholarName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public static class Builder{
        private long scholarId;
        private String scholarName;
        private String lastName;
        private String email;


        public Builder setScholarId(long scholarId) {
            this.scholarId = scholarId;
            return this;
        }

        public Builder setScholarName(String scholarName) {
            this.scholarName = scholarName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder copy(Scholar scholar){
            this.scholarId = scholar.scholarId;
            this.scholarName = scholar.scholarName;
            this.lastName = scholar.lastName;
            this.email = scholar.email;
            return this;

        }

        public Scholar build(){
            return new Scholar(this);
        }
    }
}
