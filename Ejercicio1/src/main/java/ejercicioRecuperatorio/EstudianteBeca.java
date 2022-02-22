package ejercicioRecuperatorio;



public class EstudianteBeca {
    EstudianteBecaUtils estudianteBecaUtils;
    //EstudianteHelper estudianteHelper;

    public EstudianteBeca() { estudianteBecaUtils = new EstudianteBecaUtils();}
    //public EstudianteBecaH() { estudianteHelper = new EstudianteHelper();}

    public String estudianteBeca(int ci){
        String msg = "";
                if(estudianteBecaUtils.aplicaBeca(ci)){


                    if(estudianteBecaUtils.getNota(ci) >= 90){

                    }
                }

        return msg;

    }

}
