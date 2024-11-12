package pe.edu.upc.ecotrack.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ecotrack.entities.Usuarios;
import pe.edu.upc.ecotrack.repositories.IUsuariosRepository;
import pe.edu.upc.ecotrack.serviceinterfaces.IUsuariosService;

import java.util.List;

@Service
public class UsuariosServiceImplement implements IUsuariosService {
    @Autowired
    private IUsuariosRepository uR;
    @Override
    public List<Usuarios> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Usuarios u) {
        uR.save(u);
    }

    @Override
    public Usuarios listId(int id) {
        return uR.findById(id).orElse(new Usuarios());
    }


    @Override
    public void update(Usuarios u) {
        uR.save(u);
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public List<String[]> reporteAgricultorVerPagos(String nombre) {
        return uR.reporteAgricultorVerPagos(nombre);
    }

    @Override
    public List<String[]> quejasporUsuarios() {
        return uR.quejasporUsuarios();
    }

    @Override
    public boolean validarCredenciales(String husername, String hpassword) {
        int usernameCount = uR.buscarUsername(husername);
        int passwordCount = uR.buscarPassword(hpassword);

        if (usernameCount > 0) {
            // Si el nombre de usuario existe, hacemos la comparación de la contraseña
            // Verificamos si la contraseña coincide con la almacenada en la base de datos
            if(passwordCount > 0) {
                return true;
            }
        }

        // Si el nombre de usuario no existe, retornamos falso
        return false;
    }


}
