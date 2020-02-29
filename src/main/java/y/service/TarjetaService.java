package y.service;

import java.util.List;

import javax.jws.WebService;

import y.model.Tarjeta;

@WebService
public interface TarjetaService {

	/*
	 * Metodo para crear una tarjeta nueva
	 * */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	/*
	 * Metodo para obtener todas las tarjetas
	 * */
	List<Tarjeta> obtenerTodas();
	
}
