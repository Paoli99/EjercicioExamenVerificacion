package ejercicioRecuperatorio;



public class EstudianteBeca {
    EstudianteBecaUtils estudianteBecaUtils;
    //EstudianteHelper estudianteHelper;

    public EstudianteBeca() { estudianteBecaUtils = new EstudianteBecaUtils();}

    public EstudianteBeca(EstudianteBecaUtils objetoMockeado) { estudianteBecaUtils = objetoMockeado;}



    //public EstudianteBecaH() { estudianteHelper = new EstudianteHelper();}

    public String estudianteBeca(int ci){
        String msg = "";
            if(estudianteBecaUtils.aplicaBeca(ci)){

                if(estudianteBecaUtils.getNota(ci) >= 90){
                    msg = "SI APLICA A BECA";
                }
                else{
                    msg="NO APLICA A BECA POR PROMEDIO ACADEMICO";
                }
            }
            else{
                msg = "EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS";
            }

        return msg;

    }

}
