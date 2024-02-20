package inssolutions.fleet.fleetcar.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {
    private int id;
    private String drivingLicence;
    private LocalDate drivingDate;
    private String drivingPhoto;
    private String name;
    private String mail;
    private String phone;
    private String address;
    private String info;
    private String state;
    private String login;
    private String password;
    private int parc_id;
}
