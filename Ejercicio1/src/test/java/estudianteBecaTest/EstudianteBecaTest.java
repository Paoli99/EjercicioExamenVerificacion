package estudianteBecaTest;

import ejercicioRecuperatorio.EstudianteBeca;
import ejercicioRecuperatorio.EstudianteBecaUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EstudianteBecaTest {

    EstudianteBecaUtils objetoMockeado = Mockito.mock(EstudianteBecaUtils.class);

    @Test
    public void verifyBeca(){

    }
    @Test
    public void verifyNoAplicaPromedio(){

    }

    @Test
    public void verifyNoAplicaBeca(){
        Mockito.when(objetoMockeado.getNota(6474638)).thenReturn(89);

        EstudianteBeca estudianteBeca = new EstudianteBeca(objetoMockeado);

        String actualResult = estudianteBeca.estudianteBeca(6474638);
        String expectedResult = "NO APLICA A BECA POR PROMEDIO ACADEMICO";

        Assertions.assertEquals(expectedResult, actualResult, "Error");


    }
}
