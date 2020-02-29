package y.repository;

import java.util.List;

import y.model.Tarjeta;

public interface TarjetaRepository {

	/*
	 * Metodo para crear una tarjeta nueva
	 * */
	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	/*
	 * Metodo para obtener todas las tarjetas
	 * */
	List<Tarjeta> obtenerTodas();
}

