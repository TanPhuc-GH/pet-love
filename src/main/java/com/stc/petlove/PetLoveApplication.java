package com.stc.petlove;

import com.stc.petlove.entities.LoaiThuCung;
import com.stc.petlove.entities.TaiKhoan;
import com.stc.petlove.repositories.LoaiThuCungRepository;
import com.stc.petlove.repositories.TaiKhoanRepository;
import com.stc.petlove.utils.EnumTaiKhioan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class PetLoveApplication implements CommandLineRunner {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    public static void main(String[] args) {
        SpringApplication.run(PetLoveApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        if(taiKhoanRepository.count()==0) {
            TaiKhoan taiKhoan = new TaiKhoan("Tan Phuc", "truongtanphuc2002@gmail.com", "123456", "0347893525", Arrays.asList(EnumTaiKhioan.ADMIN.name()));
            taiKhoanRepository.save(taiKhoan);
        }
    }

}
