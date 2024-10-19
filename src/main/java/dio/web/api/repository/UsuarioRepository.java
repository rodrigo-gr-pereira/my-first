package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getLogin()==null)
            throw new BusinessException("O campo logim e obrigatorio");
        if (usuario.getId() == null)
            System.out.println("Save - recebendo usuario na camada repository");
        else
            System.out.println("Save - recebendo usuario na camada repository");

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo id: %d para excluir um usuario", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando usuarios do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("rodrigo","password"));
        usuarios.add(new Usuario("leidiane","masterpass"));
        return usuarios;
    }

    public Usuario findAll(Integer id){
        System.out.println(String.format("FIND/id - Recebendo um id : %d para localizar um usuario", id));
        return new Usuario("rodrigo", "password");
    }

    public Usuario findByUserName(String username){
        System.out.println(String.format("FIND/username - Recebendo um username : %s para localizar um usuario", username));
        return new Usuario("rodrigo", "password");
    }




}
