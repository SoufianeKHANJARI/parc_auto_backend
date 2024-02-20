package inssolutions.fleet.fleetcar.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto {
    private int id;
    private String name;
    private String mail;
    private String phone;
    private String address;
    private String info;
    private String state;
    private int departmentId;
    private String role;
    private String login;
    private String password;
    private int entrepriseId;
}
