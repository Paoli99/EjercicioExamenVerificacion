package estudianteBecaTest;

import ejercicioRecuperatorio.EstudianteBeca;
import ejercicioRecuperatorio.EstudianteBecaUtils;
import ejercicioRecuperatorio.EstudianteHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class EstudianteBecaTest {

    EstudianteBecaUtils objetoMockeado = Mockito.mock(EstudianteBecaUtils.class);

    /*@BeforeAll
    public static void before(){
        MockedStatic<EstudianteHelper> mocked = Mockito.mockStatic(EstudianteHelper.class);
        mocked.when(()->EstudianteHelper.aplicaBeca(6474638)).thenReturn("True");
        mocked.when(()->EstudianteHelper.aplicaBeca(6474637)).thenReturn("True");
        mocked.when(()->EstudianteHelper.aplicaBeca(11111)).thenReturn("False");
    }*/
    @Test
    public void verifyBeca(){
        Mockito.when(objetoMockeado.getNota(6474638)).thenReturn(91);

        EstudianteBeca estudianteBeca = new EstudianteBeca(objetoMockeado);

        String actualResult = estudianteBeca.estudianteBeca(6474638);
        String expectedResult = "SI APLICA A BECA";

        Assertions.assertEquals(expectedResult, actualResult, "Error");
    }
    @Test
    public void verifyNoAplicaPromedio(){
        Mockito.when(objetoMockeado.getNota(6474637)).thenReturn(89);

        EstudianteBeca estudianteBeca = new EstudianteBeca(objetoMockeado);

        String actualResult = estudianteBeca.estudianteBeca(6474638);
        String expectedResult = "NO APLICA A BECA POR PROMEDIO ACADEMICO";

        Assertions.assertEquals(expectedResult, actualResult, "Error");
        /*EstudianteBeca estudianteBeca = new EstudianteBeca();

        Assertions.assertEquals("NO APLICA A BECA POR PROMEDIO ACADEMICO", estudianteBeca.estudianteBeca(6474637), "Error");*/

    }


    @Test
    public void verifyNoAplicaBeca(){
        EstudianteBeca estudianteBeca = new EstudianteBeca();

        Assertions.assertEquals("EL ESTUDIANTE NO CURSO AUN EL 60% DE LAS MATERIAS", estudianteBeca.estudianteBeca(7474738), "Error");
    }
}
