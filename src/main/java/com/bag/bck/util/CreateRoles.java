package com.bag.bck.util;

import com.bag.bck.security.enums.RolName;
import com.bag.bck.security.model.Rol;
import com.bag.bck.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



    @Component
    public class CreateRoles implements CommandLineRunner {

        @Autowired
        RolService rolService;

        @Override
        public void run(String... args) throws Exception {
           /* Rol rolAdmin = new Rol(RolName.ROLE_ADMIN);
             Rol rolUser = new Rol(RolName.ROLE_USER);
             rolService.save(rolAdmin);
             rolService.save(rolUser);
*/

    }

}
