package org.doctorapp.client;

import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

public class Client {
    public static void main(String[] args) {
        IDoctorService doctorService=new DoctorServiceImpl();

        Specialization specialization=Specialization.gyna;
        String speciality=specialization.getSpeciality();

//        String speciality=Specialization .gyna.getSpeciality();

        Doctor doctor=new Doctor("sukanth",speciality,5000,9,5);
        doctorService.addDoctor(doctor);

//        doctorService.updateDoctor(2,15000);
        
        List<Doctor> doctors=doctorService.getAll();
//      for(Doctor doctor:doctors){
//          System.out.println(doctor);
//      }
//
//      try {
//          List<Doctor> doctorList=doctorService.getBySpecialityAndExp("GYNAECOLOGIST",8);
//          for(Doctor doctor:doctorList){
//              System.out.println(doctor);
//          }
//      } catch (DoctorNotFoundException e) {
//          throw new RuntimeException(e);
//      }
//
//      try {
//          List<Doctor> doctorList=doctorService.getBySpecialityAndRating("GYNAECOLOGIST",9);
//          for(Doctor doctor:doctorList){
//              System.out.println(doctor);
//          }
//      } catch (DoctorNotFoundException e) {
//          throw new RuntimeException(e);
//      }
//
//      try {
//          List<Doctor> doctorList=doctorService.getBySpecialityAndLessFee("GYNAECOLOGIST",3000.0);
//          for(Doctor doctor:doctorList){
//              System.out.println(doctor);
//          }
//      } catch (DoctorNotFoundException e) {
//          throw new RuntimeException(e);
//      }
    }
}
