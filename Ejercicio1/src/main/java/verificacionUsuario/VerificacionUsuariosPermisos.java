package verificacionUsuario;

public class VerificacionUsuariosPermisos {

    VerificacionUsuariosUtil verificacionUsuariosUtil;

    public VerificacionUsuariosPermisos(){verificacionUsuariosUtil = new VerificacionUsuariosUtil();}

    public VerificacionUsuariosPermisos(VerificacionUsuariosUtil objetoMockeado) { verificacionUsuariosUtil = objetoMockeado;}

    public String getPermisos(String a, String b){
        String msg= "";

        return msg;
    }
}
