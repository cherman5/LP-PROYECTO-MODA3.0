package app.sysmoda.servicios.serviceimpl;

import app.sysmoda.modelo.Marca;
import app.sysmoda.modelo.Producto;
import app.sysmoda.repositorio.ProductoRep;
import app.sysmoda.servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImp implements ProductoService {
@Autowired
ProductoRep productoRep;

    @Override
    public List<Producto> findAll() {
        return productoRep.findAll();
    }

    @Override
    public Producto create(Producto producto) {
        return productoRep.save(producto);
    }

    @Override
    public Producto update(Long id, Producto producto) {
        Producto objproduct= productoRep.findById(id).orElseThrow();
        objproduct.setProducto(producto.getProducto());
        objproduct.setMarca(producto.getMarca());
        objproduct.setGenero(producto.getGenero());
        objproduct.setColor(producto.getColor());
        objproduct.setStock(producto.getStock());
        objproduct.setPrecioventa(producto.getPrecioventa());
        objproduct.setCostocompra(producto.getCostocompra());
        return productoRep.save(objproduct);
    }

    @Override
    public void delete(Long id) {
productoRep.deleteById(id);
    }

    @Override
    public Producto updateStock(Long id, Integer stock) {
        Producto producto= productoRep.findById(id).orElseThrow();
        producto.setStock(stock);
        return productoRep.save(producto);
    }
}
