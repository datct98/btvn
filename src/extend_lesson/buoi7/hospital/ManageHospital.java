package extend_lesson.buoi7.hospital;

public class ManageHospital {
    private Doctor doctor;
    private Patient patient;

    public ManageHospital() {
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public ManageHospital(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "ManageHospital{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                '}';
    }
}
