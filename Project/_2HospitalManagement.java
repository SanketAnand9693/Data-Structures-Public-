package Project;

class hospital
{
    private String HospitalName;
    public String getHospitalName(){
        return HospitalName;
    }    
}
class Doctor extends hospital
{
    private String DoctorName;
    private int AppointmentTime;
    private String DoctorType;

    Doctor(String DoctorName,int AppointmentTime,String DoctorType){
        this.DoctorName=DoctorName;
        this.AppointmentTime=AppointmentTime;
        this.DoctorType=DoctorType;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public int getAppointmentTime() {
        return AppointmentTime;
    }
    public String getDoctorType(){
        return DoctorType;
    }
}

class appointment
{
    private String PatientName;
    private int PatientAge;
    private int MobileNumber;
    private String PatientProblem;

    appointment(String PatientName,int PatientAge,int MobileNumber,String PatientProblem){
        this.PatientName=PatientName;
        this.PatientAge=PatientAge;
        this.MobileNumber=MobileNumber;
        this.PatientProblem=PatientProblem;
    }
    public String getPatientName() {
        return PatientName;
    }
    public int getPatientAge() {
        return PatientAge;
    }
    public int getMobileNumber() {
        return MobileNumber;
    }
    public String getPatientProblem() {
        return PatientProblem;
    }

}

public class _2HospitalManagement
{
    public static void main(String[] args) {
        appointment p1=new appointment("Saurav Joshi",22,993498324,"Piles"); //In this line mobile number is long try fixing it to take 10 digits
        hospital dr1=new Doctor("Amit kanskar", 6, "Physician");
        
        System.out.println(p1.getPatientName());
        System.out.println(dr1.getHospitalName());

    }
}