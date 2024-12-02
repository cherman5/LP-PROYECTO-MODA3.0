package app.sysmoda.servicios.serviceimpl;

import app.sysmoda.modelo.Color;
import app.sysmoda.repositorio.ColorRep;
import app.sysmoda.servicios.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImp implements ColorService {
    @Autowired
    ColorRep colorRep;

    @Override
    public List<Color> findAll() {
        return colorRep.findAll();
    }
}
