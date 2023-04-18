package com.stc.petlove.service.datcho;


import com.stc.petlove.dtos.datcho.DatChoDto;
import com.stc.petlove.entities.DatCho;

import com.stc.petlove.entities.embedded.ThongTinDatCho;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface DatChoService {
    Page<DatCho> filter(String search, int page, int size, String sort, String column);
    DatCho getDatChoByMaDatCho(String maDatCho);
    Optional<DatCho> findById(String Id);
    List<DatCho> getAllDatCho(String search);
    List<DatCho> finfAll();
    DatCho addThongTinDatCho(String id, ThongTinDatCho thongTinDatCho);
    DatCho create(DatChoDto dto);

    DatCho update(String id, DatChoDto dto);

    DatCho changeStatus(String id);
}
