package extend_lesson.buoi7.hospital;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient("Dat", 12, 113, "Hôm nay");
        Doctor doctor = new Doctor("Dat", 12, "FullTime", "Thiếu tiền");

        ManageHospital manageHospital = new ManageHospital();
        manageHospital.setDoctor(doctor);
        manageHospital.setPatient(patient);

        ManageHospital manageHospital2 = new ManageHospital(doctor, patient);
        System.out.println(manageHospital2);
    }
}
