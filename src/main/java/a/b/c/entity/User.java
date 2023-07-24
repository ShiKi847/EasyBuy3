package a.b.c.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Integer id;
    private String loginName;
    private String userName;
    private String password;
    private Boolean sex;
    private String identityCode;
    private String email;
    private String mobile;
    private Boolean type;
}
