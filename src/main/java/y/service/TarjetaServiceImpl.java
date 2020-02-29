package y.service;

import java.util.List;

import javax.jws.WebService;

import y.model.Tarjeta;
import y.repository.TarjetaRepository;
import y.repository.TarjetaRepositoryImpl;

@WebService(endpointInterface = "y.service.TarjetaService")
public class TarjetaServiceImpl implements  TarjetaService{
	
	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();

	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		return tarjetaRepository.obtenerTodas();
	}

}
