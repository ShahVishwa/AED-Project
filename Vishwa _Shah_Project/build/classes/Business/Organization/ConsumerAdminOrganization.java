/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ConsumerEnterpriseAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vishwa
 */
public class ConsumerAdminOrganization extends Organization{

    public ConsumerAdminOrganization() {
        super(Organization.Type.ConsumerAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ConsumerEnterpriseAdminRole());
        return roles;
    }
    
}
