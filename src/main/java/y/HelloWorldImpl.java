
package y;

import javax.jws.WebService;

@WebService(endpointInterface = "y.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public String sayBye(String nombre) {
		// TODO Auto-generated method stub
		return "Adios: " + nombre;
	}
}

