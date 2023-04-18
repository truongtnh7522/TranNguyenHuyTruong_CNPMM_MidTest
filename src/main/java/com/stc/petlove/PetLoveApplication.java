package com.stc.petlove;

import com.stc.petlove.entities.DichVu;
import com.stc.petlove.entities.TaiKhoan;
import com.stc.petlove.entities.embedded.GiaDichVu;
import com.stc.petlove.repositories.DichVuRepository;
import com.stc.petlove.repositories.UserRepository;
import com.stc.petlove.utils.EnumRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import java.util.List;
@SpringBootApplication
public class PetLoveApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    private DichVuRepository dichVuRepository2;
    public static void main(String[] args) {
        SpringApplication.run(PetLoveApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if(userRepository.count()==0){
            TaiKhoan taiKhoan1 = new TaiKhoan("user01", "user01@gmail.com", "123", "012346789",
                    Arrays.asList(EnumRole.ROLE_USER.name()));
            TaiKhoan taiKhoan2 = new TaiKhoan("admin01", "admin01@gmail.com", "123", "012346789",
                    Arrays.asList(EnumRole.ROLE_ADMIN.name()));
            TaiKhoan taiKhoan3 = new TaiKhoan("adminuser01", "adminuser01@gmail.com", "123", "012346789",
                    Arrays.asList(EnumRole.ROLE_ADMIN.name(),EnumRole.ROLE_USER.name() ));
            userRepository.save(taiKhoan1);
            userRepository.save(taiKhoan2);
            userRepository.save(taiKhoan3);
        }


    }
}
