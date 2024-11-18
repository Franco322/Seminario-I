package sistema_cultivo;

import java.util.List;
public class cargarUsuarios {
	

	public class Main {
	    public static void main(String[] args) {
	        UsuarioService usuarioService = new UsuarioService();
	        List<Usuario> usuarios = usuarioService.cargarUsuarios();

	        if (usuarios.isEmpty()) {
	            System.out.println("No se encontraron usuarios en la base de datos.");
	        } else {
	            System.out.println("Usuarios cargados desde la base de datos:");
	            for (Usuario usuario : usuarios) {
	                System.out.println(usuario);
	            }
	        }
	    }
	}

}
