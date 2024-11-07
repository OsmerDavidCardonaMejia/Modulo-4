//Osmer David Cardona Mejia
//NC:202410050140
import java.util.ArrayList;

public class GestorEmpleados 
{
    private ArrayList<Empleado> listaEmpleados;

    public GestorEmpleados() 
    {
        listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) 
    {
        listaEmpleados.add(empleado);
    }

    public void mostrarEmpleados() 
    {
        if (listaEmpleados.isEmpty())
        {
            System.out.println("No hay empleados registrados.");
        } else
        {
            for (Empleado empleado : listaEmpleados)
            {
                empleado.imprimirInformacion();
            }
        }
    }
}
